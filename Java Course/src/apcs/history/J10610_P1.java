package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class J10610_P1 {


    public static void main(String[] args) {


        String data = "0 0 0";
        prog(data);

        data = "1 1 1";
        prog(data);

        data = "3 0 1";
        prog(data);

        data = "0 0 1";
        prog(data);

    }

    public static void prog(String data) {
        InputStream is = new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        System.out.println("input => " + a + " , " + b + " , " + c);
        boolean isImpossible = true ;
        if (and(a, b) == c) {
            isImpossible = false ;
            System.out.println("AND");
        }
        if (or(a, b) == c) {
            isImpossible = false ;
            System.out.println("OR");
        }
        if (xor(a, b) == c) {
            isImpossible = false ;
            System.out.println("XOR");
        }
        if(isImpossible==true){
            System.out.println("IMPOSSIBLE");
        }

        PrintStream tmp = System.out ;

        System.out.println("=======================================");

        //System.out.println(result);

    }


    public static int and(int a, int b) {

        if (a != 0 && b != 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public static int or(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int xor(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        } else if (a != 0 && b != 0) {
            return 0;
        } else {
            return 1;
        }
    }

}
