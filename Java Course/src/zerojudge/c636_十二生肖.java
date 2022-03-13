
package zerojudge;

import java.util.Scanner;

public class c636_十二生肖 {
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            String w = "鼠牛虎兔龍蛇馬羊猴雞狗豬" ;
            while( sc.hasNextInt() ){
                  
                  int n = sc.nextInt()-1 ;
                  // 沒有民國 0 年，所以<0，要多加一年
                  if( n<0){
                        n++;
                  }
                  while(n<0){
                        n=n+12 ;
                  }
                  int kWord =  n%12 ;
                  System.out.println(w.charAt( kWord ));
                                   
            }
      }
}
