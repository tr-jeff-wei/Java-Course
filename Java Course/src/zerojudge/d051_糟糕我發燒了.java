
package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class d051_糟糕我發燒了 {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in) ;
            int f = sc.nextInt() ;
            double c = (f-32.0)*5/9 ;
            
            System.out.printf("%.3f",c);
      }
}
