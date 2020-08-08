
package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class e621_免費停車 {
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            int n = sc.nextInt() ;
            for (int i = 0; i < n; i++) {
                  boolean found = false; 
                  int start = sc.nextInt() ;
                  int end = sc.nextInt() ;
                  int cntDivide=sc.nextInt() ;
                  for (int j = start+1; j < end; j++) {
                        if( j%cntDivide!=0){
                              System.out.print(j+" ");
                              found = true ;
                        }                        
                  }
                  if( found )
                        System.out.println("");
                  else
                        System.out.println("No free parking spaces.");
            }
      }
      
}
