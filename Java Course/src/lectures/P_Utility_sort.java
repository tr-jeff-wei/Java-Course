package lectures;

import java.util.Arrays;

public class P_Utility_sort {

    public static void main(String[] args) {
        sort_array();
    }


    public static void sort_array() {

        int[] test = new int[]{2, 5, 3, 6, 9, 1};

        // 由小到大排
        Arrays.sort(test);

        System.out.println(Arrays.toString(test));
        // [1, 2, 3, 5, 6, 9]

        String[] names = new String[]{
                "cat", "Jack", "Ada", "Joe", "human", "Ava", "Brown", "Byrne"
        };

        // 英文字會照：大小寫 -> 字母序
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
        // [Ada, Ava, Brown, Byrne, Jack, Joe, cat, human]
    }


}
