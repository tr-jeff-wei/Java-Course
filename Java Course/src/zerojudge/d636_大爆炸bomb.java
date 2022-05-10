
package zerojudge;

import java.util.Scanner;

public class d636_大爆炸bomb {
      
      static int MOD = 10007 ;
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            long a = sc.nextLong() ;        
            long b = sc.nextLong() ;
            System.out.println( pow( a , b ));
      }
      
      static long pow(long x, long pow) {

        // 終止條件
        if (pow == 1) {
            return x;
        }

        if (pow % 2 == 0) {
            // 偶數次
            long half = pow / 2;
            long res = pow(x, half);
            long ans = res * res;
            ans = ans % MOD;
            return ans;
        } else {
            // 奇數次
            long pow2 = pow - 1;
            long half = pow2 / 2;
            long res = pow(x, half);
            long ans = res * res * x;
            ans = ans % MOD;
            return ans;
        }
    }
      
}
