import java.util.ArrayList;
import java.util.Scanner;

/**
 * APCS_最接近的高人
 */
class J10802_P3_最接近的高人 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        long total = 0;

        // stack 裡面放的是 arr 位置
        ArrayList<Integer> stack = new ArrayList<>();
        // 先放第一個（位置 0）
        stack.add(0);
        total += (0 + 1); // 題目的位置要加 1

        // 從 1 號（第二個）開始檢查到最後面
        for (int i = 1; i < arr.length; i++) {

            int v = arr[i];
            while (stack.size() > 0 && arr[stack.get(stack.size() - 1)] <= v) { // 檢查最後面
                stack.remove(stack.size() - 1); // 刪掉最後面
            }
            if (stack.isEmpty()) {
                total += (i + 1); // 沒有高人，加自己的距離
            } else {
                // 前面的高人和自己的距離
                total += (i - stack.get(stack.size() - 1));
            }

            stack.add(i);
        }

        System.out.println(total);

    }
}