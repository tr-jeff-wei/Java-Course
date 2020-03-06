package zerojudge;

import java.util.Scanner;

public class a215_明明愛數數 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            int total = 0 ;
            int count = 0 ;
            for (int i = n1; ; i++) {
                total = total+i ;
                count++;
                if(total>n2){
                    break;
                }
            }

            System.out.println(count);

        }
        sc.close();
    }
}
