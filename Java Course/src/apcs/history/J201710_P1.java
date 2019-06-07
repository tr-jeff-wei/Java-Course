package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class J201710_P1 {


    public static void main(String[] args) {


        String data = "0 0 0" ;
        prog(data);

        data = "1 1 1" ;
        prog(data);

        data = "3 0 1" ;
        prog(data);

        data = "0 0 1" ;
        prog(data);

    }

    public static void prog(String data){
        InputStream is = new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        System.out.println( "input => "+a+" , "+b + " , "+c);
        if(and(a,b) == c){
            System.out.println("AND");
        }


    }


    public static int and(int a , int b){

        if( a!=0  &&  b!=0){
            return 1;
        }else{
            return 0 ;
        }

    }

}
