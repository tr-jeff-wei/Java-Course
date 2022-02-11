package zerojudge;

import java.util.Scanner;

public class b860_獨角蟲進化計算器 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int candy = sc.nextInt();
            int weedle = sc.nextInt();
            int kakuna = 0;

            int evolve = 0;
            while (weedle > 0) {
                  if (candy >= 12) {
                        // 進化
                        candy = candy - 12 + 1;
                        weedle--;
                        evolve++;
                        kakuna++;
                  } else {
                        if (kakuna > 0) {
                              // 鐵殼蛹給教授
                              kakuna--;
                        } else {
                              // 獨角蟲給教授
                              weedle--;
                        }

                        candy++;
                  }
            }
            System.out.println(evolve);

      }

}
