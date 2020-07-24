/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectures;

/**
 *
 * @author chuan
 */
public class Practice_array_ {

      public static void main(String[] args) {

            // 
            int[] test = new int[]{2, 3, 5, 1, 7, 4, 6};
            for (int i = 1; i < test.length - 1; i++) {
                  int k = test[i - 1] + test[i] + test[i + 1];

            }

      }

}
