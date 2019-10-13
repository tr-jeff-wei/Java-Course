package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class J10806_P2 {


    public static void main(String[] args) {

        String data = "3 5\n" +
                "3 7 9 8 4\n" +
                "5 2 3 6 9\n" +
                "6 4 7 7 4\n" ;

        InputStream is = new ByteArrayInputStream(data.getBytes()) ;
        System.setIn(is);
        // ======================

        Scanner sc = new Scanner(System.in) ;
        int rn = sc.nextInt() ;
        int cn = sc.nextInt() ;

        int[][] matrix = new int[rn][cn] ;


        for (int ri = 0; ri < rn; ri++) {
            for (int ci = 0; ci < cn; ci++) {
                matrix[ri][ci] = sc.nextInt();
            }
        }

        int minRi = 0 ;
        int minCi = 0 ;
        for (int ri = 0; ri < rn; ri++) {
            for (int ci = 0; ci < cn; ci++) {
                if( matrix[ri][ci] < matrix[minRi][minCi]){
                    minCi = ci ;
                    minRi = ri ;
                }
            }
        }

//        System.out.println(minCi);
//        System.out.println(minRi);

        walk(matrix , minRi , minCi);
    }

    public static void walk(int[][] data , int ri , int ci){

        System.out.print( data[ri][ci]);
        data[ri][ci] = -1 ;

        int min=-1 ;
        int nexti=ri ;
        int nextj=ci ;

        // up
        if( ri-1>=0 && data[ri-1][ci]!= -1){
            if( min==-1 || data[ri-1][ci]<min ){
                min = data[ri-1][ci] ;
                nexti = ri-1 ;
                nextj = ci ;
            }
        }

        // down
        if( ri+1<data.length && data[ri+1][ci]!= -1){
            if( min==-1 || data[ri+1][ci]<min ){
                min = data[ri+1][ci] ;
                nexti = ri+1 ;
                nextj = ci ;
            }
        }

        // left
        if( ci-1>=0 && data[ri][ci-1]!= -1){
            if( min==-1 || data[ri][ci-1]<min ){
                min = data[ri][ci-1] ;
                nexti = ri ;
                nextj = ci-1 ;
            }
        }

        // right
        if( ci+1<data[0].length&& data[ri][ci+1]!= -1){
            if( min==-1 || data[ri][ci+1]<min ){
                min = data[ri][ci+1] ;
                nexti = ri ;
                nextj = ci+1 ;
            }
        }

        if( min!=-1){
            walk( data , nexti , nextj);
        }



    }
}
