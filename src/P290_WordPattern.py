class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        l = s.split()
        if len(pattern) != len(l):
            return False
        fm = {}
        bm = {}
        for p, w in zip(pattern, l):
            if p not in fm:
                fm[p] = w
            elif fm[p] != w:
                return False
            if w not in bm:
                bm[w] = p
            elif bm[w] != p:
                return False
        return True