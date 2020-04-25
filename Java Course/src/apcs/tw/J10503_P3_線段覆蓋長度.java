package apcs.tw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class J10503_P3_線段覆蓋長度 {


    public static void main(String[] args) {
//        String input = genRandomData(5, 10);
//        System.out.println(input);


        String input = "5\n" +
                "160 180\n" +
                "150 200\n" +
                "280 300\n" +
                "300 330\n" +
                "190 210\n";
        //----------------------
        method1(input);
        method2(input);


    }

    public static void method1(String input) {
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        boolean[] result = new boolean[100000];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int m = start; m < end; m++) {
                result[m] = true;
            }
        }

        int total = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i]) {
                total++;
            }
        }
        System.out.println(total);
    }

    public static void method2(String input) {
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Segment[] lines = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            lines[i] = new Segment();
            lines[i].start = start;
            lines[i].end = end;
        }
        Arrays.sort(lines);

        for (int i = 1; i < lines.length; i++) {
            for (int previous = i - 1; previous >= 0; previous--) {
                if (lines[previous] != null) {
                    if (lines[previous].isOverlapping(lines[i])) {
                        lines[i] = null;
                        break;
                    }
                }
            }
        }

        int total = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i] != null) {
                total = total + lines[i].getDistance();
            }
        }

        System.out.println(total);
    }

    static String genRandomData(int maxN, int maxM) {

        int n = (int) (Math.random() * maxN);
        if (n == 0) {
            n++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n + "\n");

        int range = maxM / n;
        int m = (int) (Math.random() * range);

        for (int i = 0; i < n; i++) {
            int start = (int) (Math.random() * (maxM - range));
            int end = start + (int) (Math.random() * range);
            sb.append(start + " " + end + "\n");
        }
        return sb.toString();

    }


}

class Segment implements Comparable<Segment> {
    int start;
    int end;

    public boolean isOverlapping(Segment other) {
        if (start <= other.start) {

            if (end >= other.start) {
                merge(other);
                return true;
            } else {
                return false;
            }

        } else {
            if (other.end >= start) {
                merge(other);
                return true;
            } else {
                return false;
            }
        }
    }

    public void merge(Segment other) {
        start = Math.min(start, other.start);
        end = Math.max(end, other.end);
    }

    public int getDistance() {
        return end - start;
    }

    public void show() {
        System.out.println(start + " -> " + end);
    }

    @Override
    public int compareTo(Segment segment) {
        return this.start - segment.start;
    }
}