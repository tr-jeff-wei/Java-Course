package zerojudge;

import java.util.Scanner;

public class a244_新手訓練forif {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            long n2 = sc.nextInt();
            long n3 = sc.nextInt();
            switch (n1){
                case 1 :
                    System.out.println(n2+n3);
                    break ;
                case 2 :
                    System.out.println(n2-n3);

                    break ;
                case 3 :
                    System.out.println(n2*n3);

                    break ;
                case 4 :
                    System.out.println(n2/n3);

                    break ;
            }
        }
        sc.close();
    }
}
