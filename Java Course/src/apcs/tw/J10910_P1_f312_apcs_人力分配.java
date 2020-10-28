
package apcs.tw;

import java.util.Scanner;


public class J10910_P1_f312_apcs_人力分配 {
      
      
      public static void main(String[] args) {
            
            
            Scanner sc = new Scanner(System.in) ;
            int a1 = sc.nextInt() ;
            int b1 = sc.nextInt() ;
            int c1 = sc.nextInt() ;
            
            int a2 = sc.nextInt() ;
            int b2 = sc.nextInt() ;
            int c2 = sc.nextInt() ;
            
            int n = sc.nextInt() ;
            
            int max = 0 ;
            for (int i = 0; i <= n ; i++) {
                  int n1 = i ;
                  int n2 = n-i ;
                  
                  int total = a1*n1*n1+b1*n1+c1 ;
                  total = total + a2*n2*n2+b2*n2+c2 ;
                  
                  if( i==0 || total > max){
                        max = total ;
                  }                  
                  
                  System.out.println(n1+"  "+n2+"  "+total);
            }
            
            System.out.println(max);
            
      }
      
      
}
