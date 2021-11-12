package lectures.bst;

/**
 *
 * @author chuan
 */
public class alg_bst_for_range_query {

      static int[] data = {5, 3, 7, 2, 9, 6, 4, 1};

      public static void main(String[] args) {

            // 區段樹 segment tree : 區段查詢  range query
            int k = (int) Math.ceil(Math.log(data.length) / Math.log(2) + 1);
            System.out.println("layer => " + k);

            RangeData[] tree = new RangeData[(int) Math.pow(2, k)];
            createRangeData(tree, 1, 0, data.length - 1);
            System.out.println("=======================");
            int m25 = queryRangeData( tree , 1 , 2, 5 ) ;
            System.out.println(m25);
      }

      // range : s~e ( s , e 都包含 )
      static int createRangeData(RangeData[] tree, int treeIdx, int s, int e) {

            // 建立節點
            tree[treeIdx] = new RangeData();
            tree[treeIdx].start = s;
            tree[treeIdx].end = e;

            if (s == e) {
                  tree[treeIdx].min = data[s];
                  return tree[treeIdx].min;
            }

            int mid = (s + e) / 2;

            // 左兒子
            int lv = createRangeData(tree, treeIdx * 2, s, mid);

            // 右兒子
            int rv = createRangeData(tree, treeIdx * 2 + 1, mid + 1, e);

            tree[treeIdx].min = Math.min(lv, rv);
            return tree[treeIdx].min;
      }

      // range : s~e ( s , e 都包含 )
      static int queryRangeData(RangeData[] tree, int treeIdx, int qs, int qe) {

            // 建立節點
            RangeData node = tree[treeIdx];

            if (qs <= node.start && node.end <= qe) {
                  // 在範圍內，return
                  return node.min;
            } else {
                  // 不在範圍，往下繼續查 ==> 左右子樹
                  if (node.start == node.end) {
                        return Integer.MAX_VALUE ;
                  }
                  if( node.end < qs || node.start > qe ){
                        return Integer.MAX_VALUE ;
                  }                  
                  
                  int mLeft = queryRangeData( tree , treeIdx*2 , qs,qe) ;
                  int mRight= queryRangeData( tree , treeIdx*2+1 , qs,qe) ;
                  return Math.min( mLeft, mRight) ;
            }

         
      }

}

class RangeData {

      int start;
      int end;
      int min;
}
