class Solution:
    def setZeroes(self, matrix: list[list[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        r = set()
        c = set()
        for i, m in enumerate(matrix):
            for j, n in enumerate(m):
                if n == 0:
                    r.add(i)
                    c.add(j)
        for i in r:
            matrix[i] = [0] * len(matrix[i])
        for j in c:
            for i in range(len(matrix)):
                matrix[i][j] = 0