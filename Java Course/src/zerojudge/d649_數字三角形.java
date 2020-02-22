package zerojudge;

import java.util.Scanner;

public class d649_數字三角形 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        while(true) {

            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int star = 1 ;
            int m = n-1 ;
            for (int t = 0; t < n; t++) {
                for (int i = 0; i < m; i++) {
                    System.out.print("_");
                }
                for (int i = 0; i < star; i++) {
                    System.out.print("+");
                }
                System.out.println();
                m--;
                star++;
            }

        }
        sc.close();

    }
}
