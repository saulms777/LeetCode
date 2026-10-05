class Solution:
    def isValidSudoku(self, board: list[list[str]]) -> bool:
        v = [[set(("1", "2", "3", "4", "5", "6", "7", "8", "9")) for _ in range(9)] for _ in range(3)]
        for i, r in enumerate(board):
            for j, c in enumerate(r):
                if c == ".":
                    continue
                k = 3 * (i // 3) + j // 3
                if c in v[0][i] and c in v[1][j] and c in v[2][k]:
                    v[0][i].remove(c)
                    v[1][j].remove(c)
                    v[2][k].remove(c)
                else:
                    return False
        return True