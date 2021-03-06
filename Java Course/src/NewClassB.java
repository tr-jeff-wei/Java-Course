/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chuan
 */
public class NewClassB {

      public static boolean[][] makeGrid(int rows, int cols) {
            boolean[][] grid = new boolean[rows][cols];

            for (int i = 0; i < grid.length; i++) {
                  for (int j = 0; j < grid[i].length; j++) {
                        if ((i + j) % 2 == 0) {
                              grid[i][j] = true;
                        } else {
                              grid[i][j] = false;
                        }
                  }
            }
            return grid;
      }

      public static void main2(String[] args) {

            boolean[][] result = makeGrid(7, 5);
            for (int i = 0; i < result.length; i++) {
                  for (int j = 0; j < result[i].length; j++) {
                        if (result[i][j]) {
                              System.out.print("O ");
                        } else {
                              System.out.print("X ");
                        }
                  }
                  System.out.println();
            }
      }

      public static void main(String[] args) {
            String[][] test =  new String[][]
            {
                  {"A","B","C","D","E","F","G" } ,
                  {"H","I","J","K","L","M","N" } ,
                  {"O","P","Q","R","S","T","U" } 
            };
            
            A[] dd = new AA[3] ;
      }

}


class A{
}

class AA extends A{
}