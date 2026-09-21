class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        profit = 0
        buy = 10001
        for p in prices:
            if p < buy:
                buy = p
            elif p - buy > profit:
                profit = p - buy
        return profit