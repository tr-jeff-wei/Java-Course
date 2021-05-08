
package zerojudge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class a054_電話客服中心 {

      public static void main(String[] args) {
            String[] areaCode = new String[36];

            for (int i = 10; i < areaCode.length; i++) {
                  if (i <= 17) {
                        areaCode[i] = ""+(char)('A' + (i - 10));
                  }else if( i>=18 && i<=22){
                        areaCode[i] = ""+(char)('J' + (i - 18));
                  }else if( i>=23 && i<=29){
                        areaCode[i] = ""+(char)('P' + (i - 23));
                  }else if( i==30){
                        areaCode[i] = "X";
                  }else if( i==31){
                        areaCode[i] = "Y";
                  }else if( i==32){
                        areaCode[i] = "W";
                  }else if( i==33){
                        areaCode[i] = "Z";
                  }else if( i==34){
                        areaCode[i] = "I";
                  }else if( i==35){
                        areaCode[i] = "O";
                  }
            }
            
            Scanner sc = new Scanner(System.in) ;
            String input = sc.next() ;
            int m = 8 ;
            int checkSum = 0 ;
            for (int i= 0; m>0; i++) {
                 char c = input.charAt(i) ;
                  checkSum += m*(c-'0') ;
                  m--;
            }
            int checkDigit = input.charAt(8)-'0' ;
            
            ArrayList<String> ans = new ArrayList<>();
            for (int i = 10; i <=35; i++) {
                  int t = (i%10)*9 + (i/10);
                  if( (10-(checkSum+t)%10)%10 ==checkDigit){
                        ans.add(areaCode[i]);
                  }
            }
            
            Collections.sort(ans) ;
            for (String a : ans) {
                  System.out.print(a);
            }

      }
}
