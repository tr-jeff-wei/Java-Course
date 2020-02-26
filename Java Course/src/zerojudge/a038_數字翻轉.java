package zerojudge;

import java.util.Scanner;

public class a038_數字翻轉 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine() ;
        boolean skipzero = true ;
        String result = "" ;
        for (int i = s.length()-1; i >=0; i--) {
            char c = s.charAt(i) ;

            if( c=='0' && skipzero ){
            }else{
                skipzero = false ;
                result+=c ;
            }
        }
        if( result.length()==0){
            result = "0" ;
        }
        System.out.println(result);
        sc.close();
    }
}
