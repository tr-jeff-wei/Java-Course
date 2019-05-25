package homework;

import java.util.Scanner;

public class hw_0525 {

     
     public static void main2(String[] args) {
          
          int k = 3 ;
          int n = 0 ;
          for( int a=1 ; a<k ; a++) {
               for( int b=a+1 ; b<k ; b++) {
                    n = n+1 ;
               }
          }
          System.out.println(n);
          
     }
     
     public static void main3(String[] args) {
          
          int k = 3 ;
          int n = 0 ;
          for( int a=k ; a>=0 ; a--) {
               for( int b=a-1 ; b>=0 ; b--) {
                    n = n+1 ;
               }
          }
          System.out.println(n);
          
     }    
     
     public static void main(String[] args) {
          
          /**
           * 請問使用者輸入如下訊息，程式會輸出什麼內容
           * 使用者輸入：
           * 第一行 >> 1 2 3
           * 第二行 >> 4 5 6
           */
          Scanner sc = new Scanner(System.in) ;
          String line = sc.nextLine() ;
          for(int a=0 ; a<2 ; a++) {
               int n = sc.nextInt();
               System.out.println(n);
          }
          
     }
     
     
}
