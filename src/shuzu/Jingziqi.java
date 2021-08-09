package shuzu;

import java.util.Scanner;

public class Jingziqi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];
        boolean n = false;
        int x = 0;
        int o = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println("在" + i + "行" + j + "列下子:");
                board[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < board.length; i++) {
            x = 0;
            o = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    x++;
                } else {
                    o++;
                }
            }
            if (x == SIZE || o == SIZE) {
                n = true;
                break;
            }
        }

        if (!n) {
            for (int i = 0; i < board.length; i++) {
                x = 0;
                o = 0;
                for (int j = 0; j < board[i].length; j++) {
                    if (board[j][i] == 1) {
                        x++;
                    } else {
                        o++;
                    }

                }
                if (x == SIZE || o == SIZE) {
                    n = true;
                    break;
                }
            }
        }

        if (!n) {
            for (int i = 0; i < board.length; i++) {
                x = 0;
                o = 0;
                if (board[i][i] == 1) {
                    x++;
                } else {
                    o++;
                }
                if (x == SIZE || o == SIZE) {
                    n = true;
                    break;
                }
            }
        }

        if (!n) {
            for (int i = 0; i < board.length; i++) {
                x = 0;
                o = 0;
                if (board[i][SIZE - i - 1] == 1) {
                    x++;
                } else {
                    o++;
                }
                if (x == SIZE || o == SIZE) {
                    n = true;
                    break;
                }
            }
        }
        if (n) {
            if (x == SIZE) {
                System.out.println("x赢了");
            } else {
                System.out.println("o赢了");
            }
        }
    }
}
