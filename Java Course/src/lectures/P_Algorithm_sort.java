package lectures;

import java.util.Arrays;

public class P_Algorithm_sort {


    public static void main(String[] args) {
        int[] test = new int[]{2, 5, 3, 6, 9, 1};
        insertionSort(test);
        System.out.println(Arrays.toString(test));
    }


    static void insertionSort(int arr[]) {

        // 1~最後
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // j：前面的項目
            // 前面的項目比 key 大的往後推一格
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    static void selectionSort(int arr[]) {
        int n = arr.length;

        // 0 ~ 倒數第 2 個
        for (int i = 0; i < n - 1; i++) {

            // 後面的所有項目 (k)  找到最小的數字
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            // 把後面最小的那一個 j 和 i 交換
            swap( arr , i , min_idx);
        }
    }

    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void swap(int[] arr, int m, int n) {
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }
}
