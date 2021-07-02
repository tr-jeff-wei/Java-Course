package zerojudge;

import java.util.Arrays;
import java.util.Scanner;

public class a417_螺旋矩陣 {

    // 右下左上
    static int[][] direction = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int dim = sc.nextInt();
            int dir = sc.nextInt();
            showArray(new int[dim][dim], dir);
        }

    }

    public static void showArray(int[][] data, int dir) {

        int len = data.length;

        int myDir;
        if (dir == 1) {
            myDir = 0; // 順
        } else {
            myDir = 1; // 反
        }

        int n = 1;
        int i = 0;
        int j = 0;
        int maxN = len * len;
        while (n <= maxN) {

            data[i][j] = n;

            // next step
            int ni = i + direction[0][myDir];
            int nj = j + direction[1][myDir];
            // check next step
            if (ni >= 0 && nj >= 0 && ni < data.length && nj < data.length && data[ni][nj] == 0) {

            } else {
                if (dir == 1) {
                    myDir++; // 轉方向
                    if (myDir >= 4) {
                        myDir -= 4;
                    }
                } else {
                    myDir--;
                    if (myDir < 0) {
                        myDir += 4;
                    }
                }

                ni = i + direction[0][myDir];
                nj = j + direction[1][myDir];

            }
            i = ni;
            j = nj;
            n++;

        }

        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {

                System.out.printf("%5d", data[row][col]);

            }
            System.out.println();
        }
        System.out.println();

    }
}
