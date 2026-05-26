class Solution:
    def canJump(self, nums: list[int]) -> bool:
        furthest = i = 0
        l = len(nums) - 1
        while i <= furthest:
            if furthest == l:
                return True
            furthest = max(furthest, min(nums[i] + i, l))
            i += 1
        return furthest == l