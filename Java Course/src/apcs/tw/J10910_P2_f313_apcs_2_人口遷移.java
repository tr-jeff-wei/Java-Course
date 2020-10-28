package apcs.tw;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J10910_P2_f313_apcs_2_人口遷移 {

// R,C,K,M
//2 3 4 1
//10 2 -1 
//5 -1 2
      static int r;
      static int c;
      static int k;
      static int m;

      static int[][] city;
      static int[][] mp;

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            r = sc.nextInt();
            c = sc.nextInt();
            k = sc.nextInt();
            m = sc.nextInt();

            city = new int[r][c];
            mp = new int[r][c];

            for (int i = 0; i < city.length; i++) {
                  for (int j = 0; j < city[i].length; j++) {
                        city[i][j] = sc.nextInt();
                  }
            }

            for (int i = 0; i < m; i++) {
                  calMovePeople();
                  //show( mp ) ;
                  move();
                  
//                  System.out.println("========");
//                  show( city);
            }

            // 
            int max = -1;
            int min = -1;
            for (int i = 0; i < city.length; i++) {
                  for (int j = 0; j < city[i].length; j++) {
                        if (city[i][j] == -1) {
                              continue;
                        }
                        if (max == -1 || max < city[i][j]) {
                              max = city[i][j];
                        }
                        if (min == -1 || min > city[i][j]) {
                              min = city[i][j];
                        }
                  }
            }
            System.out.println(min);
            System.out.println(max);

      }

      static void calMovePeople() {
            for (int i = 0; i < city.length; i++) {
                  for (int j = 0; j < city[i].length; j++) {
                        mp[i][j] = city[i][j] / k;
                  }
            }
      }

      static void move() {
            for (int i = 0; i < city.length; i++) {
                  for (int j = 0; j < city[i].length; j++) {
                        if (city[i][j] == -1) {
                              continue;
                        }
                        moveTo(i, j, 1, 0);
                        moveTo(i, j, -1, 0);
                        moveTo(i, j, 0, 1);
                        moveTo(i, j, 0, -1);
                  }
            }
      }

      static void moveTo(int ri, int ci, int dr, int dc) {
            int toR = ri + dr;
            int toC = ci + dc;
            if (toR < 0 || toC < 0) {
                  return;
            }
            if (toR >= r || toC >= c) {
                  return;
            }
            if (city[toR][toC] == -1) {
                  return;
            }

            city[ri][ci] -= mp[ri][ci];
            city[toR][toC] += mp[ri][ci];

      }
      
      static void show(int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                  System.out.println(Arrays.toString(arr[i]));
            }
      }

}
