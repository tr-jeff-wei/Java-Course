package zerojudge;

import java.util.Scanner;

public class d562_山寨版磁力蜈蚣 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                  int n = sc.nextInt();
                  int[] num = new int[n];
                  for (int i = 0; i < num.length; i++) {
                        num[i] = sc.nextInt();
                  }
                  int s = 0;
                  int e = n - 1;
                  StringBuffer sb = new StringBuffer();
                  for (int i = 0; i < n; i++) {
                        if (i % 2 == 0) {
                              for (int j = s; j <= e; j++) {
                                    sb.append(num[j]).append(" ");
                              }
                              sb.append("\n");
                              s++;
                        } else {
                              for (int j = e; j >= s; j--) {
                                    sb.append(num[j]).append(" ");
                              }
                              sb.append("\n");
                              e--;
                        }
                  }
                  System.out.println(sb);
            }

      }

}
