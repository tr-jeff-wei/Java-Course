package apcs.tw;

import java.util.Scanner;

/**
 * 練習取得輸入數字
 * 
 */

public class Template_read_integer {

     /*
      * 
      * 使用者輸入 
      * > 1 行：以下有幾行要加總數字 
      * > 2 , 3 , .. 行：要加總的數字 
      * 結果輸出
      * > 全部數字加總
      * 
      * 範例：
      *  input-> 3
      *  input-> 5
      *  input-> 7
      *  input-> 9
      *  output---> 15
      */

     public static void main1(String[] args) {

          // 建立取得輸入物件
          Scanner sc = new Scanner(System.in) ;
          int n1 = sc.nextInt();
          int total = 0 ;
          for( int i=0 ; i<n1 ; i++) {
               int others = sc.nextInt() ;
               total = total + others ;
          }
          
          System.out.println(total);          

     }
     
     
     /**
      * 
      * 使用者輸入 
      * > 1 行：以下每行有幾個數字要加總
      * > 2 , 3 , .. ：每一行要加總的數字
      * 結果輸出
      * > 每一行加總的結果
      * 
      * 範例：
      *  input-> 3 2 3 4
      *  input-> 5 6 7
      *  input-> 2 5
      *  input-> 1 4 5
      *  input-> 2 4 6 2
      *  output---> 18
      *  output---> 7
      *  output---> 10
      *  output---> 14
      */
     public static void main(String[] args) {
       // 建立取得輸入物件
          Scanner sc = new Scanner(System.in) ;
          int n1 = sc.nextInt();
          int total = 0 ;
          for( int i=0 ; i<n1 ; i++) {
               int others = sc.nextInt() ;
               total = total + others ;
          }
          
          System.out.println(total);         
     }

}
