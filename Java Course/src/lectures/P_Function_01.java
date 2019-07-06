package lectures;

import java.util.Scanner;

public class P_Function_01 {






    public static void main(String[] args) {


    }

    /**
     *
     * @param a 第一個輸入的數字
     * @param b 第二格輸入的數字
     * @return 輸入數字相加的結果（int）
     */
    static int add( int a , int b ){

        int c = a + b ;
        return c ;

    }

    static void showWelcome( String name ){

        System.out.println( "歡迎 " + name + " 光臨");

    }

    static String addSymbols( String text , String symbol ){

        String result = symbol + text + symbol ;
        return result ;

    }
}
