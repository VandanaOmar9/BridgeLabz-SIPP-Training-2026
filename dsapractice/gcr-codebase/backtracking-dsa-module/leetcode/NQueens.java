import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] cols = new int[n];
        backtrack(n, 0, cols, result);
        return result;
    }

    private void backtrack(int n, int row, int[] cols, List<List<String>> result) {
        if (row == n) {
            result.add(buildBoard(n, cols));
            return;
        }

        for (int c = 0; c < n; c++) {
            if (isSafe(row, c, cols)) {
                cols[row] = c;
                backtrack(n, row + 1, cols, result);
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

    private List<String> buildBoard(int n, int[] cols) {
        List<String> board = new ArrayList<>();
        for (int r = 0; r < n; r++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[cols[r]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}