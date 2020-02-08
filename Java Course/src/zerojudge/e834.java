package zerojudge;

import java.util.Scanner;

public class e834 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int base = sc.nextInt();
        while( true ){
            int n = sc.nextInt() ;
            if( n==0 ){
                break ;
            }
            int remainder = n%base ;
            if( remainder==0){
                System.out.println(n/base);
            }else{
                System.out.println(base-remainder);
            }
        }
    }
}
