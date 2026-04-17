class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        operators = ['+', '-', '*', '/']

        for val in tokens:
            if val not in operators:
                stack.append(int(val))
            elif val == '+':
                stack.append(stack.pop() + stack.pop())
            elif val == '-':
                a, b = stack.pop(), stack.pop()
                stack.append(b - a)
            elif val == '*':
                stack.append(stack.pop() * stack.pop())
            elif val == '/':
                a, b = stack.pop(), stack.pop()
                stack.append(int(b / a))
        
        return stack.pop()