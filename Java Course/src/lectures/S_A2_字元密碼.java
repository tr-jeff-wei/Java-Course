package lectures;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class S_A2_字元密碼 {


    public static void main(String[] args) {

        String input ="";
        // test A
//        input = "a 17\n" ;
//        input += "26,17,38,17,35,19,34,25,32,36\n" ;

        // test B
        input = "e 10\n" ;
        input += "21,23,20,12,23,6,18\n" ;
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);


        Scanner sc = new Scanner(System.in) ;
        // 取字元和代碼
        String s1 = sc.next();
        char c1 = s1.charAt(0);
        int code_number = sc.nextInt();
        // 走到下一行
        sc.nextLine();
        // 取密碼
        String inputNum = sc.nextLine();
        String[] codes = inputNum.split(",") ;
        for (int i = 0; i < codes.length; i++) {
            int d = Integer.parseInt(codes[i]);
            int n = d-code_number+c1 ;
            char c = (char) n ;
            System.out.print(c);
        }

    }
}
