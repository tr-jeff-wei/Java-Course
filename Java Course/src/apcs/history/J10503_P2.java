package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class J10503_P2 {


    public static void main(String[] args) {
        String input = "";
//                input = "3 2 3\n" +
//                "1 1\n" +
//                "3 1\n" +
//                "1 2\n" +
//                "1 0 0\n" +
//                "";

        input = "3 2 2\n" +
                "3 3\n" +
                "2 1\n" +
                "1 2\n" +
                "0 1\n" +
                "";

        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt() ;
        int c = sc.nextInt() ;
        int m = sc.nextInt() ;
        int[][] data = new int[r][c] ;
        for (int ri = 0; ri < r; ri++) {
            for (int ci = 0; ci < c; ci++) {
                data[ri][ci] = sc.nextInt() ;
            }
        }
        showTable(data);

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
//            System.out.println("==>"+mi);
//            showTable(data);
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

    static void showTable(int[][] table) {
        System.out.println("===================");
        for (int mi = 0; mi < table.length; mi++) {
            for (int ni = 0; ni < table[mi].length; ni++) {
                System.out.print(table[mi][ni]+" ");
            }
            System.out.println();
        }
        System.out.println("===================");
    }

    static int[][] genRandomTable() {
        int nx = 3;
        int ny = 6;
        int[][] table = new int[nx][ny];

        for (int x = 0; x < nx; x++) {
            for (int y = 0; y < ny; y++) {
                table[x][y] = (int) (Math.random() * 10);
            }
        }
        return table;
    }



}
