package apcs.tw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J11001_P4_飛黃騰達f608 {

      public static void main6(String[] args) {

            ArrayList<Integer> t = new ArrayList<>();
            t.add(2);
            t.add(5);
            t.add(5);
            t.add(5);

            t.add(8);
            System.out.println(t);
//
//            int idx = Collections.binarySearch(t, 3);
//            idx = -(idx + 1);  // 可插入目標的點
            int idx = binarySearch(t, 5);
            System.out.println("idx --> "+idx);
//            t.set(idx, 3);
//            System.out.println(t);
      }

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Pt> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {

                  int x = sc.nextInt();
                  int y = sc.nextInt();

                  Pt p = new Pt();
                  p.x = x;
                  p.y = y;

                  list.add(p);
            }

            Collections.sort(list);
            m2(list);
//            m1(list) ;
      }

      // 實作 BinarySearch 找插入點
      static int binarySearch(ArrayList<Integer> list, int target) {
            int left = 0;
            int right = list.size();
            while (left != right) {
                  int mid = (left + right) / 2;
                  // 等於仍然 Left 會右移，找到大於 target 的最小數
                  // 一般二分搜找到目標就會 return ，這裡不會
                  if (target >= list.get(mid)) {
                        left = mid + 1;
                  } else {
                        right = mid;
                  }
            }
            return left;
      }

      static void m2(ArrayList<Pt> list) {
            ArrayList<Integer> tmp = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {

                  // 要自己實作 binary search ，因為會有重複的數值問題
                  //（用預設的 api ，如果是重複的值 不知道拿到的是重複值的哪一個，
                  //    這裡要取重複值的後一個）
                  int index = binarySearch(tmp, list.get(i).y);
                  if (index >= tmp.size()) {
                        tmp.add(list.get(i).y);
                  } else {
                        tmp.set(index, list.get(i).y);
                  }
//                  System.out.println(tmp);
            }

            System.out.println(tmp.size());

      }

      static void m1(ArrayList<Pt> list) {
            int[] result = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                  result[i] = 1;
                  for (int j = 0; j < i; j++) {
                        if (list.get(j).y < list.get(i).y) {
                              int m = result[j] + 1;
                              result[i] = Math.max(result[i], m);
                        }
                  }
            }

            int max = -1;
            for (int i = 0; i < result.length; i++) {
                  if (max < result[i]) {
                        max = result[i];
                  }
            }
            System.out.println(max);

      }

}

class Pt implements Comparable<Pt> {

      int x, y;

      @Override
      public int compareTo(Pt o) {
            if (this.x == o.x) {
                  return this.y - o.y;
            }
            return this.x - o.x;
      }

      public String toString() {
            return x + "," + y;
      }

}
