package codingame.puzzle;

import java.util.*;
import java.io.*;
import java.math.*;

public class PirateTreasure {

      public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int W = in.nextInt();
            int H = in.nextInt();
            Data d1 = new Data();
            d1.map = new int[H + 2][W + 2];
            for (int i = 0; i < d1.map.length; i++) {
                  for (int j = 0; j < d1.map[i].length; j++) {
                        if (i == 0 || j == 0 || i == H+1 || j == W+1) {
                              d1.map[i][j] = 1;
                              continue;
                        }
                        int v = in.nextInt();
                        d1.map[i][j] = v;
                  }
            }
            
            d1.show();
            //d1.check();
            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");
            
            System.out.println(d1.check(6,1) );

      }
}

class Data {

      int map[][];

      void check() {
            for (int i = 1; i < map.length - 1; i++) {
                  for (int j = 1; j < map[i].length - 1; j++) {

                        boolean b = check(i, j);
                        
                        if (b == true) {
                              System.out.println("i , j ==>"+i+" , "+j);
                              System.out.println((j - 1) + " " + (i - 1));
                        }

                  }
            }
      }

      boolean check(int g, int h) {
            if (map[g][h] == 0) {
                  if (map[g - 1][h - 1] == 1) {
                        if (map[g - 1][h] == 1) {
                              if (map[g][h - 1] == 1) {
                                    if (map[g + 1][h - 1] == 1) {
                                          if (map[g + 1][h] == 1) {
                                                if (map[g + 1][h + 1] == 1) {
                                                      if (map[g][h + 1] == 1) {
                                                            if (map[g - 1][h + 1] == 1) {
                                                                  return true;
                                                            }
                                                      }
                                                }
                                          }

                                    }
                              }
                        }
                  }
            }
            return false;
      }

      
      void show(){
            
            for (int i = 0; i < map.length; i++) {
                  
                  for (int j = 0; j < map[i].length; j++) {
                        int k = map[i][j];
                        System.out.print(k+" ");
                  }
                  System.out.println("");
            }
            
      }
      
}
