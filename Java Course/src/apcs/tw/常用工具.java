package apcs.tw;

import java.util.Scanner;

public class 常用工具 {
public static void main(String[] args) {
     
     // ------------------
     // 1. 取得輸入工具
     // ------------------
     
     Scanner sc = new Scanner(System.in) ;
     
     String line = sc.nextLine();  // 取得［一行文字］     
     int n = sc.nextInt() ;        // 取得［數字］
     
     
     // ------------------
     // 2. 轉換工具
     // ------------------
     
     String text= "1234" ;
     int num = Integer.parseInt(text) ; // 文字轉數字
     
     String text2 = "12 34 56 end" ;        // 切開空格
     String[] arr = text2.split(" ") ;
     System.out.println(  arr[0]   );   // 12 (String) 
     System.out.println(  arr[1]   );   // 34 (String) 
     System.out.println(  arr[2]   );   // 56 (String) 
     System.out.println(  arr[3]   );   // end (String) 
     
     
     // ------------------
     // 3. 文字工具
     // ------------------
          
     
     
     
     
     // ------------------
     // 3. 數學工具
     // ------------------    
     
}
}
