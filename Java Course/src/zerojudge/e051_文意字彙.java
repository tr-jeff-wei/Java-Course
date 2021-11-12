package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class e051_文意字彙 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // 取得題目
            String s = sc.next();  // <--  s = "apple"  / "cat"
            // 抓字首
            String w1 = s.substring(0, 1) ;
            // 抓字尾
            String w2 = s.substring(s.length()-1, s.length()) ; 

            // 印字首
            System.out.print(w1);
            for ( int i=0 ; i< s.length()-2 ; i++) { // 利用 s.length() 去計算
                  System.out.print("_");
            }
            // 印字尾
            System.out.print(w2);
      }

}
