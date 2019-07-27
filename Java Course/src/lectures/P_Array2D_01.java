package lectures;

import java.util.Arrays;

public class P_Array2D_01 {

    public static void main(String[] args) {

        String[] line =new String[]{"A","B","C","D","E"} ;
        String[] line2 = reverse(line) ;
        System.out.println(Arrays.toString(line2));


        String[][] table = new String[3][5] ;
        table[0]=new String[]{"A","B","C","D","E"} ;
        table[1]=new String[]{"F","G","H","I","J"} ;
        table[2]=new String[]{"K","L","M","N","O"} ;

        showTable(table);
        showTable(rightTurn(table));
    }

    static void showTable(String[][] table) {
        System.out.println("===================");

        for (int mi = 0; mi < table.length; mi++) {
            for (int ni = 0; ni < table[mi].length; ni++) {

                System.out.print(table[mi][ni]+" ");

            }
            System.out.println();
        }
        System.out.println("===================");
    }

    static String[] reverse( String[] line){

        String[] newLine = new String[line.length] ;
        for (int i = 0; i < line.length ; i++) {
            newLine[ line.length-1-i ] = line[i] ;
        }

        return newLine ;
    }


    static String[][] upsideDown( String[][] table ){

        String[][] newTable = new String[table.length][table[0].length] ;

        for (int mi = 0; mi < table.length; mi++) {
            for (int ni = 0; ni < table[mi].length; ni++) {

                newTable [table.length-1-mi][ni]= table[mi][ni] ;

            }
        }

        return newTable ;
    }
    static String[][] leftsideRight( String[][] table ){

        String[][] newTable = new String[table.length][table[0].length] ;

        for (int mi = 0; mi < table.length; mi++) {
            for (int ni = 0; ni < table[mi].length; ni++) {

                newTable [mi][table[mi].length-1-ni]= table[mi][ni] ;

            }
        }

        return newTable ;
    }



    static String[][] leftTurn( String[][] table ){

        String[][] newTable = new String[table[0].length][table.length] ;

        for (int mi = 0; mi < table.length; mi++) {
            for (int ni = 0; ni < table[mi].length; ni++) {

                newTable[ table[mi].length-1-ni ][mi]= table[mi][ni] ;

            }
        }

        return newTable ;
    }


    static String[][] rightTurn( String[][] table ){

        String[][] newTable = new String[table[0].length][table.length] ;

        for (int mi = 0; mi < table.length; mi++) {
            for (int ni = 0; ni < table[mi].length; ni++) {

                newTable[ ni ][table.length-1-mi]= table[mi][ni] ;

            }
        }

        return newTable ;
    }

}
