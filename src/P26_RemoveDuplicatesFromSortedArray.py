class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        p, j = -101, 0
        for i, n in enumerate(nums):
            if p != n:
                p = n
                nums[j] = n
                j += 1
        return j