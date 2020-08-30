package zerojudge;


import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class f043_小豪的回家作業 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b) {
                  int r = a - 3;
                  if (r < 3) {
                        System.out.println(r + "+3=" + a);
                  } else {
                        System.out.println("3+" + r + "=" + a);
                  }
            } else {
                  int r = a - b;
                  if (r < b) {
                        System.out.println(r + "+" + b + "=" + a);
                  } else {
                        System.out.println(b + "+" + r + "=" + a);
                  }
            }

      }
}
