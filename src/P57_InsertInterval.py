class Solution:
    def insert(self, intervals: list[list[int]], newInterval: list[int]) -> list[list[int]]:
        ret = []
        n = len(intervals)
        i = 0
        while i < n and intervals[i][1] < newInterval[0]:
            ret.append(intervals[i])
            i += 1
        while i < n and intervals[i][0] <= newInterval[1]:
            newInterval = [min(newInterval[0], intervals[i][0]), max(newInterval[1], intervals[i][1])]
            i += 1
        ret.append(newInterval)
        while i < n:
            ret.append(intervals[i])
            i += 1
        return ret