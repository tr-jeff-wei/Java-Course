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

          for (int m = 1; m < 3; m++) {
               for (int n = 2; n <=4 ; n++) {
                    System.out.println( data[m][n] );
               }
          }
          
     }



     public static void main(String[] args) {
          
          
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

          for (int m = 1; m <= 3; m++) {
               System.out.println(data[m][3]);
          }
          
          
     }

     
     public static void main1(String[] args) {

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

          for (int m = 1; m <= 3; m++) {
               String result = data[m-1][3]+"--"+data[m][3]+"--"+data[m+1][3];
               System.out.println(result);
          }
     }
     
     
}
