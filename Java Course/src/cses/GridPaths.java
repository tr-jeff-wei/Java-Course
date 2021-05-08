package cses;


import java.util.Scanner;

public class GridPaths {

      public static void main(String[] args) {

            long mod = 1000000007;
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            long[][] grid = new long[n + 1][n + 1];

            grid[0][1] = 1;
            for (int i = 1; i <= n; i++) {
                  String s = sc.next();
                  for (int j = 1; j <= n; j++) {
                        if (s.charAt(j - 1) != '*') {
                              grid[i][j] += grid[i - 1][j];
                              grid[i][j] += grid[i][j - 1];
                              if( grid[i][j]>mod){
                                    grid[i][j]%=mod ;
                              }
                        }
                  }
            }
            System.out.println(grid[n][n]);

      }

}
