
package codeforces;

import java.util.Scanner;

public class NewClass {
     
      
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in) ;
            int n = sc.nextInt() ;
            for (int i = 0; i < n; i++) {
                  int r = sc.nextInt() ;
                  int c = sc.nextInt() ;
                  
                  if(r==1&&c==1){
                        System.out.println(1);
                  }else if( r%2==0 && c%2==0){
                        System.out.println(r*c/2);
                  }else if( r%2==0 && c%2==1){
                        System.out.println(c*r/2);
                  }else if( r%2==1 && c%2==0){
                        System.out.println(c*r/2);
                  }else{
                        // let r is bigger
                        if( c>r){
                              int t = r ;
                              r = c ;
                              c = t ;
                        }
                        int m = r-1 ;
                        int total = m*c/2 ;
                        total = total+(c+1)/2 ;
                        System.out.println(total);                        
                  }
            }
            
            
      }
      
}
