class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        p, j = -101, 0
        for n in nums:
            if p != n:
                p = n
                nums[j] = n
                j += 1
        return j