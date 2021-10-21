package zerojudge;

import java.util.ArrayList;
import java.util.Scanner;

public class a216_數數愛明明 {

      static long[] f = new long[30000 + 1];
      static long[] g = new long[30000 + 1];

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            while (sc.hasNextInt()) {
                  int n = sc.nextInt();
                  System.out.println(f(n) + " " + g(n));
            }

      }

      public static void main1(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            int max = -1;
            while (sc.hasNextInt()) {
                  int n = sc.nextInt();
                  list.add(n);
                  if (n > max) {
                        max = n;
                  }
            }

            long[] f = new long[max + 1];
            long[] g = new long[max + 1];
            f[1] = g[1] = 1;
            // 先計算 f ，再算 g
            for (int i = 2; i < f.length; i++) {
                  f[i] = i + f[i - 1];
                  g[i] = f[i] + g[i - 1];
            }
            for (Integer n : list) {
                  System.out.println(f[n] + " " + g[n]);
            }

      }

      // 遞迴方法：函式 f
      static long f(int n) {

            if (f[n] != 0) {
                  return f[n];
            }

            if (n == 1) {
                  f[1] = 1;
                  return 1;
            }

            long ans = n + f(n - 1);
            f[n] = ans;
            return ans;
      }

      // 遞迴方法：函式 g
      static long g(int n) {
            if (g[n] != 0) {
                  return g[n];
            }
            if (n == 1) {
                  g[1] = 1;
                  return 1;
            }

            long ans = f(n) + g(n - 1);
            g[n] = ans;
            return ans;

      }
}
