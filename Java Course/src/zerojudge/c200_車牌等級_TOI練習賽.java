package zerojudge;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class c200_車牌等級_TOI練習賽 {

      public static void main(String[] args) {
            String input = "5\n"
                    + "01\n"
                    + "0A\n"
                    + "10\n"
                    + "A0\n"
                    + "A00\n";
            InputStream is = new ByteArrayInputStream(input.getBytes());
            System.setIn(is);

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  String token = sc.next();

                  int number = 0;
                  int unit = 1;
                  for (int j = token.length() - 1; j >= 0; j--) {
                        char c = token.charAt(j);
                        int digit = 0;
                        if (c >= 'A' && c <= 'Z') {
                              digit = c - 'A' + 10;
                        } else {
                              digit = c - '0';
                        }
                        number = number + unit * digit;
                        unit = unit * 36;
                  }

                  System.out.println(1 + number % 1688);

            }

      }
}
