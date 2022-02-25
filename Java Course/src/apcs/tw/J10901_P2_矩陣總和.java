package apcs.tw;

import java.util.Scanner;

public class J10901_P2_矩陣總和 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int r = sc.nextInt();

            int[][] arrA = new int[n1][n2];
            int[][] arrB = new int[m1][m2];

            for (int i = 0; i < n1; i++) {
                  for (int j = 0; j < n2; j++) {
                        arrA[i][j] = sc.nextInt();
                  }
            }
            for (int i = 0; i < m1; i++) {
                  for (int j = 0; j < m2; j++) {
                        arrB[i][j] = sc.nextInt();
                  }
            }

            int min = Integer.MAX_VALUE;
            int count = 0;
            for (int i = 0; i < m1 - (n1 - 1); i++) {
                  for (int j = 0; j < m2 - (n2 - 1); j++) {
                        // check distance / cal difference       
                        int total = check(arrA, arrB, i, j, r);
                        //System.out.println(i + "," + j + " ==> " + total);

                        if (total ==-1 ) {
                              continue;
                        }
                        if (total < min) {
                              min = total;
                        }
                        count++;
                  }
            }
            System.out.println(count);
            if( min==Integer.MAX_VALUE){
                  System.out.println(-1);
            }else{
                  System.out.println(min);
            }
            

      }

      static int check(int[][] A, int[][] B, int i, int j, int r) {

            int err = 0;
            int total = 0;
            for (int m = 0; m < A.length; m++) {
                  for (int n = 0; n < A[m].length; n++) {
                        if (A[m][n] != B[i + m][j + n]) {
                              err++;
                        }
                        if (err > r) {
                              return -1;
                        }
                        total += (B[i + m][j + n] - A[m][n]);
                  }

            }
            return Math.abs(total);
      }
}
