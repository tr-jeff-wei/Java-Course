package zerojudge;

import java.util.Scanner;

public class a040_阿姆斯壯數 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = a; i <= b; i++) {
                  if (isArmstrongNum(i)) {
                        sb.append(i).append(" ");
                  }
            }

            String r = sb.toString().trim();
            if (r.length() == 0) {
                  System.out.println("none");
            } else {
                  System.out.println(r);
            }

      }

      public static boolean isArmstrongNum(int num) {

            int n = num;
            int length = ("" + n).length();

            int total = 0;
            for (int i = 0; i < length; i++) {
                  total += Math.pow(n % 10, length);
                  n /= 10;
            }
            return total == num;
      }

}
