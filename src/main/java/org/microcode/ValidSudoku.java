package org.microcode;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] squares = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            cols[i] = new HashSet<>();
            rows[i] = new HashSet<>();
            squares[i] = new HashSet<>();

        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                if (rows[r].contains(board[r][c]) ||
                cols[c].contains(board[r][c]) ||
                squares[(r / 3) * 3 + c / 3].contains(board[r][c])) {
                    return false;
                }
                rows[r].add(board[r][c]);
                cols[c].add(board[r][c]);
                squares[(r / 3) * 3 + c / 3].add(board[r][c]);
            }

        }
        return true;
    }
}
