package zerojudge;

import java.util.Scanner;

public class e623_PPAP {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in) ;
            
            int k = sc.nextInt() ;
            test(k);


// Test Code
//            int k = 4;
//            int n = 1;
//            for (int i = 1; i < 1000; i++) {
//                  System.out.print(i + "  --> ");
//                  test(i);
//                  if (i == k) {
//                        n++;
//                        k += 4 * n;
//                        System.out.println("");
//                  }
//
//            }

      }

      public static void test(int k) {
            // 4*1
            // 4*2
            // 4*3
            // 4*4
            // ...
            // 4*n
            // --------------
            // 4 ( 1+2+...+n ) <= k
            // 4* n* (n+1)/2   <= k
            // 2*n*(n+1)<=k
            // 2*n*n  <  2*n*(n+1) <= k  
            // 估計 2n*n < k 比較好算

            // 去掉前 n 組的值
            double estN = Math.pow(k / 2, 0.5) - 1;
            int eN = 0;
            if (estN > (int) estN) {
                  eN = (int) estN;
            } else {
                  eN = (int) estN - 1;
            }
            if (eN > 0) {
                  k = k - 2 * eN * (eN + 1);
            } else {
                  eN = 0;
            }

            // 去掉剩餘的組
            eN++;
            int gSize = 4 * eN;
            if (k > gSize) {
                  k -= gSize;
                  eN++;
            }

            // 估計最後位置
            double target = (double)k / eN;
            if (target <= 1) {
                  System.out.println("Pen");
            } else if (target <= 2) {
                  System.out.println("Pineapple");
            } else if (target <= 3) {
                  System.out.println("Apple");
            } else {
                  System.out.println("Pineapple pen");
            }

      }
}
