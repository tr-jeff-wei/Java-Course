package zerojudge;

import java.util.Scanner;

public class e787_尋寶地圖 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int r = sc.nextInt();
            int c = sc.nextInt();

            int[] accRow = new int[r];
            int[] accCol = new int[c];
            int[][] map = new int[r][c];
            int[][] checkMap = new int[r][c];

            // ori map
            for (int ri = 0; ri < r; ri++) {
                  for (int ci = 0; ci < c; ci++) {
                        map[ri][ci] = sc.nextInt();
                  }
            }

            // check map
            for (int ri = 0; ri < r; ri++) {
                  for (int ci = 0; ci < c; ci++) {
                        int v = sc.nextInt();
                        accRow[ri] += v;
                        accCol[ci] += v;
                        checkMap[ri][ci] = v;
                  }
            }

            // result 
            for (int ri = 0; ri < r; ri++) {
                  for (int ci = 0; ci < c; ci++) {
                        // check
                        int checkSum = accRow[ri] + accCol[ci];
                        if (checkMap[ri][ci] == 1) {
                              checkSum--;
                        }
                        if (checkSum % 2 == 1) {
                              if (map[ri][ci] == 1) {
                                    System.out.print(0);
                              } else {
                                    System.out.print(1);
                              }
                        } else {
                              System.out.print(map[ri][ci]);

                        }
                        System.out.print(" ");
                  }
                  System.out.println("");
            }

      }

}
