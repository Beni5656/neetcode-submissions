class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == '.') continue;

                int num = board[r][c] - '1';

                int boxIndex = 3 * (r / 3) + (c / 3);

                if (rows[r][num] == true || cols[c][num] == true || box[boxIndex][num] == true) {
                    return false;
                }

                rows[r][num] = true;
                cols[c][num] = true;
                box[boxIndex][num] = true;
            }
        }

        return true;

    }
}
