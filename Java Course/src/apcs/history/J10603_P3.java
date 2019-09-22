package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class J10603_P3 {

    static final int LEFT = 0;
    static final int UP = 1;
    static final int RIGHT = 2;
    static final int DOWN = 3;

    public static void main(String[] args) {

        String input = "5\n" +
                "0\n" +
                "3 4 2 1 4\n" +
                "4 2 3 8 9\n" +
                "2 1 9 5 6\n" +
                "4 2 3 7 8\n" +
                "1 2 6 4 3\n" +
                "";

//        input = "3\n" +
//                "1\n" +
//                "4 1 2\n" +
//                "3 0 5\n" +
//                "6 7 8\n" +
//                "";

        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int direction = sc.nextInt();

        int[][] matrix = new int[n][n];
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                matrix[x][y] = sc.nextInt();
            }
        }

        int startx = n / 2;
        int starty = startx;

        int[] first = firstStep(matrix, startx, starty, direction);
        startx = first[0];
        starty = first[1];
        direction = first[2];

        while (true) {

            int[] next = goToNext(matrix, startx, starty, direction);
            if (next == null) {
                break;
            }
            startx = next[0];
            starty = next[1];
            direction = next[2];
        }
    }

    static int[] firstStep(int[][] matrix, int x, int y, int direction) {

        // 先印出現在的內容
        System.out.print(matrix[x][y]);
        // 走過用-1蓋掉
        matrix[x][y] = -1;

        // 先檢查目標方向的右轉彎，如果不能走再往前
        int[] next = new int[3];
        switch (direction) {
            case UP:
                next[0] = x;
                next[1] = y - 1;
                next[2] = UP;
                return next;
            case RIGHT:
                next[0] = x + 1;
                next[1] = y;
                next[2] = RIGHT;
                return next;
            case DOWN:
                next[0] = x;
                next[1] = y + 1;
                next[2] = DOWN;
                return next;
            case LEFT:
                next[0] = x - 1;
                next[1] = y;
                next[2] = LEFT;
                return next;
        }
        return null;
    }

    static int[] goToNext(int[][] matrix, int x, int y, int direction) {

        if (x < 0 || y < 0 || x >= matrix.length || y >= matrix.length) {
            return null;
        }

        // 先印出現在的內容
        System.out.print(matrix[x][y]);
        // 走過用-1蓋掉
        matrix[x][y] = -1;

        // 先檢查目標方向的右轉彎，如果不能走再往前
        int[] next = new int[3];
        switch (direction) {
            case UP:
                if (matrix[x + 1][y] != -1) {
                    // 往右
                    next[0] = x + 1;
                    next[1] = y;
                    next[2] = RIGHT;
                } else {
                    // 往前
                    next[0] = x;
                    next[1] = y - 1;
                    next[2] = UP;
                }
                return next;
            case RIGHT:
                if (matrix[x][y + 1] != -1) {
                    // 往右
                    next[0] = x;
                    next[1] = y + 1;
                    next[2] = DOWN;
                } else {
                    // 往前
                    next[0] = x + 1;
                    next[1] = y;
                    next[2] = RIGHT;
                }
                return next;
            case DOWN:
                if (matrix[x - 1][y] != -1) {
                    // 往右
                    next[0] = x - 1;
                    next[1] = y;
                    next[2] = LEFT;
                } else {
                    // 往前
                    next[0] = x;
                    next[1] = y + 1;
                    next[2] = DOWN;
                }
                return next;
            case LEFT:
                if (matrix[x][y - 1] != -1) {
                    // 往右
                    next[0] = x;
                    next[1] = y - 1;
                    next[2] = UP;
                } else {
                    // 往前
                    next[0] = x - 1;
                    next[1] = y;
                    next[2] = LEFT;
                }
                return next;

        }
        return null;
    }

}
