package apcs.tw;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J11101_P4_牆上海報 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] wallH = new int[n];
            int[] paints = new int[k];
            int topWall = -1;
            for (int i = 0; i < wallH.length; i++) {
                  wallH[i] = sc.nextInt();
                  if (wallH[i] > topWall) {
                        topWall = wallH[i];
                  }
            }

            for (int i = 0; i < paints.length; i++) {
                  paints[i] = sc.nextInt();
            }

            int start = 0;
            int next = topWall/2 ;
            while (next>0) {
                  while( isPossible( wallH , paints , start + next)){
                        start += next ;
                  }
                  next = next/2 ;
            }
            System.out.println(start);

      }

      static boolean isPossible(int[] wallH, int[] paints, int target) {
            int wi = 0;
            int pi = 0;
            while (pi < paints.length) {

                  // find start wall                  
                  while (wi < wallH.length && wallH[wi] < target) {
                        wi++;
                  }
                  if (wi == wallH.length) {
                        break;
                  }

                  // 往後連續( paints[pi] )的牆面都要符合 target 高度
                  boolean isOk = true;
                  for (int i = 0; i < paints[pi]; i++) {
                        if (wi>=wallH.length || wallH[wi++] < target) {
                              // 沒有符合
                              isOk = false;
                              break;
                        }
                  }
                  if (isOk) {
                        pi++;
                  } else {
                        continue;
                  }

            }
            if (pi == paints.length) {
                  return true;
            }
            return false;
      }
}
