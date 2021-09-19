package apcs.tw;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J11009_P2_魔王迷宮_g276 {

      // 注意：題目要輸出有幾個位置有炸彈，不是全部有幾個!!
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Ps> plist = new ArrayList<>();

            for (int i = 0; i < k; i++) {
                  Ps p = new Ps();
                  p.r = sc.nextInt();
                  p.c = sc.nextInt();
                  p.mr = sc.nextInt();
                  p.mc = sc.nextInt();

                  plist.add(p);
            }

            boolean[][] bomb = new boolean[n][m];

            while (plist.size() > 0) {

                  // set bomb 
                  for (Ps p : plist) {
                        bomb[p.r][p.c] = true;

                  }

                  // move 
                  for (Ps p : plist) {
                        p.move();
                  }

                  // check boundary
                  for (int i = plist.size() - 1; i >= 0; i--) {
                        Ps p = plist.get(i);
                        if (p.r >= n || p.c >= m || p.r < 0 || p.c < 0) {
                              plist.remove(i);
                        }
                  }

                  // check bomb
                  ArrayList<Ps> explodeBombs = new ArrayList<>();
                  for (int i = plist.size() - 1; i >= 0; i--) {
                        Ps p = plist.get(i);
                        if (bomb[p.r][p.c]) {
                              explodeBombs.add(p);
                              plist.remove(i);
                        }
                  }
                  for (Ps b : explodeBombs) {
                        bomb[b.r][b.c] = false;
                  }
            }
            int totalBomb = 0;
            for (int i = 0; i < bomb.length; i++) {
                  for (int j = 0; j < bomb[i].length; j++) {
                        if (bomb[i][j]) {
                              totalBomb++;
                        }
                  }

            }

            System.out.println(totalBomb);

      }
}

class Ps {

      int r;
      int c;
      int mr;
      int mc;

      public void move() {
            r += mr;
            c += mc;
      }
}
