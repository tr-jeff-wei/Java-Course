package zerojudge;

import java.util.Scanner;


/**
 *
 * @author chuan
 */
public class e794_黃金比例 {
  
      
      public static void main(String[] args) {
            
            
            Scanner sc = new Scanner(System.in) ;
            int n = sc.nextInt() ;
            int[] ns = new int[]{0,1} ;
            int nTerm = 2 ;
            while( nTerm <= n+1){
                  
                  int i =  nTerm%2 ;
                  ns[i] = ns[0]+ns[1] ;
                  
                  if( nTerm==n){
                        System.out.print(ns[i]+":");
                  }else if(nTerm==n+1){
                        System.out.println(ns[i]);
                  }
                  
                  nTerm++ ;
            }
            
                    
      }
      
}
