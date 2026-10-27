class Solution:
    def findMinArrowShots(self, points: list[list[int]]) -> int:
        points.sort(key=lambda p: p[0])
        a, l, r = 1, float('-inf'), float('inf')
        for i, j in points:
            l, r = max(l, i), min(r, j)
            if l > r:
                a += 1
                l, r = i, j
        return a