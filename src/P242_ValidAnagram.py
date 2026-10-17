class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        l = [0] * 26
        for c in s:
            l[ord(c) - 97] += 1
        for c in t:
            l[ord(c) - 97] -= 1
        return not any(l)