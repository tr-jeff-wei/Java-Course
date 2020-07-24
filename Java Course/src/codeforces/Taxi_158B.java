/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforces;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class Taxi_158B {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] teams = new int[5];
            int cars = 0;
            for (int i = 0; i < n; i++) {
                  int members = sc.nextInt();
                  teams[members]++;
            }

            if (teams[4] > 0) {
                  cars = teams[4];
                  teams[4] = 0;
            }
            // 1、3 併車
            int k = Math.min(teams[1], teams[3]);
            cars += k;
            teams[1] -= k;
            teams[3] -= k;

            // 2、2 併車
            if (teams[2] > 1) {
                  k = teams[2] / 2;
                  cars += k;
                  teams[2] -= (2 * k);
            }

            if (teams[2] == 0) {
                  if (teams[1] + teams[3] > 0) {
                        if (teams[1] > 0) {
                              cars += (teams[1] / 4);
                              // 剩下人
                              teams[1] = teams[1] % 4;
                              if (teams[1] > 0) {
                                    cars++;
                              }
                        } else {
                              cars += teams[3];
                        }
                  }
            } else {
                  if (teams[1] + teams[3] > 0) {
                        if (teams[1] > 0) {

                              cars += (teams[1] / 4);
                              // 剩下人
                              teams[1] = teams[1] % 4;
                              int r = teams[1] + 2;
                              if (r > 4) {
                                    cars += 2;
                              } else {
                                    cars++;
                              }

                        } else {
                              cars += teams[3];
                              cars += teams[2];
                        }
                  } else {
                        cars++;
                  }
            }

            System.out.println(cars);

      }
}
