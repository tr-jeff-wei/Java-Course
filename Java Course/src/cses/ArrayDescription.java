package cses;

import java.util.Scanner;

public class ArrayDescription {

      static int mod = 1000000000 + 7;

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] grid = new int[n + 1][m + 2];

            int a = sc.nextInt();
            if (a == 0) {
                  for (int j = 1; j <= m; j++) {
                        grid[1][j] = 1;
                  }
            } else {
                  grid[1][a] = 1;
            }

            for (int i = 2; i <= n; i++) {
                  int x = sc.nextInt();

                  if (x == 0) {
                        for (int j = 1; j <= m; j++) {
                              grid[i][j] += grid[i - 1][j - 1];
                              grid[i][j] %= mod;
                              grid[i][j] += grid[i - 1][j];
                              grid[i][j] %= mod;
                              grid[i][j] += grid[i - 1][j + 1];
                              grid[i][j] %= mod;
                        }
                  } else {
                        grid[i][x] += grid[i - 1][x - 1];
                        grid[i][x] %= mod;
                        grid[i][x] += grid[i - 1][x];
                        grid[i][x] %= mod;
                        grid[i][x] += grid[i - 1][x + 1];
                        grid[i][x] %= mod;
                  }

            }

            int ans = 0;
            for (int i = 1; i <= m; i++) {
                  ans += grid[n][i];
                  ans %= mod;
            }
            System.out.println(ans);

      }
}
