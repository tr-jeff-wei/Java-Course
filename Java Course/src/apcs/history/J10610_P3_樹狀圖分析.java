package apcs.history;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class J10610_P3_樹狀圖分析 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        // 紀錄每個節點的上層
        // index:0 不使用，題目從 1 號開始
        int[] parent = new int[n+1] ;
        // 記錄節點深度
        int[] depth = new int[n+1] ;
        ArrayList<Integer> walkList = new ArrayList<>();
        // 加入節點
        for (int i = 1; i <= n; i++) {
            int iNum = sc.nextInt() ;
            if( iNum==0 ){
                // 屬於頁節點
                walkList.add(i) ;
                depth[i]=0; // 深度設為 0
            }else{
                for (int idx = 0; idx < iNum; idx++) {
                    int i2 = sc.nextInt();
                    parent[i2]=i ;
                }
            }
        }

        // traverse map

        int root = -1 ;
        while (!walkList.isEmpty()) {
            int target = walkList.remove(0) ;

            int parentIdx = parent[target];
            if( parentIdx==0){
                root = target;
                continue;
            }
            int d = depth[target]+1 ;
            if( d>depth[parentIdx]){
                depth[parentIdx] = d ;
                walkList.add( parentIdx ) ;
            }
        }

        long totalDepth = 0 ;
        for (int i = 1; i < depth.length; i++) {
            totalDepth+=depth[i] ;
        }
        System.out.println(root);
        System.out.println(totalDepth);


    }
}
