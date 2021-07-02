package zerojudge;


import java.util.Scanner;

public class a044_空間切割 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println((a * a * a + 5 * a + 6) / 6);
        }

    }
}
