package apcs.tw;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J10910_P4_f315_apcs_4_低地距離 {

      /*
input
3
3 1 2 1 3 2
       */
      static long Merge(ArrayList<Integer> a) {
            int n = a.size() / 2;
            int mid = n / 2;
            boolean[] on = new boolean[n + 1];
            long ans = 0;
            for (int i = 0, psum = 0; i < (int) a.size(); i++) {
                  if (a.get(i) <= mid) {
                        psum++;
                  } else {  // a.get(i) > mid
                        if (on[a.get(i)] == false) {
                              ans -= psum;
                              on[a.get(i)] = true;
                        } else {  // count[  a.get(i)   ] == 1
                              ans += psum;
                        }
                  }
            }
            return ans;
      }

      static long DC(ArrayList<Integer> a) {
            if (a.size() <= 2) {
                  return 0;
            }
            int n = a.size() / 2;
            int mid = n / 2;
            ArrayList<Integer> aSmall = new ArrayList<>();
            ArrayList<Integer> aLarge = new ArrayList<>();
            for (int i = 0; i < (int) a.size(); i++) {
                  if (a.get(i) <= mid) {
                        aSmall.add(a.get(i));
                  } else {  // a.get(i) > mid
                        aLarge.add(a.get(i) - mid);
                  }
            }
            return DC(aSmall) + DC(aLarge) + Merge(a);
      }

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();

            for (int i = 0; i < 2 * n; i++) {
                  a.add(sc.nextInt());
            }

            System.out.println(DC(a));

      }

}
