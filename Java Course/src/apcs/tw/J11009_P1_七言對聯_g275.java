package apcs.tw;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J11009_P1_七言對聯_g275 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  int[][] d = new int[2][7];
                  for (int m = 0; m < d.length; m++) {
                        for (int k = 0; k < d[m].length; k++) {
                              d[m][k] = sc.nextInt();
                        }
                  }
                  //二四不同二六同：每一句第二、四個字必須不同平仄，
                  //而第二、六個字必須相同平仄
                  boolean aOk = false;
                  if (d[0][1] != d[0][3] && d[0][1] == d[0][5]) {
                        if (d[1][1] != d[1][3] && d[1][1] == d[1][5]) {
                              aOk = true;
                        }
                  }
                  if (aOk == false) {
                        System.out.print("A");
                  }

                  // 仄起平收：第一句的結尾必須為仄聲，
                  //第二句的結尾必須為平聲
                  boolean bOk = false;
                  if (d[0][6] == 1 && d[1][6] == 0) {
                        bOk = true;
                  }
                  if (bOk == false) {
                        System.out.print("B");
                  }

                  // 上下相對：第一、二句的第二、四、六個字平仄必須不同
                  boolean cOk = false;
                  if (d[0][1] != d[1][1] && d[0][3] != d[1][3] && d[0][5] != d[1][5]) {
                        cOk = true;
                  }
                  if (cOk == false) {
                        System.out.print("C");
                  }
                  if (aOk && bOk && cOk) {
                        System.out.println("None");
                  } else {
                        System.out.println("");
                  }
            }

      }
}
