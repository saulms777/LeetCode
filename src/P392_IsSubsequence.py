class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if not s:
            return True

        i = iter(s)
        curr = next(i)
        for c in t:
            if c == curr:
                curr = next(i, -1)
                if curr == -1:
                    return True
        return False