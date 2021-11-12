
package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class c659_連接詞 {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in) ;
            
            String t = sc.nextLine() ;
            String[] xs = t.split(" ") ;
            
            for (int i = 1 ; i < xs.length; i++) {
                 
                  if( i<xs.length-1 ){
                        System.out.print(xs[i]+" "+xs[0]+" ");
                  }else{
                        System.out.print(xs[i]);
                  }
                  
            }
            
      }
}
