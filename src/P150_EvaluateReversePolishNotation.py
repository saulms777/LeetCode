from collections import deque

class Solution:
    def evalRPN(self, tokens: list[str]) -> int:
        s = deque()
        for t in tokens:
            match t:
                case '+':
                    s.append(s.pop() + s.pop())
                case '-':
                    s.append(-s.pop() + s.pop())
                case '*':
                    s.append(s.pop() * s.pop())
                case '/':
                    b = s.pop()
                    s.append(int(s.pop() / b))
                case _:
                    s.append(int(t))
        return s.pop()