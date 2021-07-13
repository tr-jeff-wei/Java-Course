package zerojudge;

import java.util.Scanner;

class a693_吞食天地 {

    public static void main(String[] args) {
//		3 3 ---> n , m
//		1 2 3 ---> n x food
//		1 3
//		1 2
//		2 3

        Scanner sc = new Scanner(System.in) ;
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            // get food data
            int[] food = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                food[i] = sc.nextInt();
            }

            int[] totalFood = new int[food.length];

            for (int i = 1; i < totalFood.length; i++) {
                totalFood[i] = totalFood[i - 1] + food[i];
            }
            // solve
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                int start = -1;
                if (a - 2 < 0) {
                    start = 0;
                } else {
                    start = totalFood[a - 1];
                }

                int end = totalFood[b];

                int answer = end - start;
                System.out.println(answer);
            }
        }
    }

}
