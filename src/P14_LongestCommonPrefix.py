class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        s = []
        for l in zip(*strs):
            if len(set(l)) == 1:
                s.append(l[0])
            else:
                break
        return "".join(s)
