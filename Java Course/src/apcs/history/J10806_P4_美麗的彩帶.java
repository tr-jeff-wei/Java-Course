package apcs.history;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class J10806_P4_美麗的彩帶 {

        static int perfectLen;
        static int bandLength;
        static long perfectCount = 0;
        static HashMap<String, Integer> perfectSet = new HashMap<>();

        public static void main(String[] args) throws IOException {
                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

                String[] l1 = buf.readLine().split(" ");
                perfectLen = Integer.parseInt(l1[0]);
                bandLength = Integer.parseInt(l1[1]);
                String[] band = buf.readLine().split(" ");

                // 1. 計算第一段，長度== perfectLen
                for (int i = 0; i < perfectLen; i++) {
                        addRight(band[i]);
                }
                // 看看是否剛好滿足
                if (perfectSet.size() == perfectLen) {
                        perfectCount++;
                }

                // 2. 計算剩餘的（往後一步，最前面刪掉一個）
                for (int i = perfectLen; i < band.length; i++) {
                        removeLeft(band[i - perfectLen]);
                        addRight(band[i]);
                        // 看看是否剛好滿足
                        if (perfectSet.size() == perfectLen) {
                                perfectCount++;
                        }
                }
                System.out.println(perfectCount);
        }

        public static void addRight(String a) {
                if (perfectSet.containsKey(a)) {
                        perfectSet.put(a, perfectSet.get(a) + 1);
                } else {
                        perfectSet.put(a, 1);
                }
        }

        public static void removeLeft(String a) {
                if (perfectSet.get(a) <= 1) {
                        perfectSet.remove(a);
                } else {
                        perfectSet.put(a, perfectSet.get(a) - 1);
                }
        }
}
