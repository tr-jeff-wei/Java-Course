//package cses;

import java.util.Scanner;

public class RectangleCut {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            int[][] result = new int[a + 1][b + 1];
            for (int ea = 1; ea <= a; ea++) {
                  for (int eb = 1; eb <= b; eb++) {

                        if (ea == eb) {
                              result[ea][eb] = 0;
                              continue;
                        } else if (ea == 1) {
                              result[ea][eb] = eb - 1;
                              continue;
                        } else if (eb == 1) {
                              result[ea][eb] = ea - 1;
                              continue;
                        } else {
                              result[ea][eb] = Integer.MAX_VALUE;
                        }

                        for (int cuta = 1; cuta < ea; cuta++) {
                              result[ea][eb] = Math.min(result[ea][eb], result[cuta][eb] + result[ea - cuta][eb] + 1);
                        }
                        for (int cutb = 1; cutb < eb; cutb++) {
                              result[ea][eb] = Math.min(result[ea][eb], result[ea][cutb] + result[ea][eb - cutb] + 1);
                        }
                  }

            }

            System.out.println(result[a][b]);

      }

}
