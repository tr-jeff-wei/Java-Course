package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class J10610_P2 {


    public static void main(String[] args) {

        String data = "2\n" +
                "aafAXbbCDCCC\n" ;


        InputStream is = new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();

        char previousType ='x' ;


        // 設定大寫 / 小寫
        if( previousType=='x'){
            // 沒有設定任何類型
            char c = s.charAt(0) ;
            if( isLowercase(c)){
                // 將要是小寫
                previousType = 'A' ; //前一個設定為大寫
            }else{
                // 將要是大寫
                previousType = 'a' ; //前一個設定為小寫
            }
        }

        int maxCount = 0 ;
        int startIdx = 0 ;
        int thisTypeCount = 0 ;
        while( startIdx<s.length()){
            char c = s.charAt(startIdx) ;
            if( true){

            }


        }





    }



    public static boolean isUppercase(char c){
        if( c>='A' && c<='Z'){
            return true ;
        }
        return false ;
    }
    public static boolean isLowercase(char c){
        if( c>='a' && c<='z'){
            return true ;
        }
        return false ;
    }
}
