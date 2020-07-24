package codeforces;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class CodeforcesRound_648 {

      public static void main(String[] args) {

            String data = "4\n"
                    + "2 2\n"
                    + "0 0\n"
                    + "0 0\n"
                    + "2 2\n"
                    + "0 0\n"
                    + "0 1\n"
                    + "2 3\n"
                    + "1 0 1\n"
                    + "1 1 0\n"
                    + "3 3\n"
                    + "1 0 0\n"
                    + "0 0 0\n"
                    + "1 0 0\n";

            InputStream is = new ByteArrayInputStream(data.getBytes());
            System.setIn(is);
            Scanner sc = new Scanner(System.in);
            int nt = sc.nextInt();
            for (int i = 0; i < nt; i++) {

                  int r = sc.nextInt();
                  int c = sc.nextInt();
                  int[] accRow = new int[r];
                  int[] accCol = new int[c];
                  boolean[][] on = new boolean[r][c];
                  for (int ri = 0; ri < r; ri++) {
                        for (int ci = 0; ci < c; ci++) {
                              int x = sc.nextInt();
                              if (x == 0) {
                                    accRow[ri]++;
                                    accCol[ci]++;
                              } else {
                                    on[ri][ci] = true;
                              }
                        }
                  }

                  int count = 0;
                  while (true) {

                        int maxRi = 0;
                        for (int ri = 1; ri < r; ri++) {
                              if (accRow[ri] > accRow[maxRi]) {
                                    maxRi = ri;
                              }
                        }

                        int maxCi = 0;
                        for (int ci = 0; ci < c; ci++) {
                              if (accCol[ci] > accCol[maxCi]) {
                                    maxCi = ci;
                              }
                        }

                        if (accRow[maxRi] == 0 && accCol[maxCi] == 0) {
                              break;
                        }

                        // 
                        accRow[maxRi] = 0;
                        accCol[maxCi] = 0;
                        for (int ri = 1; ri < r; ri++) {
                              if (on[ri][maxCi] == false && accRow[ri] > 0) {
                                    accRow[ri]--;
                              }
                        }
                        for (int ci = 0; ci < c; ci++) {
                              if (on[maxRi][ci] == false && accCol[ci] > 0) {
                                    accCol[ci]--;
                              }
                        }
                        count++;
                  }

                  System.out.println(count);
            }

      }

}
