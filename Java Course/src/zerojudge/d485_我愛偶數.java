package zerojudge;

import java.util.Scanner;

public class d485_我愛偶數 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            long a = sc.nextInt();
            long b = sc.nextInt();
            
            // 讓 a 開頭一定是奇數
            if( a%2==0){
                  a-- ;
            }
            // 讓 b 結尾一定是偶數
            if( b%2==1){
                  b-- ;
            }
            
            long c = (b-a+1)/2 ;
//            int total = 0;
//            for (int i = a; i <= b; i = i + 1) {
//                  if (i % 2 == 0) {
//                        total++;
//                  }
//            }
            System.out.println(c);
      }
}
