class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        length = len(nums)
        triplets = []
        for i, n in enumerate(nums):
            if i > 0 and n == nums[i - 1]:
                continue
            j, k = i + 1, length - 1
            while j < k:
                l, r = nums[j], nums[k]
                if l + r < -n:
                    j += 1
                elif l + r > -n:
                    k -= 1
                else:
                    triplets.append([n, l, r])
                    j += 1
                    while j < k and l == (l := nums[j]):
                        j += 1
        return triplets