package zerojudge;

import java.util.Scanner;

public class d066_上學去吧_時間字串 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int hh = sc.nextInt() ;
        int mm = sc.nextInt();

        int myTime = hh*100+mm ;
        if( myTime>=730 && myTime<1700){
            System.out.println("At School");
        }else{
            System.out.println("Off School");
        }
    }
}
