public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int idx, int r, int c) {
        if (idx == word.length()) return true;
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) return false;
        if (board[r][c] != word.charAt(idx)) return false;

        char temp = board[r][c];
        board[r][c] = '#'; // Mark as visited in-place

        boolean found = dfs(board, word, idx + 1, r + 1, c)
                     || dfs(board, word, idx + 1, r - 1, c)
                     || dfs(board, word, idx + 1, r, c + 1)
                     || dfs(board, word, idx + 1, r, c - 1);

        board[r][c] = temp; // Restore state
        return found;
    }
}