package apcs.history;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class J10806_P1 {

    public static void main(String[] args) {

        String data = "23 45 21 32\n" +
                "32 24 54 32\n" +
                "13 32 43 55\n" +
                "23 34 44 43\n" ;
        InputStream is = new ByteArrayInputStream(data.getBytes()) ;
        System.setIn(is);
        // =============================

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <16 ; i++) {

        }

    }
}
