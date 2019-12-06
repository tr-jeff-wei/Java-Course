package toi;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class B3_Bus {


    public static void main(String[] args) {


        String input ="";


        // test
        input = "3\n" +
                "7 15\n" +
                "25\n" +
                "30\n" +
                "15\n" +
                "1 2 0\n" ;

        // test
        input = "4\n" +
                "23 30\n" +
                "5\n" +
                "38\n" +
                "52\n" +
                "56\n" +
                "1 2 3 4 0\n" ;


        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        // -------------------------------------------

        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        sc.nextLine();
        int hr  = sc.nextInt() ;
        int min = sc.nextInt() ;
        sc.nextLine() ;
        //int[] pathTime = new int[n] ;
        int[] stationHr = new int[n] ;
        int[] stationMin = new int[n] ;
        for (int i = 0; i < n; i++) {
            int pathTime = sc.nextInt() ;
            sc.nextLine() ;
            min = min + pathTime ;

            int addHr = min/60 ;
            hr = hr+addHr ;
            hr = hr%24 ;

            min = min%60 ;

            stationHr[i] = hr ;
            stationMin[i] = min ;
        }

        while(true){
            int question = sc.nextInt() ;
            if( question==0){
                break ;
            }

            System.out.println( stationHr[question-1]+":"+stationMin[question-1]);
        }


    }
}
