package apcs.tw;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J10907_P1_購物車 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int[] count = new int[101];
            int customer = 0;
            for (int i = 0; i < n; i++) {
                  count = new int[101];
                  while (true) {
                        int k = sc.nextInt();
                        if (k == 0) {
                              break;
                        } else if (k > 0) {
                              count[k]++;
                        } else {
                              count[-k]--;
                        }
                  }
                  if (count[a] > 0 && count[b] > 0) {
                        customer++;
                  }
            }

            System.out.println(customer);

      }
}
