package zerojudge;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class a455_TOI2010第四題_商品特賣問題 {

      static int[] box;
      static int[] w;
      static int n, m;

      static boolean iddfs(int num, int prev_box) {
            if (num == 0) {
                  return true;
            }
            int start = 1;
            if (prev_box > 0 && w[num] == w[num + 1]) {
                  start = prev_box;
            }
            for (int i = start; i <= n; i++) {
                  if (w[num] > box[i]) {
                        continue;
                  }
                  box[i] -= w[num];
                  boolean result = iddfs(num - 1, i);
                  box[i] += w[num];
                  if (result) {
                        return true;
                  }
            }
            return false;
      }

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            n = sc.nextInt();
            m = sc.nextInt();

            box = new int[n+1];
            w = new int[m+1];
            int boxsum = 0;
            for (int i = 1; i <= n; i++) {
                  box[i] = sc.nextInt();
                  boxsum += box[i];
            }
            for (int i = 1; i <= m; i++) {
                  w[i] = sc.nextInt();
            }
            Arrays.sort(w);
            
            int depth, sum2 = 0;
            for (depth = 1; depth <= m; depth++) {
                  sum2 += w[depth];
                  if (sum2 > boxsum) {
                        break;
                  }
                  if (!iddfs(depth, -1)) {
                        break;
                  }
            }
            System.out.println(depth - 1);

      }

}
/*
4 10
30
40
50
25
15
16
30
18
19
20
21
25
24
17
*/