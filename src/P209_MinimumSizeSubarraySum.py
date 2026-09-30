class Solution:
    def minSubArrayLen(self, target: int, nums: list[int]) -> int:
        l = total = 0
        ans = float('inf')
        for r, n in enumerate(nums):
            total += n
            while total >= target:
                ans = min(ans, r - l + 1)
                total -= nums[l]
                l += 1
        return 0 if ans == float('inf') else ans