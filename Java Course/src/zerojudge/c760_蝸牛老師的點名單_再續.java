
package zerojudge;

import java.util.Scanner;

public class c760_蝸牛老師的點名單_再續 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            // 抓取輸入 --> line
            String line = sc.nextLine();
            // 把 line 用空格切開
            String[] split = line.split(" ");
            
            for (int i = 0; i < split.length; i++) {
                  String w = split[i] ;
                  // 把第一個字變大寫
                  String c1 = w.substring(0, 1).toUpperCase();
                  // 取扣掉第一個字以外的字母
                  String c2 = w.substring(1, w.length());
                  
                  System.out.println(c1+c2);                  
                  
            }
            
      }
}
