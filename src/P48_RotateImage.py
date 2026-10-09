class Solution:
    def rotate(self, m: list[list[int]]) -> None:
        """
        Do not return anything, modify m in-place instead.
        """
        n = len(m)
        for l in range(n // 2):
            for i in range(n - 2 * l - 1):
                m[l][l+i], m[l+i][n-l-1], m[n-l-1][n-l-1-i], m[n-l-1-i][l] = m[n-l-1-i][l], m[l][l+i], m[l+i][n-l-1], m[n-l-1][n-l-1-i]
