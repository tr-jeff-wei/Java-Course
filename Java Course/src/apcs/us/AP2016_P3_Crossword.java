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
public class AP2016_P3_Crossword {

      public static void main(String[] args) {
            boolean[][] blackSquares = new boolean[][]{
                  {true, false, false, true, true, true, false, false, false},
                  {false, false, false, false, true, false, false, false, false},
                  {false, false, false, false, false, false, true, true, true},
                  {false, false, true, false, false, false, true, false, false},
                  {true, true, true, false, false, false, false, false, false},
                  {false, false, false, false, true, false, false, false, false},
                  {false, false, false, true, true, true, false, false, true}
            };
            Crossword cw = new Crossword(blackSquares) ;
            cw.show();
      }

}

class Square {

      boolean isBlack;
      int num;

      public Square(boolean isBlack, int num) {
            this.isBlack = isBlack;
            this.num = num;
      }

}

class Crossword {

      private Square[][] puzzle;

      public Crossword(boolean[][] blackSquares) {
            // (b)
      }

      private boolean toBeLabed(int r, int c, boolean[][] blackSquares) {
            // (a)
            return false;
      }

      public void show() {
            for (int i = 0; i < puzzle.length; i++) {
                  Square[] squares = puzzle[i];
                  for (int j = 0; j < squares.length; j++) {
                        Square square = squares[j];
                        if (square.isBlack) {
                              System.out.print("88   ");
                        } else {
                              if (square.num < 10) {
                                    System.out.print(" " + square.num + "   ");
                              } else {
                                    System.out.print(square.num + "   ");
                              }
                        }
                  }
                  System.out.println("");
            }
      }

}
