/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class AreaCalculator {
      
      static Scanner sc = new Scanner(System.in) ;
      
      public static void main(String[] args) {
            System.out.println("== 歡迎使用面積小算盤 ==");
            System.out.println("請輸入，您想要計算的形狀");
            System.out.println("1. 三角形");
            System.out.println("2. 正方形");
            System.out.println("3. 平行四邊形");
            
            int input = sc.nextInt();
            if( input == 1 ){
                  
                  System.out.println("請輸入三角形的［底］");
                  int base = sc.nextInt() ;
                  
                  System.out.println("請輸入三角形的［高］");
                  int height = sc.nextInt() ;
                  
                  int area = base * height / 2 ;
                  System.out.println("您的三角形面積是："+area);
            }
            
            
      }
      
}
