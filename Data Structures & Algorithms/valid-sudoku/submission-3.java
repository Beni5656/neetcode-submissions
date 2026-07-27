class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][10];
        boolean[][] cols = new boolean[9][10];
        boolean[][] boxes = new boolean[9][10];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '.') continue;
                int value = board[row][col] - '0';

                int boxIndex = (col / 3) + (row / 3) * 3;

                if (rows[row][value] == true) return false;
                if (cols[col][value] == true) return false;
                if (boxes[boxIndex][value] == true) return false;

                rows[row][value] = true;
                cols[col][value] = true;
                boxes[boxIndex][value] = true;
            }
        }

        return true;
    }
}
