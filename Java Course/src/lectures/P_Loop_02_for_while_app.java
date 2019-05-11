package lectures;

public class P_Loop_02_for_while_app {
     
     public static void main(String[] args) {

          System.out.println("Start ---------------");

          System.out.println("End ---------------");
     }
     
     
     // 雙層迴圈：範例
     public static void doubleLoopExample() {
          
          for (int a = 1; a <= 5; a++) {
               for (int b = 7; b <= 9 ; b++) {
                    String s = a+"-"+b ;
                    System.out.println( s );
               }
          }
          
          // 1-7
          // 1-8
          // 1-9
          // 2-7
          // 2-8
          // 2-9
          // ...
          
     }
     
     // 雙層迴圈 --> 運用雙層迴圈，列出 0~99數字中，10位數是偶數，個位數是奇數的數字。
     public static void doubleLoopExample_q1() {
          
          // 運用雙層迴圈，製造出如下 10位數是偶數，個位數是奇數的數字
          // 範例：
          //         21
          //         23
          //         25
          //         27
          //         29
          //         41
          //         43
          //         ...
          
          // for(   )       <-- 外層負責 10位數
          //     for(   )   <-- 內層負責個位數
          
     }
     
     // 雙層迴圈 --> 運用雙層迴圈，列出 0~99數字中，10位數是奇數，個位數是偶數的數字。
     public static void doubleLoopExample_q2() {
          
     }
     
     // 雙層迴圈 --> 乘法表
     public static void doubleLoopExample_q3() {
          
          // 2 x 1 = 2 
          // 2 x 2 = 4
          // 2 x 3 = 6 
          // ...
          // 9 x 9 = 81
          
          
          // for(   )       <-- 被乘數
          //  for(   )      <-- 乘數
          //         int ans = 被乘數*乘數 ;
          //         String result = 被乘數  + "x" + 乘數 + " = " + ans ;
          
          
     }
     
     
     
     // 三層乘法表
     public static void doubleLoopExample_q4() {
          
          // 思考步驟：建立三層 for
          //         第一層 for : 2-9
          //         第二層 for : 1-9
          //         第三層 for : 1-9
          //                組合三層的數字，算出結果，串出最後的文字串
          
          
          // 範例：
          // 2 x 1 x 1 = 2 
          // 2 x 1 x 2 = 4
          // ...
          // 2 x 2 x 1 = 4
          // 2 x 2 x 2 = 8 
          // ..
          // 3 x 1 x 1 = 3
          // ..
          
          
     }
     
     
     // ID 編號： A1-1 , A1-2 , A1-3 , A2-1 , A2-2 , A2-3
     //    編號規則： A[1-3]-[1-5]
     public static void doubleLoopExample_q5() {
          
          // 思考步驟：
          //  1. 用第一個 for 印出 A 後面的第一個數字：1-3
          //  2. 用第二個 for 印出 A 後面的第二個數字：1-5
          //  3. 組合 A m 第一個、第二個數字
          
          
     }
     
     
     // 進階：加總 1~1000 的數字
     public static void practice_q01() {
          
          // 思考步驟：
          //  1. 用 for 設定 1~1000 的數字
          //  2. 用另一個變數，把每次 for 設定的數字加進來
          
     }
     
     // 進階：找 1-100 中的質數
     public static void practice_q02() {
          
          // 思考步驟：
          //  1. 用 for 設定 1~100 的數字
          //  2. 把 for 設定的數字進行質數檢查
          //  3.     假設這次檢查的數字是 4 , 再做一個 for 從 2~這個數字(4)之前的數字(3) ==> for:2-3
          //         確定檢查的數字(4)，是不是可以被第二次 for 裡面的這個數字整除
          
     }
     
     // 進階：印出編號  A0001~A0150
     // 串接 ID，數字平位 --> A0001 , A0002 , ... , A0010 , A0011
     public static void practice_q03() {
          
          // 思考步驟：
          //  1. 用 for 設定 1~150 的數字          
          //  2. 計算 for 設定的數字，前面要補幾個零
          //  3. 再寫第二個 for 補上缺的零
          
     }
     
     
}
