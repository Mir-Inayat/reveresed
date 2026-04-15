import re

# -----------------------------
# Operator precedence
# -----------------------------
precedence = {
    '+': 1,
    '-': 1,
    '*': 2,
    '/': 2
}

# -----------------------------
# Infix → Postfix
# -----------------------------
def infix_to_postfix(expression):
    stack = []
    output = []

    tokens = re.findall(r'[a-zA-Z]+|\d+|[()+\-*/]', expression)

    for token in tokens:
        if token.isalnum():  # operand
            output.append(token)

        elif token == '(':
            stack.append(token)

        elif token == ')':
            while stack and stack[-1] != '(':
                output.append(stack.pop())
            stack.pop()

        else:  # operator
            while (stack and stack[-1] != '(' and
                   precedence[stack[-1]] >= precedence[token]):
                output.append(stack.pop())
            stack.append(token)

    while stack:
        output.append(stack.pop())

    return output

# -----------------------------
# Generate Three Address Code
# -----------------------------
def generate_TAC(postfix):
    stack = []
    temp_count = 1
    tac = []

    for token in postfix:
        if token.isalnum():
            stack.append(token)
        else:
            op2 = stack.pop()
            op1 = stack.pop()

            temp = f"t{temp_count}"
            temp_count += 1

            tac.append(f"{temp} = {op1} {token} {op2}")
            stack.append(temp)

    return tac

# -----------------------------
# DRIVER
# -----------------------------
expr = input("Enter expression: ")

postfix = infix_to_postfix(expr)
tac = generate_TAC(postfix)

print("\nPostfix Expression:", " ".join(postfix))
print("\nThree Address Code:")
for line in tac:
    print(line)