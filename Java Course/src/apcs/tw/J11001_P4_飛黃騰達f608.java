package apcs.tw;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J11001_P4_飛黃騰達f608 {

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
            
            int max = -1 ;
            for (int i = 0; i < result.length; i++) {
                  if( max < result[i]){
                        max=result[i] ;
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
