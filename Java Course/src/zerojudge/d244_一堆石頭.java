package zerojudge;

import java.util.HashMap;
import java.util.Scanner;

public class d244_一堆石頭 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            // 超級大的超級倉庫
            HashMap<Integer, Integer> map = new HashMap<>();

            while (sc.hasNextInt()) {
                  int n = sc.nextInt();
                  if (map.containsKey(n)) {
                        map.put(n, map.get(n) + 1);
                  } else {
                        map.put(n, 1);
                  }
            }
            for (int key : map.keySet()) {
                  int v = map.get(key);
                  if (v == 2) {
                        System.out.println(key);
                        return;
                  }
            }
      }
}
