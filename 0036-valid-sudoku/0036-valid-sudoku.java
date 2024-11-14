class Solution {
    public boolean isValidSudoku(final char[][] board) {
        final int[] h = new int[9], l = new int[9], d = new int[9];

        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[i].length; ++j) {
                if(board[i][j] != '.') {
                    int bitmask = 1 << board[i][j] - '1';
                    if((h[i] & bitmask) > 0 || (l[j] & bitmask) > 0 || (d[i / 3 + j / 3 * 3] & bitmask) > 0)
                        return false;

                    h[i] |= bitmask;
                    l[j] |= bitmask;
                    d[i / 3 + j / 3 * 3] |= bitmask;
                }
            }
        }

        return true;
   }
}