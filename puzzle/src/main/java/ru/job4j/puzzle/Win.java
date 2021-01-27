package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return (vertCheck(board) || horCheck(board));
    }

    public static boolean vertCheck(int[][] board) {
        boolean rsl = false;
        int count;
        for (int i = 0; i < board.length; i++) {
            count = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 1) {
                    count++;
                }
                if (count == 5) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean horCheck(int[][] board) {
        boolean rsl = false;
        int count;
        for (int i = 0; i < board.length; i++) {
            count = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    count++;
                }
                if (count == 5) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

}
