class Solution:
    def isHappy(self, n: int) -> bool:
        v = set()
        while n != 1:
            if n in v:
                return False
            v.add(n)
            t = n
            n = 0
            while t != 0:
                n += (t % 10) ** 2
                t //= 10
        return True