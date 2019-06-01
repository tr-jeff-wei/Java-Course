package homework;

import java.util.Scanner;

public class hw_0531 {

     
     public static void main2(String[] args) {
          /**
           * 請問下列程式，將會輸出什麼內容
           */

          String[][] data ={
                  {"甲A","甲B","甲C","甲D","甲E"},
                  {"乙A","乙B","乙C","乙D","乙E"},
                  {"丙A","丙B","丙C","丙D","丙E"},
                  {"丁A","丁B","丁C","丁D","丁E"},
                  {"戊A","戊B","戊C","戊D","戊E"}

          };


          
     }
     
     public static void main3(String[] args) {
          

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
