package zerojudge;

import java.util.Scanner;

public class f709_2019_DoomDayAlgorithm {

//       4/4, 6/6, 8/8, 10/10 ,12/12
//5/9, 9/5, 7/11 ,11/7
//
//平：1/10,2/21
//閏：1/11,2/22
      public static void main(String[] args) {

            int[] doomDay = {0, 10, 21, 0, 4, 9, 6, 11, 8, 5, 10, 7, 12};

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                  int m = sc.nextInt();
                  int d = sc.nextInt();
                  int diff = 0;
                  if (m == 3) {
                        int d1 = doomDay[2] % 7;
                        int d2 = (28 + d) % 7;
                        diff = d2 - d1;
                        while (diff < 0) {
                              diff += 7;
                        }
                  } else {
                        int d1 = doomDay[m] % 7;
                        int d2 = d % 7;
                        diff = d2 - d1;

                  }
                  while (diff < 0) {
                        diff += 7;
                  }
                  switch (diff) {
                        case 0:
                              System.out.println("Monday");
                              break;
                        case 1:
                              System.out.println("Tuesday");
                              break;
                        case 2:
                              System.out.println("Wednesday");
                              break;
                        case 3:
                              System.out.println("Thursday");
                              break;
                        case 4:
                              System.out.println("Friday");
                              break;
                        case 5:
                              System.out.println("Saturday");
                              break;
                        case 6:
                              System.out.println("Sunday");
                              break;
                  }

            }

      }
}
