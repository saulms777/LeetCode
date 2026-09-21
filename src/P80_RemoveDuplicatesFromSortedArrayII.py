class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        p, s, j = -10001, False, 0
        for n in nums:
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