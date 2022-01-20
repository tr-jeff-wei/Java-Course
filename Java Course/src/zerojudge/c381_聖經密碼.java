package zerojudge;

import java.util.Scanner;

public class c381_聖經密碼 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            while (sc.hasNextInt()) {

                  int n = sc.nextInt(); // 第 1 個數字
                  int m = sc.nextInt(); // 第 2 個數字

                  if (n == 0) {
                        break;
                  }

                  // 如果是抓數字，要往下一行抓文字，
                  // 一定要多寫一個 sc.nextLine()
                  sc.nextLine();

                  StringBuilder t = new StringBuilder(); // t 要把所有字串在一起的變數

                  for (int i = 0; i < n; i++) {
                        String s = sc.nextLine();
                        t.append(s);
                  }
                  StringBuilder result = new StringBuilder();
                  for (int i = 0; i < m; i++) {
                        int k = sc.nextInt();
                        char c = t.charAt(k - 1);
                        result.append(c);
                  }
                  System.out.println(result);

            }

      }

}
