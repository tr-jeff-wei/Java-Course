package apcs.tw;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J10802_f640_函數運算式求值 {
      
      static int i = -1;

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] tokens = sc.nextLine().split(" ");
            int ans = getNumber(tokens) ;
            System.out.println(ans);
      }

      static int getNumber(String[] tks ) {
            i++ ;
            switch (tks[i]) {
                  case "f"://f(x) = 2x – 3                        
                        return 2*getNumber(tks)-3;
                  case "g"://g(x, y) = 2x +y – 7                        
                        return 2*getNumber(tks)+getNumber(tks)-7;
                  case "h"://h(x, y, z) = 3x – 2y + z                        
                        return 3*getNumber(tks)-2*getNumber(tks)+getNumber(tks);
                  default:
                        return Integer.parseInt(tks[i]) ;
            }
           
      }

}
