package zerojudge;

import java.util.Scanner;

public class a009_解碼器_char_轉換 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        while( sc.hasNextLine()){
            String s =sc.nextLine();
            StringBuilder sb = new StringBuilder() ;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i) ;
                sb.append((char)(c-7)) ;
            }
            System.out.println(sb);
        }
        sc.close();

    }
}
