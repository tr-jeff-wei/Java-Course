package apcs.tw;

import java.util.Scanner;

public class 常用工具 {
     public static void main(String[] args) {

          // ------------------
          // 1. 取得輸入工具
          // ------------------

          Scanner sc = new Scanner(System.in);

          String line = sc.nextLine(); // 取得［一行文字］
          int n = sc.nextInt(); // 取得［數字］


          // ------------------
          // 2. 轉換工具
          // ------------------

          String text = "1234";
          int num = Integer.parseInt(text); // 文字轉數字

          String text2 = "12 34 56 end"; // 切開空格，取得每一個元素
          String[] arr = text2.split(" ");
          System.out.println(arr[0]); // 12 (String)
          System.out.println(arr[1]); // 34 (String)
          System.out.println(arr[2]); // 56 (String)
          System.out.println(arr[3]); // end (String)


          // ------------------
          // 3. 文字工具
          // ------------------
          String myText = "sweetmeat";
          int size = myText.length(); // 取得文字長度
          // 取得文字片段內容，位置
          int p = myText.indexOf("meat"); // p->5
          int p2 = myText.indexOf("meet"); // p2->-1 找不到是 -1
          // 切下特定位置片段
          String seg = myText.substring(1, 5); // seg-> "weet"



          // ------------------
          // 4. 數學工具
          // ------------------
          double r = Math.random();  // 隨機數取得 0-1 之間
          int k = -5, a = 7, b = 3;
          int k2 = Math.abs(k);      // 去掉［負號］      k2->5 
          int maxN = Math.max(a, b); // 拿到［大］的數  maxN->7
          int minN = Math.min(a, b); // 拿到［小］的數  minN->3
          


     }
}
