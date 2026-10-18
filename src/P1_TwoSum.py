class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        m = {}
        for i, n in enumerate(nums):
            if n in m:
                return [i, m[n]]
            m[target - n] = i
        return []