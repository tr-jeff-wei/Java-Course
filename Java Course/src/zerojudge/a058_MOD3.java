package zerojudge;

import java.util.Scanner;

public class a058_MOD3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int mod3=0 ;
        int mod3r1=0;
        int mod3r2=0;
        for (int i = 0; i < n; i++) {
            int digit = sc.nextInt() ;
            if( digit%3==0){
                mod3++ ;
            }
            if( digit%3==1){
                mod3r1++;
            }
            if( digit%3==2){
                mod3r2++;
            }
        }
        System.out.println(mod3+" "+mod3r1+" "+mod3r2);



    }
}
