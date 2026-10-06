class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        LinkedList<Integer> s = new LinkedList<>();
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1;
        int i = 0, j = 0;
        while (true) {
            while (j < r) s.add(matrix[i][j++]);
            if (++t > b) break;
            while (i < b) s.add(matrix[i++][j]);
            if (l > --r) break;
            while (j > l) s.add(matrix[i][j--]);
            if (t > --b) break;
            while (i > t) s.add(matrix[i--][j]);
            if (++l > r) break;
        }
        s.add(matrix[i][j]);
        return s;
    }
}