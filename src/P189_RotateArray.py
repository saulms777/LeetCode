class Solution:
    def reverse(self, nums: list[int], l: int, r: int) -> None:
        while l < r:
            t = nums[l]
            nums[l] = nums[r]
            nums[r] = t
            l += 1
            r -= 1

    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = k % n
        self.reverse(nums, 0, n - k - 1)
        self.reverse(nums, n - k, n - 1)
        self.reverse(nums, 0, n - 1)