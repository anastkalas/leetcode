class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int countl = 0; // count the live cells

                if (i > 0 && j > 0 && board[i - 1][j - 1] == 1) countl++;
                if (i > 0 && board[i - 1][j] == 1) countl++;
                if (i > 0 && j < n - 1 && board[i - 1][j + 1] == 1) countl++;
                if (j > 0 && board[i][j - 1] == 1) countl++;
                if (j < n - 1 && board[i][j + 1] == 1) countl++;
                if (i < m - 1 && j > 0 && board[i + 1][j - 1] == 1) countl++;
                if (i < m - 1 && board[i + 1][j] == 1) countl++;
                if (i < m - 1 && j < n - 1 && board[i + 1][j + 1] == 1) countl++;

                if (countl < 2 || countl > 3) {
                    result[i][j] = 0;
                } else if (board[i][j] == 0 && countl == 3) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = board[i][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = result[i][j];
            }
        }
    }
}
