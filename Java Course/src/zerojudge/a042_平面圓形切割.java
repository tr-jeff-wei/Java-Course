package zerojudge;

import java.util.Scanner;

/**
 * 每多一個圓(假設其為第n個)
 * 
 * 它便會借用前 (n-1) 個圓的邊
 * 
 * 形成 2*(n-1) 個點
 * 
 * 而每形成一點便代表多出一個區域
 * 
 * 加上外面(非圓)區域
 * 
 * 區域數為
 * 
 * 1+(1+2+4+6+8+.........+2*(n-1))
 * 
 * = 1+1+(2+4+6+8+.........+2*(n-1))
 * 
 * = 2+(2+2*(n-1))*(n-1)/2
 * 
 * = n^2 - n + 2
 */

public class a042_平面圓形切割 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ) ;
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            System.out.println(n*n-n+2);
        }
        
    }
}
