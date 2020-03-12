package zerojudge;

import java.util.Scanner;

public class a147_PrintItAll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            boolean first = true ;
            for (int i = 1; i < n; i++) {
                if (i % 7 != 0) {
                    if( first){
                        System.out.print(i);
                        first = false;
                    }else{
                        System.out.print(" "+i);
                    }


                }
            }
            System.out.println();
            n=sc.nextInt();
        }

        sc.close();

    }
}
