package zerojudge;

import java.util.Scanner;

public class e286_籃球比賽 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int homeWin=0;
                int guestWin=0 ; 
                for (int r = 0; r < 2; r++) {
                        int total1 =  0;
                        for (int home = 0; home < 4; home++) {
                                total1+= sc.nextInt() ;                                
                        }
                        System.out.print(total1+":");
                        int total2 = 0 ;
                        for (int guest = 0; guest < 4; guest++) {
                                 total2+= sc.nextInt() ; 
                        }
                        System.out.println(total2);
                        if( total1>total2){
                                homeWin++ ;
                        }else if( total2 > total1){
                                guestWin++ ;
                        }                        
                }
                if( homeWin==guestWin){
                        System.out.println("Tie");
                }else if( homeWin > guestWin ){
                        System.out.println("Win");
                }else{
                        System.out.println("Lose");
                }

        }

}
