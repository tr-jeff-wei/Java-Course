package apcs.tw;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J10910_P3_DF_expression {

      static int idx = 0;

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String info = sc.nextLine();
            int n = sc.nextInt();

            int total = getPixels(info, n);
            System.out.println(total);
      }

      public static int getPixels(String s, int width) {
            if (idx >= s.length()) {
                  return 0;
            }

            char code = s.charAt(idx);
            idx++ ;
            if (code == '0') {
                  return 0;
            }
            if (code == '1') {
                  return width * width;
            }
            if (code == '2') {                  
                  return getPixels(s, width / 2) + getPixels(s, width / 2) + getPixels(s, width / 2) + getPixels(s, width / 2);
            }
            return 0;
      }
}
