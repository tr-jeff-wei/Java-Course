package homework;


public class hw_0511 {     
     
     public static void main(String[] args) { 
          // 下列程式將輸出什麼內容 
          show(5) ;
     }
     
     public static void show(int k) {
          System.out.println(k);
          if( k > 3) {
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
