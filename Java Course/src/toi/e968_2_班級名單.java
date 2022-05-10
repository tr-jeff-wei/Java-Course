package toi;


import java.util.Scanner;

public class e968_2_班級名單 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int i = n; i > 0; i--) {
                  if (i == a) {
                        continue;
                  }
                  if (i == b) {
                        continue;
                  }
                  if (i == c) {
                        continue;
                  }
                  System.out.println("No. "+i);
            }
      }

}
