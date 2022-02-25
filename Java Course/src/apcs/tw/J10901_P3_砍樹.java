package apcs.tw;

import java.util.ArrayList;
import java.util.Scanner;

public class J10901_P3_砍樹 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int limit = sc.nextInt();
            ArrayList<Tree> trees = new ArrayList<Tree>();

            for (int i = 0; i < n; i++) {
                  Tree t = new Tree();
                  t.pos = sc.nextInt();
                  trees.add(t);

            }
            for (int i = 0; i < n; i++) {
                  Tree t = trees.get(i);
                  t.height = sc.nextInt();
            }

            // start cut
            int top = 0 ;
            while (true) {
                  int k = trees.size() ;
                  for (int i = trees.size() - 1; i >= 0; i--) {
                        if (canCut(i, trees, limit)) {
                              if( trees.get(i).height>=top){
                                    top = trees.get(i).height ;
                              }
                              trees.remove(i);
                        }
                  }
                  if(k==trees.size() || trees.size()==0){
                        break; 
                  }
            }

//            System.out.println(n-trees.size());
//            System.out.println(top);
            
      }

      static boolean canCut(int i, ArrayList<Tree> trees, int max) {

            Tree t = trees.get(i);
            if (trees.size() == 1) {
                  if (t.pos + t.height <= max || t.pos - t.height >= 0) {
                        return true;
                  } else {
                        return false;
                  }
            }
            // 2 棵以上
            if (i == 0) { // 最前
                  if (t.pos + t.height > trees.get(i + 1).pos) {
                        return false;
                  }
                  return true;

            }
            if (i == trees.size() - 1) { // 最後
                  if (t.pos - t.height < trees.get(i - 1).pos) {
                        return false;
                  }
                  return true;
            }
            // 中間

            if (t.pos + t.height <= trees.get(i + 1).pos || t.pos - t.height >= trees.get(i - 1).pos) {
                  return true;
            } else {
                  return false;
            }

      }
}

class Tree {

      int pos;
      int height;
}
