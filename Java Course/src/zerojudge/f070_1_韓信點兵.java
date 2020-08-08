package zerojudge;


import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class f070_1_韓信點兵 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] divide = new int[3];
            int[] remainder = new int[3];
            int maxDiv = -1;
            int maxDivRem = -1;
            for (int i = 0; i < divide.length; i++) {
                  divide[i] = sc.nextInt();
                  remainder[i] = sc.nextInt();
                  if (i == 0 || maxDiv < divide[i]) {
                        maxDiv = divide[i];
                        maxDivRem = remainder[i];
                  }
            }

            int n = maxDiv + maxDivRem;
            while (true) {

                  int i = 0;
                  for (; i < remainder.length; i++) {
                        if (n % divide[i] != remainder[i]) {
                              break;
                        }
                  }
                  if (i == remainder.length) {
                        System.out.println(n);
                        break;
                  }
                  n += maxDiv;
            }

      }
}
