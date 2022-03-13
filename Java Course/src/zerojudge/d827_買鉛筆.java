
package zerojudge;

import java.util.Scanner;

public class d827_買鉛筆 {

      public static void main(String[] args) {
            
            
            
            Scanner sc = new Scanner(System.in) ;
            int n = sc.nextInt() ;
            int total = (n/12)*50+(n%12)*5 ;
            System.out.println(total);
      }
      
}
