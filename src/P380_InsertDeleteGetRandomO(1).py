import random

class RandomizedSet:

    def __init__(self):
        self.data = []
        self.idata = {}
        self.length = 0

    def insert(self, val: int) -> bool:
        if val in self.idata:
            return False
        self.data.append(val)
        self.idata[val] = self.length
        self.length += 1
        return True

    def remove(self, val: int) -> bool:
        if val not in self.idata:
            return False
        self.length -= 1
        end = self.data[self.length]
        i = self.idata[val]
        self.data[i] = end
        self.data.pop()
        self.idata[end] = i
        del self.idata[val]
        return True

    def getRandom(self) -> int:
        return random.choice(self.data)


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()