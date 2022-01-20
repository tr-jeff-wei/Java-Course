/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectures;

/**
 *
 * @author chuan
 */
public class alg_seg {

}

class SegmentTree {

      int n;
      int[] segTree;

      SegmentTree(int n) {
            this.n = n;
            segTree = new int[2 * n + 1];
      }

      int comb(int a, int b) {
            // return Math.max( a, b ) ; // 取最大
            // return Math.min( a, b ) ; // 取最小
            return a + b; // 加總
      }

      void update(int i, int val) {
            segTree[i + n] = val;
            // 往上更新
            i = i / 2; // 往上一層
            while (i > 0) {
                  segTree[i] = comb(segTree[2 * i], segTree[2 * i + 1]);
                  i /= 2; // 往上一層
            }
      }

}

