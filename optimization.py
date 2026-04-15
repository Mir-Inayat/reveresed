def optimize_code(code):
    optimized = []
    constants = {}
    copies = {}
    expressions = {}

    for line in code:
        left, right = line.split("=")
        left = left.strip()
        right = right.strip()

        # Constant propagation(2)
        for var in constants:
            right = right.replace(var, str(constants[var]))

        # Copy propagation(3)
        if right in copies:
            right = copies[right]

        # Constant folding (1)(4)
        try:
            value = eval(right)
            constants[left] = value
            optimized.append(f"{left} = {value}")
        except:
            optimized.append(f"{left} = {right}")

            # Copy propagation case
            if right.isalpha():
                copies[left] = right
    print("optimized",optimized)

    final_code = []
    for line in optimized:
        left, right = line.split("=")
        left = left.strip()
        right = right.strip()

        if right in expressions:
            final_code.append(f"{left} = {expressions[right]}")
        else:
            expressions[right] = left
            final_code.append(line)
    print("CSE",final_code)
    used = set()
    for line in final_code:
        parts = line.split("=")[1].split()
        for p in parts:
            if p.isalpha():
                used.add(p)

    dead_removed = []
    for line in final_code:
        left = line.split("=")[0].strip()
        if left in used or left == final_code[-1].split("=")[0].strip():
            dead_removed.append(line)

    return dead_removed


code = [
    "a = 2 + 3",
    "b = a",
    "c = b + 4",
    "d = 2 + 3",
    "e = d + 4",
    "f = e",
    "g = f"
]

result = optimize_code(code)

print("Optimized Code:\n")
for line in result:
    print(line)