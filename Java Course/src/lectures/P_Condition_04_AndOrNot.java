package lectures;

public class P_Condition_04_AndOrNot {

     public static void main(String[] args) {

          System.out.println("Start ---------------");

          System.out.println("End ---------------");
     }

    static void q01_And() {
         
         int k = 14 ;
         
         if( k>5 && k%2==1 ) {
              System.out.println("A");
         }else {
              System.out.println("B");
         }
         
         if( k>5 ) {
              if( k%2==1 ) {
                   System.out.println("C");
              }
         }
         
         // 請問會印出哪些結果
    }
    
    static void q02_And() {
         
         int n = 17 ;
         
         // 寫出大於 10 小於 20 的判斷
         if( n>10 ) {
              if( n< 20 ) {
                   System.out.println("方法 1 : 大於 10 小於 20 ");
              }
         }
         
         // 用 AND（&&) 語法
//         if(    ?    ) {
//              System.out.println("方法 2 : 大於 10 小於 20 ");
//         }
         
         
    }
    
    static void q03_Or() {
         
         int k = 3 ; 
         
         // k 小於 10 或是  k 是偶數都可以
         if( k<10 || k%2==0 ) {
              System.out.println("A");
         }else {
              System.out.println("B");
         }
         
         
         k = 22 ;
         // k 小於 10 或是  k 是偶數都可以
         if( k<10 || k%2==0 ) {
              System.out.println("C");
         }else {
              System.out.println("D");
         }               
         
    }

    static void q04_Or() {
         /*
         
         // 找到一個數字 K，可以讓結果印出 B
         int k = ? ; 
         
         // k 小於 10 或是  k 是偶數都可以
         if( k<10 || k%2==0 ) {
              System.out.println("A");
         }else {
              System.out.println("B");
         }
         
         */
         
    }
    
    static void q05_Not() {
         
         
         int n = 50 ;
         
         if( n != 50 ) {
              System.out.println("這不是 50 ");
         }else {
              System.out.println("這是 50 ");
         }
         
         String name = "Jeff" ;
         if( !name.equals("Tom")) {
              System.out.println("這不是 Tom ");
         }else {
              System.out.println("Hi Jeff");
         }
         
         
         
    }    
    
    
    
    
    
}
