package zerojudge;

import java.util.Arrays;
import java.util.Scanner;

public class d507_三角形的判斷 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int[] ls = new int[3] ;
        ls[0] =sc.nextInt() ;
        ls[1] =sc.nextInt() ;
        ls[2] =sc.nextInt() ;

        Arrays.sort(ls);
        for (int i = 0; i < ls.length; i++) {
            ls[i] =ls[i]*ls[i];
        }
        if( ls[2]==ls[0]+ls[1]){
            System.out.println("right triangle");
        }else if( ls[2]<ls[0]+ls[1]){
            System.out.println("acute triangle");
        }else{
            System.out.println("obtuse triangle");
        }

    }

}
