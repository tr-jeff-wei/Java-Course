
package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class c382_加減乘除 {
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            while( sc.hasNextInt()){
                  int a = sc.nextInt() ;
                  String o = sc.next() ;
                  int b = sc.nextInt() ;
                  
                  switch( o){
                        case "+":
                              System.out.println(a+b);
                              break;
                        case "-":
                              System.out.println(a-b);
                              break;
                        case "*":
                              System.out.println(a*b);
                              break;
                        case "/":
                              System.out.println(a/b);
                              break;
                        
                  }
            }
            sc.close();
            
            
      }
      
}
