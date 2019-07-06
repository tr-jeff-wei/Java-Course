package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class J10503_P1 {


    public static void main(String[] args) {

        int nx = 3 ;
        int ny = 6 ;
        int[][] table = new int[nx][ny] ;

        for (int x = 0; x < nx; x++) {
            for (int y = 0; y < ny; y++) {
                table[x][y] =(int) (Math.random()*10);
            }
        }

        showTable(table);

        //-----------------------
        int tY=0 ;
        int bY=ny-1;
        while (tY<bY) {
            for (int x = 0; x < table.length; x++) {

                // swap
                int tmp = table[x][tY] ;
                table[x][tY] = table[x][bY] ;
                table[x][bY] = tmp ;

            }
            tY++ ;
            bY-- ;
        }

        showTable(table);




    }

    static void showTable( int[][] table ){
        System.out.println("===================");
        for (int y = 0; y < table[0].length; y++) {
            for (int x = 0; x < table.length; x++) {
                System.out.print(table[x][y]+" ");
            }
            System.out.println();
        }
        System.out.println("===================");
    }



























    public static void test(String[] args) {


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
