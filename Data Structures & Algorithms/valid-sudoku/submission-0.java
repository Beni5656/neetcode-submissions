class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowBoolean = new boolean[9][9];
        boolean[][] colBoolean = new boolean[9][9];
        boolean[][] boxBoolean = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }

                char currentNum = board[r][c];
                int scaledNum = currentNum - '1';
                int boxIndex = (r / 3) * 3 + (c / 3);
                
                if (rowBoolean[r][scaledNum] == true|| colBoolean[c][scaledNum] == true|| boxBoolean[boxIndex][scaledNum] == true) {
                    return false;
                }

                rowBoolean[r][scaledNum] = true;
                colBoolean[c][scaledNum] = true;
                boxBoolean[boxIndex][scaledNum] = true;
            }
        }
        return true;
    }
}
