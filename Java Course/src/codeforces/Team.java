package codeforces;

import java.util.Scanner;

public class Team {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int total = 0;
            int a;
            int b;
            int c;

            for (int i = 0; i < n; i++) {
                  a = sc.nextInt();
                  b = sc.nextInt();
                  c = sc.nextInt();

                  if (a + b + c > 1) {
                        total++;
                  }
            }

            System.out.println(total);
      }
}
