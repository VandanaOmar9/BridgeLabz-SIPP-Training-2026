public class NQueensII {
    private int count = 0;

    public int totalNQueens(int n) {
        count = 0;
        int[] cols = new int[n];
        backtrack(n, 0, cols);
        return count;
    }

    private void backtrack(int n, int row, int[] cols) {
        if (row == n) {
            count++;
            return;
        }

        for (int c = 0; c < n; c++) {
            if (isSafe(row, c, cols)) {
                cols[row] = c;
                backtrack(n, row + 1, cols);
            }
        }
    }

    private boolean isSafe(int row, int col, int[] cols) {
        for (int r = 0; r < row; r++) {
            if (cols[r] == col) return false;
            if (Math.abs(cols[r] - col) == Math.abs(r - row)) return false;
        }
        return true;
    }
}