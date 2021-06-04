//package cses;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class CoinCombinationsI {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int target = sc.nextInt();

            int MOD = 1000000007;

            //-------------- coins
            int[] coins = new int[n];
            for (int i = 0; i < n; i++) {
                  coins[i] = sc.nextInt();

            }
            Arrays.sort(coins);
            // -----------------------------

            int[] dp = new int[target + 1];
       
            dp[0] = 1;
            for (int t = 0; t < target; t++) {
                  if (dp[t] ==0) {
                        continue;
                  }
                  for (int coin : coins) {
                        int r = t + coin;
                        if (r > target) {
                              break;
                        }
                        dp[r] += dp[t];
                        dp[r] %= MOD;
                  }

            }

            if (dp[target] == -1) {
                  System.out.println(0);
            } else {
                  System.out.println(dp[target]);
            }

      }

}
