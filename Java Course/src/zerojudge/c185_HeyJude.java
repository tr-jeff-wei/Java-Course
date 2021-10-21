
package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class c185_HeyJude {
      
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in) ;
            // (抓數字) int x = sc.nextInt() ;
            // name => Jeff
            String name = sc.nextLine();
            
            String text = "Hey Jude" ;
            // ans => Hey Jeff
            String ans = text.substring(0,4) + name ;
            
            System.out.println(ans);
            
      }
      
}
