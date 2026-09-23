class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s

        cycle = 2 * numRows - 2
        rows = [[] for _ in range(numRows)]
        for i, c in enumerate(s):
            mod = i % cycle
            if mod < numRows:
                rows[mod].append(c)
            else:
                rows[cycle - mod].append(c)
        return "".join(["".join(l) for l in rows])