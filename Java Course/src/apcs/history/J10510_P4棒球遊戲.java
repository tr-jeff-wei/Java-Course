package apcs.history;

import java.util.Arrays;
import java.util.Scanner;

public class J10510_P4棒球遊戲 {

    static String[][] player = new String[9][5];
    static int maxOut = 0;
    static int playerOut = 0;
    static boolean[] bases = new boolean[4];
    static int score = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < player.length; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                String info = sc.next();
                player[i][j] = info;
            }
        }
        maxOut =sc.nextInt();
        for (int m = 0; m < 5; m++) {
            for (int p = 0; p < player.length; p++) {
                String play = player[p][m];
                if (play == null) {
                    continue;
                }
                switch (play) {
                    case "1B":
                        runBase(1);
                        break;
                    case "2B":
                        runBase(2);
                        break;
                    case "3B":
                        runBase(3);
                        break;
                    case "HR":
                        runBase(4);
                        break;
                    case "FO":
                    case "GO":
                    case "SO":
                        playerOut++;
                        // 3-out clean bases
                        if( playerOut>0 && playerOut%3==0){
                            for (int i = 0; i < bases.length; i++) {
                                bases[i]=false ;
                            }
                        }
                        break;
                }

                // end game
                if( playerOut==maxOut){
                    System.out.println(score);
                    return ;
                }
                //System.out.println(play+" ----> "+ Arrays.toString(bases)+"    score:"+score+"   out:"+playerOut);

            }
        }

    }

    public static void runBase(int n) {
        bases[0] = true;
        for (int i = 3; i >= 0; i--) {
            if (bases[i] == true) {
                int target = n + i;
                if (target >= 4) {
                    // 得分
                    score++;
                } else {
                    bases[target] = true;
                }
                bases[i] = false;
            }
        }
    }

}
