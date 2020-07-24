package codeforces;

import java.util.Scanner;

public class WayTooLongWords {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < n; i++) {
                  String w = sc.nextLine();

                  if (w.length() > 10) {
                        char first = w.charAt(0);
                        char last = w.charAt(w.length() - 1);

                        System.out.print(first);
                        System.out.print(w.length() - 2);
                        System.out.println(last);

                  } else {
                        System.out.println(w);
                  }
            }

      }
}
