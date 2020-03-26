package zerojudge;

import java.util.Scanner;

public class a053_Sagit_計分程式 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                while (sc.hasNextInt()) {
                        int n = sc.nextInt();
                        int score = 0;
                        if (n <= 10) {// 0~10

                                score = n * 6;

                        } else if (n <= 20) {// >10 && <=20

                                score = 10 * 6 + (n - 10) * 2;

                        } else if (n <= 40) {// >20 && <=40

                                score = 10 * 6 + 10 * 2 + (n - 20) * 1;

                        } else { // >40
                                score = 100;
                        }

                        System.out.println(score);
                }
                
                
        }
}
