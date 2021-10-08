package zerojudge;

import java.util.Scanner;

public class d460_山六九之旅 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if (age < 6) {
                  System.out.println(0);
            } else if (age <= 11) {
                  System.out.println(590);
            } else if (age <= 17) {
                  System.out.println(790);
            } else if (age <= 59) {
                  System.out.println(890);
            }else{
                  System.out.println(399);
            }

      }
}
