package apcs.tw;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J11011_P1_g595_修補圍籬 {

      // alt + /
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt(); // 9

            int[] x = new int[n];
            for (int i = 0; i < x.length; i++) {
                  int d = sc.nextInt();
                  x[i] = d;
            }

            // 重頭開始檢查
            int total = 0;

            for (int i = 0; i < x.length; i++) {
                  if (x[i] == 0) { // 要修復的柵欄

                        int fixLen = -1;
                        // 先參考前面的
                        if (i != 0) { // 不是頭一個
                              fixLen = x[i - 1];
                        }

                        // 再參考後面的
                        if (fixLen == -1) {
                              // 直接參考後面（前面沒有）
                              fixLen = x[i + 1];
                        } else if (i < x.length - 1) {
                              // 前面也有參考
                              if (x[i + 1] < fixLen) {
                                    fixLen = x[i + 1];
                              }
                        }

                        total = total + fixLen;
                  }
            }

            System.out.println(total);
      }
}
