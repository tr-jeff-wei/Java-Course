package toi;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class B3_Master {


    public static void main(String[] args) {

        String input ="";

        // test
        input = "3 1000\n" +
                "1520 43\n" +
                "1300 33\n" +
                "1600 22\n" ;

        // test
        input = "4 55555\n" +
                "200 42\n" +
                "400 40\n" +
                "500 30\n" +
                "3000 27\n" ;

        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        // -------------------------------------------

        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int star = sc.nextInt() ;
        sc.nextLine();

        int levelUp = star/1000 ;
        int maxIdx = -1;
        int maxCp  = 0 ;
        for (int i = 0; i < n; i++) {
            int cp = sc.nextInt() ;
            int iv = sc.nextInt() ;
            sc.nextLine() ;
            cp = levelUp( cp , iv , levelUp ) ;
            if( cp>maxCp){
                maxCp = cp ;
                maxIdx=i+1 ;
            }
        }

        System.out.println(maxIdx+" "+maxCp);

    }
    public static int levelUp( int cp , int iv , int up){
        int c = 0 ;

        if( iv<30){
            c = cp+up*10 ;
        }else if( iv<40){
            c = cp+up*50 ;
        }else if( iv<46){
            c = cp+up*100 ;
        }else{
            c= cp ;
        }
        return c ;
    }
}
