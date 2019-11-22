package lectures;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class S_A2_繪圖板 {

    public static void main(String[] args) {

        String input ="";

        // test
        input = "B\n" ;
        input += "6 6\n" ;
        input += "10\n" ;
        input += "1 1\n" ;
        input += "2 1\n" ;
        input += "3 1\n" ;
        input += "4 1\n" ;
        input += "3 2\n" ;
        input += "3 3\n" ;
        input += "3 4\n" ;
        input += "1 3\n" ;
        input += "1 4\n" ;
        input += "2 4\n" ;
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);


        Scanner sc = new Scanner(System.in) ;
        // 取字元
        String s = sc.nextLine();
        // 取寬高
        int w = sc.nextInt() ;
        int h = sc.nextInt() ;
        // 取點
        int n = sc.nextInt() ;
        boolean[][] panel = new boolean[h][w];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() ;
            int y = sc.nextInt() ;
            panel[y][x] = true ;
        }

        System.out.println(input);

        // 繪圖
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if( panel[i][j] == true ){
                    System.out.print(s);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
