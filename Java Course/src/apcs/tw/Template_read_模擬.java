package apcs.tw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 練習取得輸入數字
 * 
 */

public class Template_read_模擬 {

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
      *  output---> 21
      */

     public static void main1(String[] args) throws UnsupportedEncodingException {

          
          String data = "3\n" + 
                    "5\n" + 
                    "7\n" + 
                    "9\n" + 
                    "15\n" + 
                    "" ;
          InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
          System.setIn(testInput);
          
          
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
      *使用者輸入 
      * > 1 行：以下每行有幾個數字要加總
      * > 2 , 3 , .. ：每一行要加總的數字
      *結果輸出
      * > 每一行加總的結果
      *
      * 範例：
      *  input-> 3 2 4
      *  input-> 5 6 7
      *  input-> 2 5
      *  input-> 2 4 6 2
      *  output---> 18
      *  output---> 7
      *  output---> 14
      */
     public static void main(String[] args) throws UnsupportedEncodingException {
          
          String data = "3 2 4\n" + 
                    "5 6 7\n" + 
                    "2 5\n" + 
                    "2 4 6 2\n" + 
                    "" ;
          InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
          System.setIn(testInput);          
          
          // 建立取得輸入物件
          Scanner sc = new Scanner(System.in) ;
          String line = sc.nextLine() ; // 拿到第一行的訊息
          String[] lines = line.split(" ") ; // 將訊息每個部份分開
          for(int i=0 ; i<lines.length ; i++) {
               int num = Integer.parseInt( lines[i] );
               int total = 0 ;
               for( int j=0 ; j<num ; j++ ) {
                    int n = sc.nextInt() ;
                    total = total+n ;
               }
               System.out.println(total);
          }                  
     }
}
