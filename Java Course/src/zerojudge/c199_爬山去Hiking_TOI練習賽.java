
package zerojudge;

import java.util.ArrayList;
import java.util.Scanner;

public class c199_爬山去Hiking_TOI練習賽 {
 
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            int n =sc.nextInt() ;
            int[] att = new int[n] ;
            for (int i = 0; i < att.length; i++) {
                  att[i] = sc.nextInt() ;                  
            }
            
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i < att.length; i++) {
                  if( att[i]>att[i-1]){
                        list.add(1) ;
                  }else if(att[i]<att[i-1]){
                        list.add(-1) ;
                  }                  
            }
            int count = 0 ;
            for (int i = 1; i < list.size(); i++) {
                  if( list.get(i-1)==1  &&  list.get(i)==-1){
                        count++ ;
                  }                  
            }
            System.out.println(count);
      }
}
