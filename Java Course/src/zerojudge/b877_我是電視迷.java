package zerojudge;

import java.util.Scanner;

public class b877_我是電視迷 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if( a < b ){
                  System.out.println(b-a);
            }else{
                  System.out.println(b+100-a);
            }
      }

}
