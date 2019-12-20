package lectures;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class S_A2_換位置 {

    public static void main(String[] args) {

        String input ="";

        // test
        input = "5 5\n" +
                "ABCDE\n" +
                "FGHIJ\n" +
                "KLMNO\n" +
                "PQRST\n" +
                "UVWXY\n" +
                "3\n" +
                "C 1 4\n" +
                "R 2 3\n" +
                "R 5 0" ;


        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        Scanner sc = new Scanner(System.in) ;
        String data = sc.nextLine() ;

        char[] place = new char[input.length()] ;   // 每個地方的字母
        int[]  count = new int[input.length()] ;    // 字母對應票數

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
