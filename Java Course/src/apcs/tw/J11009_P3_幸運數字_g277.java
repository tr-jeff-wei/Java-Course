package apcs.tw;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J11009_P3_幸運數字_g277 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            long[] accArr = new long[n] ;// 計算前加總陣列
            
            for (int i = 0; i < arr.length; i++) {
                  arr[i] = sc.nextInt();
                  if( i==0){
                        accArr[i]=arr[i] ;
                  }else{
                        accArr[i]=arr[i]+accArr[i-1] ;
                  }
            }      
            
            // 建立 "區段樹"
             int k = (int) Math.ceil(Math.log(arr.length) / Math.log(2) + 1);
            RangeData[] tree = new RangeData[(int) Math.pow(2, k)];
            createRangeData(arr, tree , 1 , 0 , arr.length-1) ;
            
            
            // -------------- while
            // 範圍：s~e
            // 1 找最小(mi)，切割
            // 2. 取總和
            int s = 0 ;
            int e = arr.length-1 ;
            while( s!=e ){
                  // 要改：同時記錄最小值、位置
                  RangeData mi = queryRangeData(tree,1,s,e) ;
                  
                  long LSum = getRangeSum( accArr , s , mi.minIdx-1) ;
                  long RSum = getRangeSum( accArr , mi.minIdx+1,e) ;
                  
                  if( LSum>RSum){
                        // 選左
                        e = mi.minIdx-1 ;
                  }else{
                        // 選右
                        s = mi.minIdx+1 ;
                  }
            }

            System.out.println(arr[s]);
            
      }
      
      static long getRangeSum( long[] accArr , int s , int e ){
//            System.out.println("s:"+s+"  , e:"+e);
            if( s>e){
                  return 0 ;
            }
            if(s==0){
                  return accArr[e] ;
            }            
            return accArr[e] - accArr[s-1] ;
      }
      
      
      // range : s~e ( s , e 都包含 )
      static int createRangeData(int[] data , RangeData[] tree, int treeIdx, int s, int e) {

            // 建立節點
            tree[treeIdx] = new RangeData();
            tree[treeIdx].start = s;
            tree[treeIdx].end = e;

            if (s == e) {
                  tree[treeIdx].min = data[s];
                  tree[treeIdx].minIdx = s ;
                  return tree[treeIdx].min;
            }

            int mid = (s + e) / 2;

            // 左兒子
            int lv = createRangeData(data , tree, treeIdx * 2, s, mid);

            // 右兒子
            int rv = createRangeData(data , tree, treeIdx * 2 + 1, mid + 1, e);

            if( lv<rv){
                  tree[treeIdx].min = lv ;
                  tree[treeIdx].minIdx =  tree[treeIdx*2].minIdx ; // 最小值從左兒子來，所以直接參考左兒子(treeIdx*2)的索引
            }else{
                   tree[treeIdx].min = rv ;
                  tree[treeIdx].minIdx =  tree[treeIdx*2+1].minIdx ; 
            }
            
           
            return tree[treeIdx].min;
      }

      // range : s~e ( s , e 都包含 )
      static RangeData queryRangeData(RangeData[] tree, int treeIdx, int qs, int qe) {

            // 建立節點
            RangeData node = tree[treeIdx];

            if (qs <= node.start && node.end <= qe) {
                  // 在範圍內，return
                  return node;
            } else {
                  // 不在範圍，往下繼續查 ==> 左右子樹
                  if (node.start == node.end) {
                        return null ;
                  }
                  if( node.end < qs || node.start > qe ){
                        return null ;
                  }                  
                  
                  RangeData mLeft = queryRangeData( tree , treeIdx*2 , qs,qe) ;
                  RangeData mRight= queryRangeData( tree , treeIdx*2+1 , qs,qe) ;
                  
                  if(mRight != null &&  mLeft==null){
                        return mRight ;
                  }
                   
                  if(mRight == null &&  mLeft!=null){
                        return mLeft ;
                  }
                  
                  if( mRight.min < mLeft.min){
                        return mRight ;
                  }else{
                        return mLeft ;
                  }
                  
            }

         
      }


}

class RangeData {
      int start;
      int end;
      int min;
      int minIdx ;
}
