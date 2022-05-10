package zerojudge;

import java.util.Scanner;

public class d587_參貳壹真好吃 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            for (int i = 0; i < n; i++) {
                  int x = sc.nextInt();
                  if (x == 1) {
                        n1++;
                  }
                  if (x == 2) {
                        n2++;
                  }
                  if (x == 3) {
                        n3++;
                  }
            }
            // 印出 1
            for (int i = 0; i < n1; i++) {
                  System.out.print("1 ");                  
            }
            // 印出 2
            for (int i = 0; i < n2; i++) {
                  System.out.print("2 ");                  
            }
            // 印出 3
            for (int i = 0; i < n3; i++) {
                  System.out.print("3 ");                  
            }
      }
}
