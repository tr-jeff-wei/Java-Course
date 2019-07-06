package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class J10503_P1 {
    public static void main(String[] args) {


        String input = "3 2 3\n" +
                "1 1\n" +
                "3 1\n" +
                "1 2\n" +
                "1 0 0\n" +
                "";

        InputStream is = new ByteArrayInputStream( input.getBytes()) ;
        System.setIn(is);

        Scanner sc= new Scanner(System.in) ;



    }
}
