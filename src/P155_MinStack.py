from collections import deque

class MinStack:

    def __init__(self):
        self.s = deque()
        self.m = deque()

    def push(self, value: int) -> None:
        self.s.append(value)
        if not self.m or value <= self.m[-1]:
            self.m.append(value)

    def pop(self) -> None:
        if self.s[-1] == self.m[-1]:
            self.m.pop()
        self.s.pop()

    def top(self) -> int:
        return self.s[-1]

    def getMin(self) -> int:
        return self.m[-1]