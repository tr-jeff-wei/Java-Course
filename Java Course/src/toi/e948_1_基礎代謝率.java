package toi;

import java.util.Scanner;

public class e948_1_基礎代謝率 {
      
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {

                  int g = sc.nextInt();
                  int age = sc.nextInt();
                  int height = sc.nextInt();
                  int weight = sc.nextInt();

                  // BMR(男) = (13.7×體重(kg)) + (5.0×身高(cm)) - (6.8×年齡) + 66。
                  // BMR(女) = (9.6×體重(kg)) + (1.8×身高(cm)) - (4.7×年齡) + 655。
                  double BMR = 0.0;
                  if (g == 1) {
                        BMR = 13.7 * weight + 5.0 * height - 6.8 * age + 66;
                  } else {
                        BMR = 9.6 * weight + 1.8 * height - 4.7 * age + 655;
                  }
                  BMR = Math.round(BMR * 100) / 100.0;
                  System.out.printf("%.2f\n", BMR); // %.2f ==>把 BMR 印到小數第二位
            }

      }
}
