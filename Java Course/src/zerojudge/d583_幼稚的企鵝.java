package zerojudge;

import java.util.Arrays;
import java.util.Scanner;

public class d583_幼稚的企鵝 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            while (sc.hasNextInt()) {

                  int n = sc.nextInt();
                  int[] arr = new int[n];

                  // 把很多數字放進 array
                  for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextInt();
                  }
                  // 排          
                  Arrays.sort(arr);
                  for (int i = 0; i < arr.length; i++) {
                        if (i == 0) {
                              // 不要空格
                              System.out.print(arr[i]);
                        } else {
                              // 前面加空格
                              System.out.print(" " + arr[i]);
                        }
                  }
                  // 全部數字印完（離開 for）
                  System.out.println(); // 換下一行
            }

      }
}
