package zerojudge;

import java.util.Scanner;

public class a059_完全平方和 {
 
    public static void main(String[] args) {        

        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt() ;
            int b = sc.nextInt() ;
            int ans = solve(a, b);
            System.out.println("Case "+i+": "+ans);
        }
        sc.close();
    }

    public static int solve(int a , int b ){
        double x = Math.sqrt(a) ;
        int k = (int)Math.ceil(x) ;

        int total =0;
        for (int i = k; ; i++) {
            int square = i*i ;
            if( square<=b){
                total += square ;
            }else{
                break ;
            }
        }
        return total ;
    }
}
