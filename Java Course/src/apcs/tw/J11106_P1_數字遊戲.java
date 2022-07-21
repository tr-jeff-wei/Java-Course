package apcs.tw;

import java.util.Scanner;

public class J11106_P1_數字遊戲 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 出現最多次 ==> 3 , 2 , 1

        // 1~9 , 0 沒有用到
        int[] vote = new int[10];
        // a->?
        vote[a] = vote[a] + 1;
        vote[b] = vote[b] + 1;
        vote[c] = vote[c] + 1;

        int max = -1;

        for (int i = 0; i < vote.length; i++) {
            if (vote[i] > max) {
                max = vote[i];
            }
        }

        System.out.print(max);
        // 9,8,7,....,2,1
        for (int i = 9; i >= 1; i--) {
            // 某一格的數字 > 0，就要印出來
            if (vote[i] > 0) {
                System.out.print(" " + i);
            }
        }

    }
}
