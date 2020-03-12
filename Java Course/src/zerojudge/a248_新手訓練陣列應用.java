package zerojudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a248_新手訓練陣列應用 {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s =buf.readLine();
        while (s!=null) {
            StringTokenizer st = new StringTokenizer(s) ;

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());


            int r1 = a / b;
            System.out.print(r1 + ".");
            if (r1 > 0) {
                a -= b * r1;
            }

            int point = 0;
            StringBuilder sb = new StringBuilder() ;
            while (point < c) {
                a *= 10;
                int r = a / b;
                a -= b * r;
                sb.append(r) ;
                //System.out.print(r);
                point++;
            }

            System.out.println(sb.toString());
            s = buf.readLine();
        }
        buf.close();
    }
}
