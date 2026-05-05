class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        j = 0
        for i, n in enumerate(nums):
            if n != val:
                nums[j] = n
                j += 1
        return j