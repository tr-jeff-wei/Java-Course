
package zerojudge;

import java.util.ArrayList;
import java.util.Scanner;

public class a365_3_新井字遊戲 {
      
    static ArrayList<Integer> options = new ArrayList<>();
    static boolean[] result = new boolean[4096];

    public static void main(String[] args) {

        setOptions();
        findSolution();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int board = Integer.parseInt(s, 2);
            
            if (result[board]) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }

        // String s = "001100110010" ;
        // int board = Integer.parseInt(s, 2);
        // boolean b = checkBoard(board, true) ;
        // if(b){
        // System.out.print(1);
        // }else{
        // System.out.print(0);
        // }

    }

    static void findSolution() {

        result[0] = true;
        for (int board = 1; board < result.length; board++) {
            for (Integer opt : options) {
                if ((opt & board) == opt) {

                    if (result[board - opt] == false) {
                        result[board] = true;
                    }
                }
            }
        }
    }

    static String show(int i) {
        String s = "" + Integer.toBinaryString(i);
        while (s.length() < 12) {
            s = "0" + s;
        }
        return s;
    }

    static int getOneMask(int a) {
        return 1 << (11 - a);
    }

    static int getTwoMask(int a, int b) {
        return getOneMask(a) | getOneMask(b);

    }

    static void setOptions() {
        // int r = getTwoMask(1, 4);
        // System.out.println(Integer.toBinaryString(r));

        // 1 個棋子
        for (int i = 0; i < 12; i++) {
            options.add(getOneMask(i));
        }
        // 2 個棋子
        options.add(getTwoMask(0, 3));
        options.add(getTwoMask(1, 4));
        options.add(getTwoMask(3, 7));
        options.add(getTwoMask(4, 8));
        options.add(getTwoMask(7, 10));
        options.add(getTwoMask(8, 11));

        options.add(getTwoMask(2, 3));
        options.add(getTwoMask(3, 4));
        options.add(getTwoMask(4, 5));

        options.add(getTwoMask(6, 7));
        options.add(getTwoMask(7, 8));
        options.add(getTwoMask(8, 9));
    }
}