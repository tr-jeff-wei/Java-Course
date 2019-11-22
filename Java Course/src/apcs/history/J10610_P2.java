package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class J10610_P2 {

    static int n ;
    static int thisTypeCount = 0 ;
    static int totalTypeCount = 0 ;
    static int maxCount = 0 ;

    public static void main(String[] args) {

        String data = "2\n" +
                "aafAXbbCDCCC\n" ;

        data = "1\n" +
                "aBBdaaa\n" ;

        data = "3\n" +
                "DDaasAAbbCC\n" ;

        data = "3\n" +
                "DDaaAAbbCC\n" ;

        InputStream is = new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
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


        int startIdx = 0 ;
        while( startIdx<s.length()){
            char c = s.charAt(startIdx) ;
            startIdx++;
            if( isLowercase(previousType) && isLowercase(c)){
                thisTypeCount++ ;
            }else if( isUppercase(previousType) && isUppercase(c)){
                thisTypeCount++ ;
            }else{
                // 前後不同
                // 1. 先加入之前的計算
                cutCount();

                // 2. 重新計算
                thisTypeCount = 1;
                if( isUppercase(c)){
                    previousType = 'A' ;
                }else{
                    previousType = 'a' ;
                }
            }
        }
        cutCount();

        System.out.println(maxCount);


    }


    public static void cutCount(){
        if( thisTypeCount==n){
            totalTypeCount=totalTypeCount+n ;

            if( totalTypeCount>maxCount){
                maxCount = totalTypeCount ;
            }
        }else if(thisTypeCount>n) {
            // 超過所要的個數
            totalTypeCount=totalTypeCount+n ;
            if( totalTypeCount>maxCount){
                maxCount = totalTypeCount ;
            }
            // 加入了之後
            totalTypeCount = n ; // 重設個數
        }else{
            // 不到所要的個數
            totalTypeCount=0;
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
