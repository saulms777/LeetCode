class Solution:
    def summaryRanges(self, nums: list[int]) -> list[str]:
        if len(nums) == 0:
            return []
        ret = []
        s = nums[0]
        p = None
        for n in nums:
            if p is not None and p + 1 != n:
                ret.append(f'{s}' if s == p else f'{s}->{p}')
                s = n
            p = n
        ret.append(f'{s}' if s == p else f'{s}->{p}')
        return ret