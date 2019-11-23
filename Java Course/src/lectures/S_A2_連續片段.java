package lectures;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class S_A2_連續片段 {

    public static void main(String[] args) {

        String input ="";

        // test A
        input = "abacbbbc\n" ;
        // test B
        input = "bbbbbasdf\n" ;
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);


        Scanner sc = new Scanner(System.in) ;
        // 取字串
        String s = sc.nextLine();
        char preChar = s.charAt(0) ; // 先放最前面的字元當參考字元
        // 從 index:1 開始比較
        int count = 1 ;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i) ;
            if( c==preChar ){
                count++ ;
            }else{
                if( count>1 ){
                    // count > 1 表示已經出現
                    // 連續字串，然後又發現不同
                    // 字母，所以可以結束檢查
                    break;
                }else{
                    // 不同字母，重新設定
                    preChar = c ;
                    count=1;

                }

            }

        }

        System.out.println(preChar+" "+count);

    }
}
