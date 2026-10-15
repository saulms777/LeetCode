class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        ms = {}
        mt = {}
        for cs, ct in zip(s, t):
            if cs not in ms:
                ms[cs] = ct
            elif ms[cs] != ct:
                return False
            if ct not in mt:
                mt[ct] = cs
            elif mt[ct] != cs:
                return False
        return True