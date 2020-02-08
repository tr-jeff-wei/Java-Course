package zerojudge;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class e840 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        int nA = 0 ;
        int nD = 0 ;
        int nCD = 0 ;
        int tmpCD = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if( c>='0' && c<='9'){
                // digits
                nD++;

                // 連續
                if( tmpCD>0){
                    tmpCD++;
                }else{
                    tmpCD=1 ;
                }
            }else{
                // a-z
                nA++;

                if( tmpCD>1){
                    nCD+=(tmpCD-1) ;
                }
                tmpCD=0;
            }
        }

        if( tmpCD>1){
            nCD+=(tmpCD-1) ;
        }

        int score = 0 ;
        // 加分
        score += s.length()*3 ;
        score += nA*3 ;
        score += nD*2 ;
        if( s.length()>=8 && nA>0 && nD>0){
            score += 10 ;
        }else{
            score -= 5 ;
        }
        // 扣分
        if( nA==0 && nD>0){
            score -=nD ;
        }
        if( nD==0 && nA>0){
            score -=nA ;
        }
        if( nCD>0){
            score -= (nCD)*2;
        }

        System.out.println(score);
    }

}
