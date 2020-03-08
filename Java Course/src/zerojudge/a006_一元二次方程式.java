package zerojudge;

import java.util.Scanner;

public class a006_一元二次方程式 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;
        int c = sc.nextInt() ;
        //鑑別式 b*b-4ac

        int d = b*b-4*a*c ;
        if(d<0){
            System.out.println("No real root");
            return ;
        }

        int x = -1*b/a/2 ;
        if(d==0){
            System.out.println("Two same roots x="+x);
            return ;
        }
        int dd =(int)Math.pow(d,0.5) ;
        int x1 = (-1*b+dd)/2/a;
        int x2 = (-1*b-dd)/2/a ;
        System.out.println("Two different roots x1="+x1+" , x2="+x2);

    }

}
