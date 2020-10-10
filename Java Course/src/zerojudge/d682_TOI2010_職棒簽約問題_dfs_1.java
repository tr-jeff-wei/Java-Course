package zerojudge;

import java.util.Scanner;

public class d682_TOI2010_職棒簽約問題_dfs_1 {

      static int maxTotal = 0;
      static int[][] price;
      static int[][] ap;
      static int maxAp = 0;

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            maxTotal = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();

            // 允許某一組沒有選人，把最後一個位置當作空選項，所以 +1
            price = new int[r][c + 1];
            ap = new int[r][c + 1];

            for (int i = 0; i < r; i++) {
                  for (int j = 0; j < c; j++) {
                        price[i][j] = sc.nextInt();
                        ap[i][j] = sc.nextInt();
                  }
            }           
            find(0, 0, 0);
            System.out.println(maxAp);

      }

      public static void find(int preTotal, int preAp, int level) {
            for (int j = 0; j < price[level].length; j++) {
                  int total = price[level][j] + preTotal;
                  if (total > maxTotal) {
                        continue;
                  }

                  // last level
                  int finalAp = ap[level][j] + preAp;
                  if (level == price.length - 1) {
                        if (finalAp > maxAp) {
                              maxAp = finalAp;
                        }
                  } else {
                        find(total, finalAp, level + 1);
                  }

            }
      }
}
