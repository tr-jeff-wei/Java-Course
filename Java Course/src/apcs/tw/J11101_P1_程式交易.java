/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.tw;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J11101_P1_程式交易 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int d = sc.nextInt();

            int[] data = new int[n];
            for (int i = 0; i < data.length; i++) {
                  data[i] = sc.nextInt();
            }

            boolean item = true ;
            int priceNow = data[0];
            int profit = 0 ;
            for (int i = 1; i < data.length; i++) {
                  if (item==true) {
                        if (priceNow + d <= data[i]) {
                              // sell
                              profit += (data[i]-priceNow) ;
                              priceNow = data[i] ;
                              item = false ;
                        } else {
                              // do nothing
                        }
                  } else {
                        // buy
                        if( data[i]<=priceNow-d ){
                              item = true ;
                              priceNow = data[i] ;
                        }

                  }
            }
            
            System.out.println(profit);

      }

}
