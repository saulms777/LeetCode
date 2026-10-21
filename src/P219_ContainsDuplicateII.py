class Solution:
    def containsNearbyDuplicate(self, nums: list[int], k: int) -> bool:
        s = {}
        for i, n in enumerate(nums):
            if n in s and i - s[n] <= k:
                return True
            s[n] = i
        return False