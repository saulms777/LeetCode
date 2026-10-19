class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        r = []
        h = {}
        i = 0
        for s in strs:
            t = "".join(sorted(s))
            if t in h:
                r[h[t]].append(s)
            else:
                r.append([s])
                h[t] = i
                i += 1
        return r