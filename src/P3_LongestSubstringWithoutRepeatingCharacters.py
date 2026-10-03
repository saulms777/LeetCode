class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = {}
        longest = l = 0
        for i, c in enumerate(s):
            if c in seen:
                longest = max(longest, i - l)
                l = max(l, seen[c] + 1)
            seen[c] = i
        return max(longest, len(s) - l)