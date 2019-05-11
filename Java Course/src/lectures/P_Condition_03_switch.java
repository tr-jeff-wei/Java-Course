package lectures;

public class P_Condition_03_switch {

     public static void main(String[] args) {

          System.out.println("Start ---------------");

          System.out.println("End ---------------");
     }

     static void example() {

          String myChoice = "A";
          // String myChoice = "B" ;
          // String myChoice = "C" ;

          String meals = "";

          switch (myChoice) {
               case "A":
                    break;
               case "B":
                    break;
               case "C":
                    break;
               default: // 沒有選到上面的選項時
                    break;

          }

          System.out.println("您的餐點是 " + myChoice + "餐，內容有 ==> " + meals);
     }

     static void practice_01() {

          // 仿照 example 用 switch 完成下列狀態
          // myChoice -> 1 [輸出] 餐點是漢堡
          // myChoice -> 2 [輸出] 餐點是三明治
          // myChoice -> 3 [輸出] 餐點是蛋餅
          // myChoice -> 4,5,6... 等 [輸出] 沒有這項餐點

          int myChoice = 1;
          String meals = "";

          System.out.println();

     }

     static void practice_02() {

          // 依照以下三個命令：add / minus / multiply
          // 將兩個變數 a , b 進行加法、減法、乘法的計算，答案放進變數 ans

          int a = 17;
          int b = 7;
          int ans = 0;
          String cmd = "add";

          switch (cmd) {
               case "add":
                    ans = a + b;
                    break;
               case "":
                    break;

          }
          
          // [印出]   add => 17 , 7 = 24
          // [印出]   minus => 17 , 7 = 10
          // [印出]   multiply => 17 , 7 = 119          
          System.out.println();
          
     }
     
     static void practice_03() {
          
          // 某月份的 3 號是星期一
          // 利用日期取 7 的餘數，計算出星期幾
          
          int date = 3 ; // <-- 輸入計算日期
          
          int n = date % 7 ;
          String result = "" ;
          
//          switch( n ) {
//               case ? :
//                    result = "星期一" ;
//                    break ;
//               case ? :
//                    result = "星期二" ;
//                    break ;
//          }
          
          // [印出]  本月份 ? 號是［星期? ］
          // System.out.println("本月份"+date+"  號是 ");
          
          
     }
     
     

}
