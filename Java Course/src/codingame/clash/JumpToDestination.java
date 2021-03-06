package codingame.clash;

import java.util.*;

/**
 * *
 * 從 1 出發，每次跳 4，跳幾次到終點
 *
 * @author chuan
 */
class JumpToDestination {

      public static void main(String a[]) {
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt() - 1;
            if (s % 4 == 0) {
                  System.out.println(s / 4);
            } else {
                  System.out.println(s / 4 + 1);
            }
      }
}

/**
import java.util.*;class Solution{public static void main(String a[]){int s=new Scanner(System.in).nextInt()-1;System.out.println(s%4==0?s/4:s/4+1);}}
* */
