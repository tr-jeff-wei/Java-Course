package zerojudge;

import java.util.Scanner;

public class b294_經濟大恐荒 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int total = 0 ;
            for (int i = 0; i < n; i++) {
                  total += sc.nextInt()*(i+1) ;
            }
            
            System.out.println(total);
      }

}
