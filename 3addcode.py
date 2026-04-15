'''import re
def tokenize(expr):
    return re.findall(r'[a-zA-Z]+|\d+|[()+\-*/=]', expr)
class Node:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right
class Parser:
    def __init__(self, tokens):
        self.tokens = tokens
        self.pos = 0
    def current(self):
        return self.tokens[self.pos] if self.pos < len(self.tokens) else None
    def eat(self, token):
        if self.current() == token:
            self.pos += 1
        else:
            raise Exception(f"Expected {token}, got {self.current()}")
    def parse(self):
        left = self.current()
        self.eat(left)
        self.eat('=')
        right = self.expr()
        return Node('=', Node(left), right)
    def expr(self):
        node = self.term()
        while self.current() in ('+', '-'):
            op = self.current()
            self.eat(op)
            node = Node(op, node, self.term())
        return node
    def term(self):
        node = self.factor()
        while self.current() in ('*', '/'):
            op = self.current()
            self.eat(op)
            node = Node(op, node, self.factor())
        return node
    def factor(self):
        token = self.current()
        if token == '(':
            self.eat('(')
            node = self.expr()
            self.eat(')')
            return node
        else:
            self.eat(token)
            return Node(token)
class TACGenerator:
    def __init__(self):
        self.temp_count = 1
        self.code = []
    def new_temp(self):
        temp = f"t{self.temp_count}"
        self.temp_count += 1
        return temp
    def generate(self, node):
        if node.left is None and node.right is None:
            return node.value
        if node.value == '=':
            rhs = self.generate(node.right)
            lhs = node.left.value
            self.code.append(f"{lhs} = {rhs}")
            return lhs
        left = self.generate(node.left)
        right = self.generate(node.right)
        temp = self.new_temp()
        self.code.append(f"{temp} = {left} {node.value} {right}")
        return temp
if __name__ == "__main__":
    expr = input("Enter expression: ")
    tokens = tokenize(expr)
    parser = Parser(tokens)
    ast = parser.parse()
    tac = TACGenerator()
    tac.generate(ast)
    print("\nThree-Address Code:")
    for line in tac.code:
        print(line)
        '''



'''class TargetCodeGenerator:
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
        print(line)'''

class ASTNode:
    def __init__(self, value, left=None, right=None):
        self.value = value  # e.g., '+', '*', or variable names
        self.left = left    # left child (operand)
        self.right = right  # right child (operand)

class IntermediateCodeGenerator:
    def __init__(self):
        self.temp_count = 1
        self.code = []  # For storing quadruples
        self.instructions = []  # For storing triples

    def new_temp(self):
        temp = f"t{self.temp_count}"
        self.temp_count += 1
        return temp

    # Generate quadruples
    def generate_quadruples(self, ast):
        if ast is None:
            return None

        if ast.left is None and ast.right is None:
            return ast.value
        
        left = self.generate_quadruples(ast.left)
        right = self.generate_quadruples(ast.right)
        
        temp = self.new_temp()
        self.code.append(f"({ast.value}, {left}, {right}, {temp})")
        
        return temp

    # Generate triples
    def generate_triples(self, ast):
        if ast is None:
            return None
        
        if ast.left is None and ast.right is None:
            return ast.value
        
        left = self.generate_triples(ast.left)
        right = self.generate_triples(ast.right)
        
        temp = self.new_temp()
        self.instructions.append(f"({ast.value}, {left}, {right})")
        
        return temp

    # Generate indirect triples
    def generate_indirect_triples(self, ast):
        if ast is None:
            return None
        
        if ast.left is None and ast.right is None:
            return ast.value
        
        left = self.generate_indirect_triples(ast.left)
        right = self.generate_indirect_triples(ast.right)
        
        temp = self.new_temp()
        self.instructions.append(f"({ast.value}, {left}, {right})")
        
        return temp

    def get_code(self):
        return self.code, self.instructions


# Example usage
if __name__ == "__main__":
    # Build AST for expression: a = b + c * d
    t1 = ASTNode('*', ASTNode('c'), ASTNode('d'))  # c * d
    t2 = ASTNode('+', ASTNode('b'), t1)  # b + (c * d)
    root = ASTNode('=', ASTNode('a'), t2)  # a = (b + (c * d))

    generator = IntermediateCodeGenerator()
    
    # Generate code for Quadruples, Triples, and Indirect Triples
    generator.generate_quadruples(root)
    generator.generate_triples(root)
    generator.generate_indirect_triples(root)

    quadruples, triples = generator.get_code()

    print("Quadruples:")
    for line in quadruples:
        print(line)

    print("\nTriples:")
    for line in triples:
        print(line)

    print("\nIndirect Triples:")
    for line in triples:
        print(line)

