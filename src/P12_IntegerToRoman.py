class Solution:
    def intToRoman(self, num: int) -> str:
        s = []

        n = num // 1000
        s.extend(["M"] * n)

        num %= 1000
        n = num // 100
        s.extend(
            ["C", "M"] if n == 9 else
            ["D", *("C" * (n - 5))] if n >= 5 else
            ["C", "D"] if n == 4 else
            ["C"] * n
        )

        num %= 100
        n = num // 10
        s.extend(
            ["X", "C"] if n == 9 else
            ["L", *("X" * (n - 5))] if n >= 5 else
            ["X", "L"] if n == 4 else
            ["X"] * n
        )

        num %= 10
        s.extend(
            ["I", "X"] if num == 9 else
            ["V", *("I" * (num - 5))] if num >= 5 else
            ["I", "V"] if num == 4 else
            ["I"] * num
        )
        
        return "".join(s)