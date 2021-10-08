
package zerojudge;

import java.util.Scanner;


public class a799_正值國 {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in) ;
            int a = sc.nextInt() ;
            
            if( a<0){
                  a = a * -1 ;
            }
            
            System.out.println(a);
      }
      
}
