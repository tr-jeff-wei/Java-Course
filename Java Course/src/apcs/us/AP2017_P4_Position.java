/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.us;

/**
 *
 * @author chuan
 */
public class AP2017_P4_Position {

}

class Position {

      int r;
      int c;

      public Position(int r, int c) {
            this.r = r;
            this.c = c;
      }

      public static Position findPosition(int num, int[][] intArr) {
            // (a)
            return null;

      }

      public static Position[][] getSuccessorArray(int[][] intArr) {
            return null;

      }

      public String toString() {
            return "( " + r + " , " + c + " )";
      }

      public static void main(String[] args) {
            int[][] testArr = new int[][]{
                  {15, 5, 9, 10},
                  {12, 16, 11, 6},
                  {14, 8, 13, 7}
            };
            Position[][] resultArr = Position.getSuccessorArray(testArr);
            for (Position[] positions : resultArr) {
                  for (Position position : positions) {
                        System.out.println(position);
                  }
                  System.out.println("");
            }
      }
}
