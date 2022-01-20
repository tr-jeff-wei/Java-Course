package zerojudge;

import java.util.Scanner;

public class g004_社區熱門度_Popularity {

      static int get(int[][] table, int r, int c) {
            if (r < 0 || c < 0 || r >= table.length || c >= table[0].length) {
                  return -1;
            }
            return table[r][c];
      }

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] table = new int[r][c];
            for (int i = 0; i < table.length; i++) {
                  for (int j = 0; j < table[i].length; j++) {
                        table[i][j] = sc.nextInt();
                  }
            }

            for (int i = 0; i < table.length; i++) {
                  for (int j = 0; j < table[i].length; j++) {
                        if (table[i][j] == 0) {
                              int n = 0;
                              int sum = 0;

                              // up
                              int x = get(table, i - 1, j);
                              if (x > 0) {
                                    sum = sum + x;
                                    n++;
                              }

                              // down
                              x = get(table, i + 1, j);
                              if (x > 0) {
                                    sum += x;
                                    n++;
                              }

                              // left
                              x = get(table, i, j - 1);
                              if (x > 0) {
                                    sum += x;
                                    n++;
                              }

                              // right
                              x = get(table, i, j + 1);
                              if (x > 0) {
                                    sum += x;
                                    n++;
                              }
                              // avg
                              if( n == 0 ){
                                    System.out.print("0 ");
                              }else{
                                    System.out.print(sum/n+" ");
                              }

                        }else{
                              System.out.print(table[i][j]+" ");
                        }
                  }
                  System.out.println();
            }

      }
}
