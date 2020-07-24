package apcs.tw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class J10603_P3_數字龍捲風_better {

      public static void main(String[] args) {

            String input = "5\n"
                    + "0\n"
                    + "3 4 2 1 4\n"
                    + "4 2 3 8 9\n"
                    + "2 1 9 5 6\n"
                    + "4 2 3 7 8\n"
                    + "1 2 6 4 3\n"
                    + "";

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

            //其中 0代表左 、1代表上 、2代表右 、3代表下
            int direction = sc.nextInt();

            int[][] matrix = new int[n][n];
            for (int r = 0; r < n; r++) {
                  for (int c = 0; c < n; c++) {
                        matrix[r][c] = sc.nextInt();
                  }
            }

            // 左移、上移、右移、下移
            int[] mc = new int[]{-1, 0, 1, 0};
            int[] mr = new int[]{0, -1, 0, 1};

            int pc = n / 2;
            int pr = n / 2;
            System.out.print(matrix[pr][pc]);

            for (int steps = 1;; steps++) {
                  // 同一個方向要走 2 次
                  for (int repeatSteps = 0; repeatSteps < 2; repeatSteps++) {

                        for (int s = 0; s < steps; s++) {
                              pc += mc[direction];
                              pr += mr[direction];
                              if (pc < 0 || pr < 0 || pc == n || pr == n) {
                                    System.out.println();
                                    return ;
                              }
                              System.out.print(matrix[pr][pc]);
                        }
                        // 換方向
                        direction++;
                        direction = direction % 4;
                  }

            }

      }

}
