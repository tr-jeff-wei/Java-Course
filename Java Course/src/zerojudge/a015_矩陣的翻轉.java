package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class a015_矩陣的翻轉 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                  int rs = sc.nextInt();
                  int cs = sc.nextInt();
                  int[][] data = new int[rs][cs];

                  for (int i = 0; i < data.length; i++) {
                        for (int j = 0; j < data[i].length; j++) {
                              data[i][j] = sc.nextInt();
                        }
                  }

                  for (int i = 0; i < cs; i++) {
                        for (int j = 0; j < rs; j++) {
                              System.out.print(data[j][i] + " ");
                        }
                        System.out.println("");
                  }
            }
            sc.close();
      }
}
