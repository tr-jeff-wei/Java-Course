package lectures;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class S_Scanner_Loop {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("\n==================================");
            System.out.println("Find the biggest one in these numbers.");
            System.out.println("===================================");

            System.out.println("\nThe number of digits is ... ");
            int n = sc.nextInt();
            int max = -1;
            System.out.println("\nEnter these digits .... ");
            for (int i = 0; i < n; i++) {
                  int k = sc.nextInt();
                  if (k >= max) {
                        max = k;
                  }
            }

            System.out.println("\nThe biggest number is " + max);

      }
}
