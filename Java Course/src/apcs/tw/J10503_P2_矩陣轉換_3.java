package apcs.tw ;

import java.util.Arrays;
import java.util.Scanner;

class b965_第2題矩陣轉換_3 {


     public static void main(String[] args) {
          //
          // int[][] t = new int[][] {
          // {2, 3},
          // {1, 0},
          // {3, 1},
          // {4, 4},
          // {7, 5}};
          //
          // int[][] r = rotate(t) ;//flip(t);
          // for (int i = 0; i < r.length; i++) {
          // System.out.println(Arrays.toString(r[i]));
          // }

          Scanner sc = new Scanner(System.in);

          while (sc.hasNextInt()) {
               int r = sc.nextInt();
               int c = sc.nextInt();
               int m = sc.nextInt();
               int[][] t = new int[r][c];
               for (int i = 0; i < t.length; i++) {
                    for (int j = 0; j < t[i].length; j++) {
                         t[i][j] = sc.nextInt();
                    }
               }
               // A-> 旋、翻、旋、翻 -> B
               // B-> 翻、旋、翻、旋-> A
               int[] mps = new int[m] ;
               for (int i = 0; i < m; i++) {
                    mps[i] = sc.nextInt();                    
               }
               
               // 倒過來做
               for (int i =mps.length-1 ; i>=0  ; i--) {
                    if (mps[i] == 0) {
                         t = rotate(t);
                    } else {
                         t = flip(t);
                    }
               }

               showAnswer(t);
          }
     }

     static void showAnswer(int[][] t) {
          
          System.out.println(t.length + " " + t[0].length);
                 
         
          
          for (int i = 0; i < t.length; i++) {
               for (int j = 0; j < t[i].length; j++) {
          
                    if (j == t[i].length - 1) {
                         System.out.print(t[i][j]);
                    } else {
                         System.out.print(t[i][j] + " ");
                    }
                    
               }
               System.out.println();
          }
     }

     // 旋轉:左翻轉
     static int[][] rotate(int[][] ori) {

          // 長寬互換
          int[][] newT = new int[ori[0].length][ori.length];

          for (int i = 0; i < ori.length; i++) {
               for (int j = 0; j < ori[i].length; j++) {
                    newT[ori[i].length-1-j][i] = ori[i][j];
               }
          }

          return newT;

     }


     // 翻轉
     static int[][] flip(int[][] ori) {

          int[][] newT = new int[ori.length][ori[0].length];

          for (int col = 0; col < ori[0].length; col++) {

               // 改一直行
               int a = 0;
               int b = ori.length - 1; // height

               while (b >= 0) {
                    newT[b][col] = ori[a][col];
                    a++;
                    b--;
               }

          }

          return newT;

     }

}
