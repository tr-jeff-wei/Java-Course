
package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class b969_hello_everyone {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            
            // s1 =>  john mary jacob david
            String s1 = sc.nextLine() ;
            // names => [  "john" , "mary" , "jacob" , "david" ]
            String[] names = s1.split(" ") ;
            
            // s2 => hello
            String s2 = sc.nextLine() ;
            
            for (int i = 0; i < names.length; i++) {
                  System.out.println(s2 + ", " +names[i] );                  
            }
            
            
            
            
      }
}
