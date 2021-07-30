package ytp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class ytp_2020_7_bigarray {

      static class Pt implements Comparable<Pt> {

            int x;
            int y;

            Pt(int x, int y) {
                  this.x = x;
                  this.y = y;
            }

            @Override
            public int compareTo(Pt o) {

                  if (this.x == o.x) {
                        return this.y - o.y;
                  } else {
                        return this.x - o.x;
                  }
            }

            public String toString() {
                  return x + "," + y;
            }
      }

      public static void main(String[] args) {

            String input = "8 8\n"
                    + "0 0\n"
                    + "0 1\n"
                    + "3 6\n"
                    + "7 7\n"
                    + "6 2\n"
                    + "4 2\n"
                    + "6 4\n"
                    + "5 1\n";
//            input="3 1\n" +
//"1 1\n";

            InputStream is = new ByteArrayInputStream(input.getBytes());
            System.setIn(is);

            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] dp = new int[n][n];
            boolean[][] pts = new boolean[n][n] ;

            for (int i = 0; i < m; i++) {

                  Pt p = new Pt(sc.nextInt(), sc.nextInt());
//                  list.add() ;
                  dp[p.x][p.y] = 1;
                  pts[p.x][p.y] = true;
            }

            showMatrix(dp);
            for (int i = 0; i < dp.length; i++) {
                  for (int j = 0; j < dp[i].length; j++) {

                        if (i == 0 && j == 0) {
                              continue;
                        }

                        if (j != 0) {
                              dp[i][j] += dp[i][j - 1];
                        }

                        if (i != 0) {
                              dp[i][j] += dp[i - 1][j];
                        }

                        if (i > 0 && j > 0) {
                              dp[i][j] -= dp[i - 1][j - 1];
                        }
                  }
            }

            System.out.println("");
            showMatrix(dp);
            int count = 0;
            for (int luX = -1; luX < n; luX++) {
                  for (int luY = -1; luY < n; luY++) {

                        for (int rdX = luX + 2; rdX < n; rdX++) {
                              boolean leaveAll = false;
                              for (int rdY = luY + 2; rdY < n; rdY++) {

                                    int r = dp[rdX][rdY];
                                    if (luX >= 0) {
                                          r -= dp[luX][rdY];
                                    }
                                    if (luY >= 0) {
                                          r -= dp[rdX][luY];
                                    }
                                    if (luX >= 0 && luY >= 0) {
                                          r += dp[luX][luY];
                                    }

                                    System.out.println(luX+","+luY +"   ===>  "+rdX+","+rdY);
                                    System.out.println("                r : "+r);
                                    System.out.println("                p: "+checkPts(pts,luX,rdX,luY,rdY));
                                    if (r == 1 &&
                                            checkPts(pts,luX+1,rdX,luY+1,rdY)) {
                                          count++;
                                    }
                                    if (r > 1) {
                                          if (rdY == luY + 2) {
                                                leaveAll = true;
                                                break;
                                                // leave below rows
                                          } else {
                                                break; // leave this row
                                          }
                                    }

                              }
                              if (leaveAll) {
                                    break;
                              }
                        }
                  }
            }
            System.out.println(count);

      }

      public static void showMatrix(int[][] mat) {

            for (int[] is : mat) {
                  for (int i : is) {
                        System.out.printf("%3d  ", i);
                  }
                  System.out.println("");
            }

      }
      
      public static boolean checkPts(boolean[][] pts , int lx , int rx , int uy , int dy ){
            
            if( checkPt(pts,lx , uy)){
                  return true ;
            }
            if( checkPt(pts,lx , dy)){
                  return true ;
            }
            if( checkPt(pts,rx , uy)){
                  return true ;
            }
            if( checkPt(pts,rx , dy)){
                  return true ;
            }
            return false ;
      }
      static boolean checkPt(boolean[][] pts , int x , int y){
            if( x>=0 && y>=0 && x<pts.length && y<pts[0].length){
                  return pts[x][y] ;
            }
            return false ;
      }
}
