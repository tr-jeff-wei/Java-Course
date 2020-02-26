package zerojudge;

import java.util.Scanner;

public class c420_Bert的三角形_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int star = (i)*2+1 ;
            int space = n-i-1 ;



            for (int j = 0; j < space; j++) {
                System.out.print("_");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("_");
            }
            System.out.println();
        }
        sc.close();
    }
}
