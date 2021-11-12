
package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class b572_忘了東西的傑克 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                  // 讀現在時間
                  int hr = sc.nextInt();
                  int min = sc.nextInt();
                  int now = hr * 60 + min;

                  // 讀公車時間
                  int bhr = sc.nextInt();
                  int bmin = sc.nextInt();
                  int bus = bhr * 60 + bmin;

                  // 拿東西時間
                  int cost = sc.nextInt();

                  if (now + cost > bus) {
                        System.out.println("No");
                  } else {
                        System.out.println("Yes");
                  }
            }
      }
}
