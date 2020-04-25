package apcs.tw;

import java.io.*;
import java.util.ArrayList;

public class J10503_P2_矩陣轉換_2 {

    final static int RLen=0 ;
    final static int CLen=1 ;
    final static int R=2 ;
    final static int C=3;

    //   0   ,   1    ,  2    , 3
    // rowLen , colLen , row , col
    public static int[] rotate( int[] data){
        // [r][c] --> [c][ rowLen-1-r ]
        //return new int[]{ data[CLen] , data[RLen] , data[C] , data[RLen]-data[R]-1} ;
        return new int[]{ data[CLen] , data[RLen] ,  data[CLen]-data[C]-1 , data[R]} ;
    }

    public static int[] swap(int[] data){
        // [r][c] --> [ rowLen-1-r ] [c]
        return new int[]{ data[RLen] ,data[CLen] , data[RLen]-data[R]-1 ,data[C] } ;
    }

    public static int[] process( String[] process , int[] d){

        for (int i = process.length-1; i >=0 ; i--) {
            switch (process[i]){
                case "0":
                    d = rotate(d) ;
                    break ;
                case "1":
                    d = swap(d) ;
                    break ;
            }
        }
        return d ;
    }


    public static void main(String[] args) throws IOException {
//        String input = "3 2 3\n" +
//                "1 1\n" +
//                "3 1\n" +
//                "1 2\n" +
//                "1 0 0\n" +
//                "3 2 2\n" +
//                "3 3\n" +
//                "2 1\n" +
//                "1 2\n" +
//                "0 1\n";
//
//
//        InputStream is = new ByteArrayInputStream(input.getBytes());
//        System.setIn(is);

        BufferedReader buf = new BufferedReader(  new InputStreamReader(System.in));
        String s = buf.readLine();
        while (s!=null && s.length()>0) {
            String[] tokens = s.split(" ") ;
            int r = Integer.parseInt(tokens[0] );
            int c = Integer.parseInt(tokens[1] );
            int m = Integer.parseInt(tokens[2] );
            int[][] data = new int[r][c];
            for (int ri = 0; ri < r; ri++) {
                tokens = buf.readLine().split(" ") ;
                for (int ci = 0; ci < c; ci++) {
                    data[ri][ci] = Integer.parseInt(tokens[ci]);
                }
            }

            // 旋轉 , 翻轉
            tokens = buf.readLine().split(" ") ;
            String[] process = new String[tokens.length] ;
            for (int i = 0; i < tokens.length; i++) {
                process[i] =  tokens[i] ;
            }
            int l = Math.max(r,c) ;
            int[][] result = new int[l][l] ;
            int maxR = 0 ;
            int maxC = 0 ;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    int[] d = new int[4] ;
                    d[RLen] = r ;
                    d[CLen] = c ;
                    d[R] = i ;
                    d[C] = j ;
                    d = process(process , d) ;
                    result[d[R]][d[C]] = data[i][j];
                    if( d[R]>maxR){
                        maxR = d[R] ;
                    }
                    if( d[C]>maxC){
                        maxC = d[C] ;
                    }
                }
            }


            System.out.println((maxR+1) + " " + (maxC+1));
            for (int ri = 0; ri <= maxR; ri++) {
                for (int ci = 0; ci <= maxC; ci++) {

                    if (ci ==  maxC) {
                        System.out.print(result[ri][ci]);
                    } else {
                        System.out.print(result[ri][ci] + " ");
                    }
                }
                System.out.println();
            }
            s = buf.readLine();
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
