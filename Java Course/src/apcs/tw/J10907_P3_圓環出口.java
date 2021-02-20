package apcs.tw;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J10907_P3_圓環出口 {

      public static void test(String[] args) {
            int[] a = new int[]{3, 5, 9, 12, 33, 34};

            for (int i = 5; i < 12; i++) {
                  int n = Arrays.binarySearch(a, i);
                  if (n < 0) {
                        // insertion point
                        n = -(n + 1);
                  }
                  System.out.println("target : " + i + "   at " + n);
            }

      }

      public static void test2(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] ns = new int[n];
            int[] ms = new int[m];

            ns[0] = sc.nextInt();
            for (int i = 1; i < ns.length; i++) {
                  ns[i] = sc.nextInt();
            }
            for (int i = 0; i < ms.length; i++) {
                  ms[i] = sc.nextInt();
            }
            int start = 0;
            for (int i = 0; i < ms.length; i++) {                 
                  int o = ms[i];
                  System.out.print(o+"  ");
                  while (true) {
                        o -= ns[start];
                        
                        start++;
                        start %= ns.length;
                        if (o <= 0) {
                              break;
                        }
                  }
                  System.out.println("==>" + start);
            }

      }

      /*
11 53
1 3 1 3 1 3 2 1 1 3 1
19 11 19 3 15 16 6 4 15 18 16 15 9 19 5 10 20 13 14 2 4 18 4 10 1 18 7 2 5 11 3 9 16 7 14 2 10 15 9 18 15 1 8 8 1 6 7 16 16 11 1 17 13
   
 4     
       */
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] ns = new int[n];
            int[] ms = new int[m];

            ns[0] = sc.nextInt();
            for (int i = 1; i < ns.length; i++) {
                  ns[i] = sc.nextInt();
                  ns[i] += ns[i - 1];
            }

//            System.out.println("--");
//            for (int i : ns) {
//                  System.out.println(i);
//            }
//            System.out.println("--");

            int targetSpot = 0;
            for (int i = 0; i < ms.length; i++) {
                  int t = sc.nextInt();
                  targetSpot = nextSpot(ns, targetSpot, t);
//                  System.out.println(t + " > " + targetSpot);
            }
            System.out.println(targetSpot);
      }

      static int nextSpot(int[] ref, int startIdx, int targetAmount) {

            int target = targetAmount;
            if (startIdx > 0) {
                  target += ref[startIdx - 1];
            }
            if( target > ref[ref.length - 1]){
                  target = target % ref[ref.length - 1];
            }
            int idx = Arrays.binarySearch(ref, target);
            if (idx < 0) {
                  idx = -(idx + 1);
            }

            idx++;
            idx %= ref.length;
            return idx; // insertion point
      }

}
