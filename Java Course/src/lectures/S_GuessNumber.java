/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectures;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class S_GuessNumber {

      public static void main(String[] args) {

            int answer = (int) (Math.random() * 100);

//            System.out.println(answer);
            Scanner sc = new Scanner(System.in);
            System.out.println("=================================");
            System.out.println("    Can you find the number ?");
            System.out.println("=================================");
            int min = 0;
            int max = 99;
            while (true) {
                  System.out.println("enter your guess : " + min + " ~ " + max);

                  int g = sc.nextInt();

                  if (g == answer) {
                        System.out.println("Bingo~ Congratulations !!");
                        break;
                  } else if (g > max || g < min) {
                        System.out.println("Number must be between " + min + " and " + max + "  !!");
                  } else {
                        if (g < answer) {
                              min = g;

                        } else {
                              max = g;
                        }
                  }
            }

      }
}
