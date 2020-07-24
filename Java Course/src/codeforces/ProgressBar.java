

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class ProgressBar {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in) ;
            int n =sc.nextInt();
            int k = sc.nextInt();
            double t = sc.nextInt();

            double r = t*n*k/100 ;
            int r2 = (int)r;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                  if( r2>=k){
                        sb.append(k).append(" ");
                        r2-=k;
                  }else{
                        sb.append(r2).append(" ") ;
                        r2=0;
                  }                  
            }
            System.out.println(sb.toString().trim());
            
      }
}
