package zerojudge;

import java.util.Scanner;


public class e786_修辭迴文_Palindrome_TOI練習賽 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            String line = sc.nextLine() ;
            // 奇數不考慮
            if( line.length()%2==1){
                  System.out.println("NO");
                  return ;
            }
            
            int mid = line.length()/2 ;
            boolean no = false ;
            for (int i = 0; i < mid; i++) {
                  char frontChar = line.charAt(i) ;
                  char lastChar = line.charAt(line.length()-1-i) ;
                  if( frontChar!=lastChar){
                        no = true ;
                        break ;
                  }
            }
            if(!no){
                  System.out.println("YES");
                  System.out.println(line.substring(0,mid));
            }else{
                  System.out.println("NO");
            }           
            
      }
}
