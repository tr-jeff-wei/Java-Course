package apcs.tw;

import java.util.Arrays;
import java.util.Scanner;

public class J10510_P1_三角形辨別 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        int max = 0;
        Arrays.sort(arr);
        System.out.println(arr[0] +" "+ arr[1] +" "+ arr[2]);
        if (arr[0] + arr[1] <= arr[2]) {
            System.out.println("No");
        } else if (arr[0] * arr[0] + arr[1] * arr[1] < arr[2] * arr[2]) {
            System.out.println("Obtuse");
        } else if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
            System.out.println("Right");
        } else if (arr[0] * arr[0] + arr[1] * arr[1] > arr[2] * arr[2]) {
            System.out.println("Acute");
        }

    }
}
