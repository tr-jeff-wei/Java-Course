package zerojudge;

import java.util.Scanner;
import java.util.Arrays;
/**
 * a104_排序
 */
public class a104_排序 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                data[i] = x;
            }
            Arrays.sort(data);
            for (int i = 0; i < data.length; i++) {
                if (i == 0) {
                    System.out.print(data[i]);
                } else {
                    System.out.print(" "+data[i]);
                }
            }
            System.out.println();
        }
    }
}
