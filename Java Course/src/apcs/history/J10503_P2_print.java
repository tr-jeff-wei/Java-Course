package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class J10503_P2_print {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt() ;
        int c = sc.nextInt() ;
        int m = sc.nextInt() ;
        int[][] data = new int[r][c] ;
        for (int ri = 0; ri < r; ri++) {
            for (int ci = 0; ci < c; ci++) {
                data[ri][ci] = sc.nextInt();
            }
        }

        // 旋轉 , 翻轉
        for (int i = 0; i < m; i++) {
            int mi = sc.nextInt() ;
            switch (mi){
                case 0:
                    data = rotateTable(data) ;
                    break ;
                case 1:
                    swapTable(data);
                    break;
            }
        }
        System.out.println( data.length+" "+data[0].length);
        for (int ri = 0; ri < data.length; ri++) {
            for (int ci = 0; ci < data[ri].length; ci++) {
                System.out.print( data[ri][ci]+" ");
            }
            System.out.println();
        }
    }

    static int[][] rotateTable(int[][] table) {
        int[][] newTable = new int[table[0].length][table.length];

        int nc = table.length-1 ;
        for (int ri = 0; ri < table.length; ri++) {
            int nr = 0 ;
            for (int ci = 0; ci < table[ri].length; ci++) {
                newTable[nr][nc]= table[ri][ci] ;
                nr++ ;
            }
            nc-- ;
        }

        return newTable;

    }

    static void swapTable(int[][] table) {
        int top = 0;
        int bottom = table.length - 1;
        while (top < bottom) {
            for (int ci = 0; ci < table[0].length; ci++) {
                // swap
                int tmp = table[top][ci];
                table[top][ci] = table[bottom][ci];
                table[bottom][ci] = tmp;

            }
            top++;
            bottom--;
        }
    }

}
