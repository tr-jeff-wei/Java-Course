package lectures;

public class P_Loop_01_for_while {
     
     public static void main(String[] args) {

          System.out.println("Start ---------------");

          System.out.println("End ---------------");
     }
     
     
     
     public static void example01() {
          
          // 重複 5 次 -- for 方法
          int i=1 ;
          for( ; i<=5 ; ) {
               System.out.println("*");
               i=i+1 ;
          }
          
          // 重複 5 次 -- while 方法
          i=1 ;
          while( i<= 5 ) {
               System.out.println("*");
               i=i+1 ;
          }
          
     }
     
     
     public static void example02() {          
          
          
          // 印出 1-5 數字 -- for 方法
          int i=1 ;
          for( ; i<=5 ; ) {
               System.out.println("for -> "+i);
               i=i+1 ;
          }
          
          // 印出 1-5 數字 -- while 方法
          i=1 ;
          while( i<= 5 ) {
               System.out.println("while ->"+ i);
               i=i+1 ;
          }
          
     }
     
     public static void q01() {          
                
          
          int i=1 ;
          for( ; i<10 ; ) {
               System.out.println("for -> "+i);
               i=i+2 ;
          }          
          
          i=1 ;
          while( i<10 ) {
               System.out.println("while ->"+ i);
               i=i+2 ;
          }
          
          // 請問程式會印出哪些內容
          
     }
     
     public static void q02() {                   
          
          
          int i=1 ;
          for( ; i<20 ; ) {
               System.out.println("for -> "+i);
               i=i*2 ;
          }          
          
          i=1 ;
          while( i<20 ) {
               System.out.println("while ->"+ i);
               i=i*2 ;
          }
          
          // 請問程式會印出哪些內容
          
     }    
     
     public static void q03() {
          
          // 用 for 程式印出，從 2  開始，每次加 3 的數字，到 100 之前
          // ex: 2 5 8 11 14 ....  (<100)
          
          
     }
         
     public static void q04() {
          
          // 用 while 程式印出，從 2  開始，每次加 3 的數字，到 100 之前
          // ex: 2 5 8 11 14 ....  (<100)
          
          
     }     
     
     // ------- for 完整寫法 --------------  //
     public static void example_for() {    
          
          // 印出 1~100
          for( int i=1 ; i<=100 ; i=i+1) {
               System.out.println("for1 -> "+i);
          }
          
          // 印出偶數 2 4 6 ... 100
          for( int i=2 ; i<=100 ; i=i+2) {
               System.out.println("for2 -> "+i);
          }
          
          // 寫出印出 0 5 10 15 ... 100 的程式（從0開始，每次加 5 一直加到 100）
     }
     
     
     
     // ------- continue 應用 --------------  //
     public static void example_continue() {         
          
          // 印出 1~100 的數字，但是遇到偶數不要印                     
        
          for( int i=1 ; i<=100 ; i=i+1) {
               
               if( i%2==0 ) {
                    continue ;
               }
               
          }
     } 
     
     public static void continue_q01() {         
          
          // 1~100 的數字中，印出 10 位 + 個位的總和
          // 但是加起來總和是 12 的跳過不要印
        
          for( int i=1 ; i<=100 ; i=i+1) {
               
               int n10 = i/10 ;
               int n   = i%10 ;
               int sum = n10 + n ;
               
               // 怎麼應用 continue 跳過的程式寫這裡
               // ....
               if( sum==12)continue ;
               
               System.out.println(i+" --> 個位+十位= "+sum);
                              
          }
     } 
     
     // ------- break 應用 --------------  //
     public static void example_break() {         
          
          // 遇到 17 就停止迴圈
          
          int i=1 ;
          while( i<=100) {
               
               System.out.println("-->"+ i );
               
               if( i== 17) {
                    break ;
               }
               
          }
     }     
     
     public static void break_q01() {
          
          // break 應用，改下方程式，讓他
          // 從 1 到 100 ，運用
          // if 判斷式 + break 
          // 找到［ 除以7會餘 1，且除以11會餘 3 ］的第一個數字
          
          int i = 1 ;
          while( i<= 100) {
               
               int n1 = i%7 ;
               int n2 = i%11 ;
               
//               if() {
//                   System.out.println("找到數字是 "+i);                    
//                   break ; 
//               }
               
          }
     }
     
     public static void break_02() {
          
          // 將 n 反覆乘以 2
          // 運用 if + break ，找到乘第幾次後，n 會超過 10000
          
          int n=1 ;
          int count = 1 ;
          while( true ) { 
               
               System.out.println("第"+count+"次後 -->   n="+n);
               n = n * 2 ;
          }
          
          
     }

     
     
     
}
