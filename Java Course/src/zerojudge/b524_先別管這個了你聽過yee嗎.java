
package zerojudge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chun Fong
 */
public class b524_先別管這個了你聽過yee嗎 {
      public static void main(String[] args) {                
            
            Scanner sc = new Scanner(System.in) ;
            while(sc.hasNextLine()){
                  String q = sc.nextLine() ;
                  getCount(q) ;
            }
            sc.close();
      }
      // 目標： yeeyeeyeeyee ...
      // 看 y 移動到正確位置的距離總和
      public static void getCount(String s){
            int yPos = 0 ;
            int total = 0 ;
            for (int i = 0; i < s.length(); i++) {
                  char c = s.charAt(i) ;
                  if( c=='y'){
                       total += Math.abs(i-yPos) ;
                       yPos+=3 ;
                  }
            }
            System.out.println(total);
      }
      
}
