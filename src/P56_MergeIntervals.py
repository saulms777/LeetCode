class Solution:
    def merge(self, intervals: list[list[int]]) -> list[list[int]]:
        it = iter(sorted(intervals, key=lambda l: l[0]))
        ret = []
        l, r = next(it)
        for i, j in it:
            if i <= r:
                r = max(j, r)
            else:
                ret.append([l, r])
                l, r = i, j
        ret.append([l, r])
        return ret