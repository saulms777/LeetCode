from collections import deque


class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        dp = deque([1])
        p = 1
        for i in nums[:-1]:
            p *= i
            dp.append(p)

        dp2 = deque([1])
        p = 1
        for i in nums[:0:-1]:
            p *= i
            dp2.appendleft(p)
        
        return [n1 * n2 for n1, n2 in zip(dp, dp2)]