package apcs.tw;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J10910_P3_f314_apcs_3_勇者修煉 {

      static int r;
      static int c;
      static int[][] map;
      static int[][] best;

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            r = sc.nextInt();
            c = sc.nextInt();

            map = new int[r][c];
            best = new int[r][c];

            for (int i = 0; i < map.length; i++) {
                  for (int j = 0; j < map[i].length; j++) {
                        map[i][j] = sc.nextInt();
                  }
            }

            for (int floor = 0; floor < best.length; floor++) {

                  int[] LBest = new int[c];
                  int[] RBest = new int[c];

                  // L to R
                  for (int j = 0; j < LBest.length; j++) {

                        // up
                        if (floor == 0) {
                              LBest[j] = map[0][j];
                        } else if (floor > 0) {
                              int s = map[floor][j] + best[floor - 1][j];
                              LBest[j] = s;
                        }

                        // left
                        if (j > 0) {
                              int s = map[floor][j] + LBest[j - 1];
                              if (s > LBest[j]) {
                                    LBest[j] = s;
                              }
                        }
                  }

                  // R to L
                  for (int j = RBest.length - 1; j >= 0; j--) {

                        // up
                        if (floor == 0) {
                              RBest[j] = map[0][j];
                        } else if (floor > 0) {
                              int s = map[floor][j] + best[floor - 1][j];
                              RBest[j] = s;
                        }

                        // Right
                        if (j < RBest.length - 1) {
                              int s = map[floor][j] + RBest[j + 1];
                              if (s > RBest[j]) {
                                    RBest[j] = s;
                              }
                        }

                        // set Max 
                        best[floor][j] = Math.max(LBest[j], RBest[j]);
                  }
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < best[0].length ; i++) {
                  if (best[r - 1][i] > max) {
                        max = best[r - 1][i];
                  }
            }
            System.out.println(max);
      }

      static void show(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                  System.out.println(Arrays.toString(arr[i]));
            }
      }

}
