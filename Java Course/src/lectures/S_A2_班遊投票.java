package lectures;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class S_A2_班遊投票 {

    public static void main(String[] args) {

        String input ="";

        // test
        input = "ABCCADBCCC\n" ;


        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        Scanner sc = new Scanner(System.in) ;
        String data = sc.nextLine() ;

        char[] place = new char[input.length()] ;   // 每個地方的字母
        int[]  count = new int[input.length()] ;    // 字母對應票數
        for (int i = 0; i < place.length; i++) {
            place[i]='-'; // 沒有使用的設為 '-'
            count[i]= 0 ; // 一開始票數都設 0
        }

        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            int foundIdx = -1 ;
            // 尋找是否已經有紀錄
            for (int placeIdx = 0; placeIdx < place.length; placeIdx++) {
                // 找到紀錄，票數+1
                if(place[placeIdx]==c){
                    count[placeIdx]++;
                    break ;
                }
                // 都沒有紀錄，走到最後一個，填內容
                if(place[placeIdx]=='-'){
                    place[placeIdx]=c ;
                    count[placeIdx]++;
                    break ;
                }
            }
        }

        // 檢查結果
        System.out.println(Arrays.toString(place));
        System.out.println(Arrays.toString(count));

    }
    static int value( int wi , int hi , int[][] table){

        if( hi<0 || hi>= table.length){
            return 0 ;
        }
        if( wi<0 || wi>= table[hi].length){
            return 0 ;
        }
        return table[hi][wi];
    }
}
