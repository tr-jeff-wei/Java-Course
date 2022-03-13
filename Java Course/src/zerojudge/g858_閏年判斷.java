
package zerojudge;

import java.util.Scanner;


public class g858_閏年判斷 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            int n = sc.nextInt() ;
            
            if( n%4!=0){
                  System.out.println("NO") ;
                  return ;
            }
            if( n%100!=0){
                  System.out.println("YES");
                  return ;
            }
            if( n%400!=0){
                  System.out.println("NO");
                  return ;
            }
            System.out.println("YES");
      }
      
}
