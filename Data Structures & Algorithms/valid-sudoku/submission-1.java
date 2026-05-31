class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxInts = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char currentChar = board[r][c];

                if (currentChar == '.') {
                    continue;
                }

                int currentVal = currentChar - '1';

                int boxIndex = (r / 3) * 3 + (c / 3);

                if (rows[r][currentVal] || cols[c][currentVal] || boxInts[boxIndex][currentVal]) {
                    return false;
                }

                rows[r][currentVal] = true;
                cols[c][currentVal] = true;
                boxInts[boxIndex][currentVal] = true;
            }
        }
        return true;
    }
}
