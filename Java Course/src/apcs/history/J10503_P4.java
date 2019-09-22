package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class J10503_P4 {


    public static void main(String[] args) {
        String input = "8\n" +
                "0 1\n" +
                "0 2\n" +
                "0 3\n" +
                "7 0\n" +
                "1 4\n" +
                "1 5\n" +
                "3 6";


        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt() ;
        int c = sc.nextInt() ;

    }



}
