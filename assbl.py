# -----------------------------
# Sample TAC Input
# -----------------------------
tac = [
    "t1 = b * c",
    "t2 = a + t1"
]

# -----------------------------
# Register Management
# -----------------------------
registers = ["R1", "R2", "R3", "R4"]
reg_index = 0

def get_register():
    global reg_index
    reg = registers[reg_index]
    reg_index = (reg_index + 1) % len(registers)
    return reg

# -----------------------------
# Operator → Assembly Mapping
# -----------------------------
op_map = {
    '+': "ADD",
    '-': "SUB",
    '*': "MUL",
    '/': "DIV"
}

# -----------------------------
# TAC → Assembly
# -----------------------------
def generate_assembly(tac):
    assembly = []

    for line in tac:
        # Example: t1 = b * c
        lhs, rhs = line.split('=')
        lhs = lhs.strip()
        parts = rhs.strip().split()

        if len(parts) == 1:
            # Simple assignment: t1 = a
            reg = get_register()
            assembly.append(f"MOV {reg}, {parts[0]}")
            assembly.append(f"MOV {lhs}, {reg}")

        else:
            op1, operator, op2 = parts

            reg = get_register()

            assembly.append(f"MOV {reg}, {op1}")
            assembly.append(f"{op_map[operator]} {reg}, {op2}")
            assembly.append(f"MOV {lhs}, {reg}")

    return assembly

# -----------------------------
# DRIVER
# -----------------------------
assembly_code = generate_assembly(tac)

print("Generated Assembly Code:\n")
for line in assembly_code:
    print(line)