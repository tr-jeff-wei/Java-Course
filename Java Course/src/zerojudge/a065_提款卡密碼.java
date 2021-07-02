
package zerojudge;

import java.util.Scanner;


public class a065_提款卡密碼 {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in) ;
            while( sc.hasNextLine()){
                  String x = sc.nextLine();
                  for( int i=0 ; i<x.length()-1 ; i++ ){
                        int code = x.charAt(i) - x.charAt(i+1);
                        if( code<0){
                              code = code * -1 ;
                        }
                        System.out.print(code);
                  }
                  System.out.println("");
            }
            
            
            
      }
}
