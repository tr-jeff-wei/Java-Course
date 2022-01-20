package apcs.tw;

import java.util.Arrays;
import java.util.Scanner;

public class J11011_P3_g597_生產線 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int nRange = sc.nextInt();
            int[] diff = new int[n + 2];
            for (int i = 0; i < nRange; i++) {
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  int m = sc.nextInt();
                  diff[a] += m;
                  diff[b + 1] -= m;
            }
            for (int i = 1; i < diff.length; i++) {
                  diff[i] += diff[i - 1];
            }
            int[] mtime = new int[n + 2];
            for (int i = 1; i <= n; i++) {
                  mtime[i] = sc.nextInt();
            }

            Arrays.sort(diff);
            Arrays.sort(mtime);

            long total = 0;
            int ti = diff.length - 1;
            int ai = 2;
            for (int i = 0; i < n; i++) {
                  total += mtime[ti] * diff[ai];
                  ti--;
                  ai++;
            }

            System.out.println(total);

      }
}
