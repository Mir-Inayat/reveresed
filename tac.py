class TargetCodeGenerator:
    def __init__(self):
        self.code = []
    def generate(self, tac_lines):
        for line in tac_lines:
            parts = line.split()
            if len(parts) == 5:
                result = parts[0]
                arg1 = parts[2]
                op = parts[3]
                arg2 = parts[4]
                self.code.append(f"LOAD {arg1}")
                if op == '+':
                    self.code.append(f"ADD {arg2}")
                elif op == '-':
                    self.code.append(f"SUB {arg2}")
                elif op == '*':
                    self.code.append(f"MUL {arg2}")
                elif op == '/':
                    self.code.append(f"DIV {arg2}")

                self.code.append(f"STORE {result}")
            elif len(parts) == 3:
                result = parts[0]
                arg = parts[2]
                self.code.append(f"LOAD {arg}")
                self.code.append(f"STORE {result}")
        return self.code
if __name__ == "__main__":
    tac = [
        "t1 = c * d",
        "t2 = b + t1",
        "a = t2"]
    generator = TargetCodeGenerator()
    target_code = generator.generate(tac)
    print("Target Code:\n")
    for line in target_code:
        print(line)