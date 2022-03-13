package apcs.tw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J10901_P3_砍樹 {

      // 物件作法，
      public static void main_1(String[] args) throws IOException {

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String s = bf.readLine() + " ";
            s += bf.readLine() + " ";
            s += bf.readLine();
            bf.close();
            StringTokenizer st = new StringTokenizer(s);
//            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(st.nextToken());
            int limit = Integer.parseInt(st.nextToken());

            LinkedList<Tree> trees = new LinkedList<>();
            Tree t0 = new Tree();
            t0.pos = 0;
//            t0.prev = -1;
//            t0.next = 1;
            t0.height = 0;

            trees.add(t0);

            for (int i = 1; i <= n; i++) {
                  Tree t = new Tree();
                  t.pos = Integer.parseInt(st.nextToken());
                  trees.add(t);
//                  t.prev = i - 1;
//                  t.next = i + 1;
            }
            for (int i = 1; i <= n; i++) {
                  Tree t = trees.get(i);
                  t.height = Integer.parseInt(st.nextToken());
            }
            Tree t9 = new Tree();
            t9.pos = limit;
//            t9.prev = n;
//            t9.next = -1;
            t9.height = 0;
            trees.add(t9);

            // loop from first
            int max = 0;
            int count = 0;
            for (int i = 1; i < trees.size() - 1; i++) {
                  Tree pre = trees.get(i - 1);
                  Tree here = trees.get(i);
                  Tree next = trees.get(i + 1);

                  while (here.pos + here.height <= next.pos || here.pos - here.height >= pre.pos) {
                        // 
                        count++;
                        if (here.height > max) {
                              max = here.height;
                        }
                        trees.remove(i);
                        // 砍樹成功，若不是開頭的樹（i==1），因為可能影響到上一棵樹，要往前確認
                        i--;
                        if (i < 1) {
                              break;
                        }
                        pre = trees.get(i - 1);
                        here = trees.get(i);
                        next = trees.get(i + 1);
                  }
            }

            System.out.println(count);
            System.out.println(max);
      }

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int limit = sc.nextInt();
            Tree[] trees = new Tree[n + 2];

            // 加入開頭位置 0 ，也當作一棵樹
            trees[0] = new Tree() ;
            trees[0].pos = 0;
            trees[0].pos = 0;
            trees[0].prev = - 1;
            trees[0].next = 1;

            for (int i = 1; i <= n; i++) {
                  Tree t = new Tree();
                  t.pos = sc.nextInt();
                  t.prev = i - 1;
                  t.next = i + 1;
                  trees[i] = t;
            }

            for (int i = 1; i <= n; i++) {
                  trees[i].height = sc.nextInt();
            }

            // 加入最後限制的位置，當作一棵樹
            trees[n + 1] = new Tree();
            trees[n + 1].pos = limit;
            trees[n + 1].prev = n;
            trees[n + 1].next = -1;

            // 依序檢查是否可以刪除
            // 如果發現可以刪除 ==> 往前一個再檢查一次，因為前一個可能會被影響到
            int top = 0;
            int cutCount = 0;
            for (int checkIdx = 1; checkIdx <= n;) {
                  Tree here = trees[checkIdx];
                  Tree preT = trees[here.prev];
                  Tree nextT = trees[here.next];

                  while (here.pos + here.height <= nextT.pos || here.pos - here.height >= preT.pos) {
                        if (here.height >= top) {
                              top = here.height;
                        }
                        // remove
                        preT.next = here.next;
                        nextT.prev = here.prev;
                        cutCount++;

                        // 砍樹成功，若不是開頭的樹（preT[pos] == 0），因為可能影響到上一棵樹，要往前確認
                        if (here.prev == 0) {
                              break;
                        }

                        here = trees[here.prev]; // 回朔前一個
                        preT = trees[here.prev];
                        nextT = trees[here.next];

                  }
                  checkIdx = here.next;
            }

            System.out.println(cutCount);
            System.out.println(top);
      }

}

class Tree {

      int pos;
      int height;
      int prev;
      int next;
}
