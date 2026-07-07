public class Solution289 {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int lives = count(board, m, n, i, j);
                if (board[i][j] == 1 && (lives == 2 || lives == 3)) board[i][j] = 3;
                if (board[i][j] == 0 && lives == 3) board[i][j] = 2;
            }
        }
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) board[i][j] >>= 1;
    }

    private int count(int[][] board, int m, int n, int r, int c) {
        int count = 0;
        for (int i = Math.max(r - 1, 0); i <= Math.min(r + 1, m - 1); i++)
            for (int j = Math.max(c - 1, 0); j <= Math.min(c + 1, n - 1); j++)
                count += board[i][j] & 1;
        return count - (board[r][c] & 1);
    }
}