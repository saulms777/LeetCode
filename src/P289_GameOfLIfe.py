class Solution:
    @staticmethod
    def s(board: list[list[int]], m: int, n: int, i: int, j: int) -> int:
        return sum(sum(n & 1 for n in row[max(0, j - 1):min(n, j + 2)]) for row in board[max(0, i - 1):min(m, i + 2)])

    def gameOfLife(self, board: list[list[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        m = len(board)
        n = len(board[0])
        for i, r in enumerate(board):
            for j, c in enumerate(r):
                if ((self.s(board, m, n, i, j) - c) | c) == 3:
                    board[i][j] |= 2
        for i, r in enumerate(board):
            for j, c in enumerate(r):
                board[i][j] >>= 1