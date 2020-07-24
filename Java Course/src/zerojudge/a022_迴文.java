
package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class a022_迴文 {
      
      public static void main(String[] args) {
            
            
            Scanner sc = new Scanner(System.in) ;
            String test = sc.nextLine() ;
            int a = 0 ;
            int b = test.length()-1 ;
            while(true){
                  if( a>=b){
                        break;
                  }
                  
                 if( test.charAt(a)!=test.charAt(b)){
                       System.out.println("no");
                       return ;
                 }                  
                 a++;
                 b--;
            }
            System.out.println("yes");
            
            
      }
      
      
}
