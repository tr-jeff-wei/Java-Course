package apcs.tw;

import java.util.Scanner;

public class J00000_P4_階梯數字c543 {

      static final int MOD = 1000000007;
      static int dp[][] = new int[100001][10];

      static void countAllOccurance() {
            for (int nDigits = 1; nDigits <= 100000; nDigits++) {
                  for (int d = 9; d >= 1; d--) {
                        //    dp[nDigits][d] ：數字 n 出現在第 nDigits 個位數，它的個數
                        if (nDigits == 1 || d == 9) {
                              dp[nDigits][d] = 1;
                        } else {
                              dp[nDigits][d] = (dp[nDigits][d + 1] + dp[nDigits - 1][d]) % MOD;
                        }
                  }
            }
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            countAllOccurance();
            while (sc.hasNext()) {
                 String N = sc.next();
                  int l = N.length();
                  int ans = 0;
                  int isladder = 1;
                  for (int i = 1; i < l; i++) {
                        if (N.charAt(i) < N.charAt(i - 1)) {
                              isladder = 0;
                              break;
                        }
                  }
                  ans += isladder;
                  //長度為l，則長度為1,2,3,...3,l-1且開頭為1,2,3,...,9都符合答案
                  for (int i = 1; i <= l - 1; i++) {
                        for (int j = 1; j <= 9; j++) {
                              ans += dp[i][j];
                              ans %= MOD;
                        }
                  }
                  //開頭為n，則開頭為n-1,n-2,...,1且長度為l的都符合答案
                  for (int j = 1; j <= N.charAt(0) - '1'; j++) {
                        ans += dp[l][j];
                        ans %= MOD;
                  }
                  //一位位讀取，如果發現遞增，則加上相鄰兩數字間的階梯數字；如果發現遞減則後面都不必檢查了
                  for (int i = 1; i < l; i++) {
                        if (N.charAt(i) >= N.charAt(i - 1)) {
                              for (int j = N.charAt(i - 1) - '0'; j < N.charAt(i) - '0'; j++) {
                                    ans += dp[l - i][j];
                                    ans %= MOD;
                              }
                        } else {
                              break;
                        }
                  }
                  System.out.println(ans);
            }
      }
}
