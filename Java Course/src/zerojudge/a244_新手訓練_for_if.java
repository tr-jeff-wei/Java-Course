package zerojudge;

import java.util.Scanner;

public class a244_新手訓練_for_if {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  long a = sc.nextInt();
                  long b = sc.nextInt();
                  long c = sc.nextInt();
                  if(a==1){
                        System.out.println(b+c);
                  }
                  if(a==2){
                        System.out.println(b-c);
                  }
                  if(a==3){
                        System.out.println(b*c);
                  }
                  if(a==4){
                        System.out.println(b/c);
                  }
            }
      }
}
