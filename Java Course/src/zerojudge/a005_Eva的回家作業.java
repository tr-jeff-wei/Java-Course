package zerojudge;

import java.util.Scanner;

public class a005_Eva的回家作業 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int n4 = sc.nextInt();
            if( n2-n1 == n3-n2){
                System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+(n4+(n3-n2)));
            }else{
                System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+(n4*(n3/n2)));
            }
        }
        sc.close();
    }
}
