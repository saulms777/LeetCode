class Solution:
    def jump(self, nums: list[int]) -> int:
        jumps = end = furthest = 0
        for i in range(len(nums) - 1):
            furthest = max(furthest, nums[i] + i)
            if i == end:
                jumps += 1
                end = furthest
                if furthest >= len(nums) - 1:
                    break
        return jumps