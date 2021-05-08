
package zerojudge;

import java.util.Scanner;


public class a024_最大公因數_GCD {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(gcd(a,b));
      }

      public static int gcd(int a, int b) {

            int L = Math.max(a, b);
            int S = Math.min(a, b);

            int r = L % S;
            if (r == 0) {
                  return S;
            } else {
                  return gcd(S, r);
            }
      }

}
