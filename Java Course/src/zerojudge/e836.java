package zerojudge;

import java.util.ArrayList;
import java.util.Scanner;

public class e836 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int[] count = new int[20000] ;
        int max = -1 ;
        int diffCount = 0 ;
        ArrayList<Integer> list = new ArrayList<>() ;
        for (int i = 0; i <n ; i++) {
            int digit = sc.nextInt()+10000 ;
            count[digit]++ ;
            if( count[digit]==1){
                diffCount++ ;
                list.add(digit) ;
            }
            if( count[digit]>max){
                max = count[digit] ;
            }
        }
        System.out.println(diffCount);
        if( max==1){
            System.out.println("NO");
        }else{
            for (Integer digit : list) {
                if( count[digit]==max){
                    System.out.print((digit-10000)+" ");
                }
            }
            System.out.println();
        }
    }
}
