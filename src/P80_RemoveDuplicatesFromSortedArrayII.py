class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        p, s, j = -10001, False, 0
        for i, n in enumerate(nums):
            if p != n:
                s = True
            elif s:
                s = False
            else:
                continue
            p = n
            nums[j] = n
            j += 1
        return j