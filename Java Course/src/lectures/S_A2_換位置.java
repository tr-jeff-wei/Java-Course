package lectures;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
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
                "R 1 0\n" ;


        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        Scanner sc = new Scanner(System.in) ;
        int w = sc.nextInt() ;
        int h = sc.nextInt() ;
        sc.nextLine();
        char[][] sites = new char[h][w] ;

        for (int i = 0; i < h; i++) {
            String s = sc.nextLine() ;
            for (int j = 0; j < s.length(); j++) {
                sites[i][j] = s.charAt(j) ;
            }
//            System.out.println(Arrays.toString(sites[i]));
        }

        //show(sites);

        int changeTimes = sc.nextInt() ;
        sc.nextLine();
        for (int i = 0; i < changeTimes; i++) {
            String type = sc.next() ;
            int a = sc.nextInt() ;
            int b = sc.nextInt() ;
            sc.nextLine();
            if(type.equals("C")){
                swap_C(a,b,sites);
            }else if(type.equals("R")){
                swap_R(a,b,sites);
            }
            //show(sites);

        }


    }

    static void swap_R( int ai , int bi , char[][] sites){
        for (int i = 0; i < sites[0].length; i++) {
            swap( ai , i , bi , i , sites);
        }
    }

    static void swap_C( int aj , int bj , char[][] sites){
        for (int i = 0; i < sites.length; i++) {
            swap(  i , aj ,  i , bj , sites);
        }
    }
    static void swap( int ai , int aj , int bi , int bj , char[][] sites){
        // a --> tmp
        char tmp = sites[ai][aj] ;
        // b --> a
        sites[ai][aj] = sites[bi][bj] ;
        // tmp --> b
        sites[bi][bj] = tmp ;
    }

    static void show(char[][] sites){
        for (int i = 0; i < sites.length; i++) {
            System.out.println(Arrays.toString(sites[i]));
        }
        System.out.println("==================");
    }

}
