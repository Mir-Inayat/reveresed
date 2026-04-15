from collections import defaultdict, deque

# -----------------------------
# Grammar (Expression Grammar)
# -----------------------------
productions = [
    ("E'", ["E"]),
    ("E", ["E", "+", "T"]),
    ("E", ["T"]),
    ("T", ["T", "*", "F"]),
    ("T", ["F"]),
    ("F", ["(", "E", ")"]),
    ("F", ["id"])
]

non_terminals = set(lhs for lhs, _ in productions)
terminals = set()

for _, rhs in productions:
    for sym in rhs:
        if sym not in non_terminals:
            terminals.add(sym)

terminals.add('$')

# -----------------------------
# FOLLOW SETS
# -----------------------------
FOLLOW = defaultdict(set)

def compute_follow():
    FOLLOW["E'"].add('$')
    changed = True

    while changed:
        changed = False
        for lhs, rhs in productions:
            for i, B in enumerate(rhs):
                if B in non_terminals:
                    before = len(FOLLOW[B])

                    if i + 1 < len(rhs):
                        beta = rhs[i+1]
                        if beta in terminals:
                            FOLLOW[B].add(beta)
                        else:
                            pass
                    else:
                        FOLLOW[B] |= FOLLOW[lhs]

                    if len(FOLLOW[B]) != before:
                        changed = True

# -----------------------------
# LR(0) Closure
# -----------------------------
def closure(items):
    closure_set = set(items)

    while True:
        new_items = set()
        for (lhs, rhs, dot) in closure_set:
            if dot < len(rhs):
                B = rhs[dot]
                if B in non_terminals:
                    for prod_lhs, prod_rhs in productions:
                        if prod_lhs == B:
                            new_items.add((B, tuple(prod_rhs), 0))

        if new_items.issubset(closure_set):
            break

        closure_set |= new_items

    return frozenset(closure_set)

# -----------------------------
# GOTO
# -----------------------------
def goto(items, symbol):
    moved = set()
    for (lhs, rhs, dot) in items:
        if dot < len(rhs) and rhs[dot] == symbol:
            moved.add((lhs, rhs, dot+1))
    return closure(moved)

# -----------------------------
# Canonical Collection
# -----------------------------
def canonical_collection():
    C = []
    start = closure({("E'", tuple(["E"]), 0)})
    C.append(start)

    queue = deque([start])
    transitions = {}

    while queue:
        I = queue.popleft()
        for symbol in terminals.union(non_terminals):
            G = goto(I, symbol)
            if G:
                if G not in C:
                    C.append(G)
                    queue.append(G)
                transitions[(C.index(I), symbol)] = C.index(G)

    return C, transitions

# -----------------------------
# Construct SLR Table
# -----------------------------
def construct_slr_table(C, transitions):
    ACTION = defaultdict(dict)
    GOTO = defaultdict(dict)

    for i, I in enumerate(C):
        for (lhs, rhs, dot) in I:

            # SHIFT
            if dot < len(rhs):
                a = rhs[dot]
                if a in terminals:
                    j = transitions.get((i, a))
                    if j is not None:
                        ACTION[i][a] = f"s{j}"

            # REDUCE / ACCEPT
            else:
                if lhs == "E'":
                    ACTION[i]['$'] = "acc"
                else:
                    prod_index = productions.index((lhs, list(rhs)))
                    for a in FOLLOW[lhs]:
                        ACTION[i][a] = f"r{prod_index}"

        # GOTO
        for A in non_terminals:
            j = transitions.get((i, A))
            if j is not None:
                GOTO[i][A] = j

    return ACTION, GOTO

# -----------------------------
# PRINT STATES
# -----------------------------
def print_states(C):
    for i, state in enumerate(C):
        print(f"\nState I{i}:")
        for lhs, rhs, dot in state:
            rhs = list(rhs)
            rhs.insert(dot, ".")
            print(f"{lhs} -> {' '.join(rhs)}")

# -----------------------------
# PRINT TABLE (VISUAL)
# -----------------------------
def print_table(ACTION, GOTO, C):
    print("\n\nSLR PARSING TABLE\n")

    terms = sorted(terminals)
    nts = sorted(non_terminals - {"E'"})

    # Header
    print(f"{'State':6}", end="")
    for t in terms:
        print(f"{t:10}", end="")
    for nt in nts:
        print(f"{nt:10}", end="")
    print()

    print("-" * (6 + 10 * (len(terms) + len(nts))))

    # Rows
    for i in range(len(C)):
        print(f"{i:<6}", end="")

        # ACTION
        for t in terms:
            val = ACTION[i].get(t, "")
            print(f"{val:10}", end="")

        # GOTO
        for nt in nts:
            val = GOTO[i].get(nt, "")
            print(f"{str(val):10}", end="")

        print()

# -----------------------------
# DRIVER
# -----------------------------
compute_follow()

C, transitions = canonical_collection()

print_states(C)

ACTION, GOTO = construct_slr_table(C, transitions)

print_table(ACTION, GOTO, C)