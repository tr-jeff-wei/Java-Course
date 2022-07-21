package zerojudge;

import java.util.Scanner;

/**
 * i510_尋找子字串
 * 
 * 本題不是簡單的 indexOf 應用問題
 * 需使用進階 string matching algorithm
 * https://web.ntnu.edu.tw/~algo/Substring.html
 * 來簡化大量比對複雜度
 * 演算法經典題
 */
public class i510_尋找子字串 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String sa = sc.next();
            String sb = sc.next();

            int i = sa.indexOf(sb);
            if (a >= b && i >= 0) {
                System.out.println("Yes");
                System.out.println("pos: " + i);
            } else {
                System.out.println("No");
            }
        }
    }
}