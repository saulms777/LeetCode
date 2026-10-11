class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        l = defaultdict(int)
        for c in magazine:
            l[c] += 1
        for c in ransomNote:
            if c in l and l[c] > 0:
                l[c] -= 1
            else:
                return False
        return True