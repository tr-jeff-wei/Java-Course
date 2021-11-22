package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class c013_TriangleWave {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  int x = sc.nextInt();
                  int r = sc.nextInt();
                  question(x, r);
            }
      }

      static void question(int x, int repeat) {
            for (int i = 0; i < repeat; i++) {
                  draw(x);
            }
      }

      static void draw(int x) {
            // 畫 x 行
            for (int i = 1; i <= x; i++) {
                  // i:1 , 2 , 3
                  for (int j = 0; j < i; j++) {
                        System.out.print(i);
                  }
                  System.out.println("");
            }
            // 後半段
            for (int i = x - 1; i >= 1; i--) {
                  // i:1 , 2 , 3
                  for (int j = 0; j < i; j++) {
                        System.out.print(i);
                  }
                  System.out.println();
            }
            System.out.println();
      }
}
