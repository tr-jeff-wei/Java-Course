//package cses;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingTower {

      static int mod = 1000000007;

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer> cases = new ArrayList<>();
            int max = 0;
            for (int i = 0; i < n; i++) {
                  int x = sc.nextInt();
                  if (x > max) {
                        max = x;
                  }
                  cases.add(x);
            }

            long[][] floors = new long[max + 1][2];
            floors[1][0] = 1;
            floors[1][1] = 1;

            for (int i = 2; i < floors.length; i++) {
                  long bar3 = floors[i - 1][0] * 4 + floors[i - 1][1] * 1;
                  long bar2 = floors[i - 1][1] * 2 + floors[i - 1][0] * 1;

                  bar3 = bar3 % 1000000007;
                  bar2 = bar2 % 1000000007;

                  floors[i][0] = bar3;
                  floors[i][1] = bar2;

            }

            for (Integer aCase : cases) {
                  long t = floors[aCase][0] + floors[aCase][1];
                  t = t % 1000000007;
                  System.out.println(t);
            }
      }
}
