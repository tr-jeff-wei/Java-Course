
package zerojudge;

import java.util.Scanner;

public class a148_YouCannotPass {
      
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in) ;
            while(sc.hasNextLine()){
                  String line = sc.nextLine();
                  if( line==null || line.isEmpty()){
                        break; 
                  }
                  String[] digits = line.trim().split(" ") ;
                  double total = 0 ;
                  for (int i = 1; i < digits.length; i++) {
                        total = total + Integer.parseInt( digits[i]) ;                        
                  }
                  total = total / Integer.parseInt(digits[0]) ;
                  if( total>59){
                        System.out.println("no");
                  }else{
                        System.out.println("yes");
                  }
            }
            
            
      }
      
}
