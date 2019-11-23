package lectures;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class S_A2_片段加總 {

    public static void main(String[] args) {

        String input ="";

        // test A
        input = "abaacbc\n" ;

        // test B
        input = "ASFASFASFE" ;
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);


        Scanner sc = new Scanner(System.in) ;
        // 取字串
        String s = sc.nextLine();

        // 紀錄字元、次數
        char[] charArray = new char[s.length()] ;
        int[] countArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 找出 charArray 中是不是有一樣的字母
            for (int j = 0; j < charArray.length; j++) {
                if(charArray[j]==c){
                    // 出現一樣的字母
                    countArray[j]++ ; // +1
                    break;            // 離開

                }else if(charArray[j]==0){
                    // 已經找到最後沒有放字母的位置
                    charArray[j] = c ; // 放入現在的字母
                    countArray[j]++ ; // +1
                    break;            // 離開
                }else{
                    //
                }
            }
        }
        // 印出結果
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]==0){
                break ;// 到最後沒有放字母的位置，結束
            }
            System.out.println( charArray[i]+" "+countArray[i]);
        }

    }
}
