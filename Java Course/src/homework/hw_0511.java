package homework;

import java.util.Scanner;

public class hw_0511 {     
     
     /*
      * 請問在使用者輸入下列訊息後，程式會印出什麼
      * -------------[輸入訊息]---------------
      * 第一行輸入：  3
      * 第二行輸入：  AB
      * 
      */
     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in) ;
          
          String n1string = sc.nextLine() ;
          int n1 = Integer.parseInt(n1string);
          
          String text = sc.nextLine();
          
          for( int i=0 ; i<n1 ; i++) {
               System.out.println(text+",");
          }
          
     }
     
     
     
     
     
     
     
     public static void main4(String[] args) { 
          // 下列程式將輸出什麼內容 
          show(5) ;
     }
     
     public static void show(int k) {
          System.out.println(k);
          if( k >= 3) {
               show( k-2 );
          }else {
               System.out.println("end!!");
          }
     }
     
     
     
     
     
     
     
     
     
     public static void main2(String[] args) {
          
          // 下列程式將輸出什麼內容
          int[] arr = new int[5] ;
          arr[0] = 12 ;
          arr[1] = 23 ;
          arr[2] = 34 ;
          arr[3] = 45 ;
          arr[4] = 56 ;
          
          for (int i = 0; i < arr.length ; i=i+3) {
               System.out.println(arr[i]);               
          }
     }
     
    public static void main3(String[] args) {
          
          // 完成下列的 for 程式
          // 印出 45 開始到  95 所有 5 的倍數數字
         
//          for( int i=?  ;   ?  ;   ?  ) {
//               System.out.println( i );
//          }
                  
     }    
    
    

     
     
}
