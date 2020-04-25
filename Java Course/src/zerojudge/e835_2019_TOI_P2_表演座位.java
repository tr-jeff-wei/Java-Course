package zerojudge;

import java.util.Scanner;

public class e835_2019_TOI_P2_表演座位{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int id = sc.nextInt();
        if( id<=2500){
            int n = (id-1)/25+1 ;
            int m = id%25 ;
            if( m==0 ){
                m=25 ;
            }
            System.out.println(1+" "+n+" "+m);
        }else if( id<=7500){
            id-=2500 ;
            int n = (id-1)/50+1 ;
            int m = id%50 ;
            if( m==0 ){
                m=50 ;
            }
            System.out.println(2+" "+n+" "+m);
        }else{
            id-=7500 ;
            int n = (id-1)/25+1 ;
            int m = id%25 ;
            if( m==0 ){
                m=25 ;
            }
            System.out.println(3+" "+n+" "+m);
        }
    }
}
