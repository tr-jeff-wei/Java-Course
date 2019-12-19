package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class J10603_P1 {

    public static void main(String[] args) {


        String input = "263541\n"; // 答案 3
        input = "131\n"; // 答案1

        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);


        Scanner sc = new Scanner(System.in);
        String numberString = sc.nextLine();

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            // 奇偶判斷
            if (i % 2 == 0) {
                sum1 = sum1 + getInteger(c);
            } else {
                sum2 = sum2 + getInteger(c);
            }
        }

        int answer = Math.abs(sum1 - sum2);
        System.out.println(answer);

    }

    // 方法1：字元取得數字
    public static int getInteger(char c) {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return 0;
        }

    }

    // 方法2：字元取得數字
    public static int getInteger2(char c) {
        return c - '0';
    }
}
