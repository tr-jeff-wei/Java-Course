package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class f072_裡的後花園_TOI {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            boolean[] arr = new boolean[n];
            int[] data = new int[n] ;
            int first = -1 ;
            int end = -1 ;
            for (int i = 0; i < n; i++) {
                  data[i] = sc.nextInt();
                  if( data[i]==1){
                        if( first==-1){
                              first = i;
                        }
                        end=i ;
                  }
            }
            
            int c = 0 ;
            for (int i = first; i < end; i++) {
                  
                  if( data[i]==1 || data[i]==9){
                        continue ;
                  }
                  if(i>0 && data[i-1]==9){
                        continue ;
                  }
                  if(i<data.length-1 && data[i+1]==9){
                        continue ;
                  }
                  c++ ;
            }
            System.out.println(c);

      }
}
