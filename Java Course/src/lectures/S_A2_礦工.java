package lectures;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class S_A2_礦工 {

    public static void main(String[] args) {

        String input ="";

        // test
        input = "3 4\n" ;
        input += "0 1 2\n" ;
        input += "4 2 1\n" ;
        input += "0 1 3\n" ;
        input += "1 5 2\n" ;

        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);


        Scanner sc = new Scanner(System.in) ;

        // 取寬高
        int w = sc.nextInt() ;
        int h = sc.nextInt() ;

        int[][] panel = new int[h][w];
        for (int hi = 0; hi < h; hi++) {
            for (int wi = 0; wi < w; wi++) {
                panel[hi][wi] = sc.nextInt() ;
            }
        }

        for (int hi = 0; hi < h; hi++) {
            for (int wi = 0; wi < w; wi++) {
                int total = 0 ;
                total+=value( wi , hi , panel) ;
                total+=value( wi-1 , hi , panel) ;
                total+=value( wi+1 , hi , panel) ;
                total+=value( wi , hi-1 , panel) ;
                total+=value( wi , hi+1 , panel) ;
                System.out.println(wi+" , "+hi+"  ==> "+total);
            }
        }


    }
    static int value( int wi , int hi , int[][] table){

        if( hi<0 || hi>= table.length){
            return 0 ;
        }
        if( wi<0 || wi>= table[hi].length){
            return 0 ;
        }
        return table[hi][wi];
    }
}
