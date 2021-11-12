
package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class e997_升旗典禮抽背課文 {
      
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in) ;
            
            // 抓一整行
            String line = sc.nextLine() ;
            String[] names = line.split(" ") ;
            
            // 抓數字：n->倒數第幾個
            int n = sc.nextInt() ;

            // pos : 座位編號
            int pos = names.length - n ;
            System.out.println( names[pos]);
            
            // for 對 array 從尾 --> 頭
            // {  5  , 3  , 2 ,  7 }
            //   [0] [1] [2] [3]  ==> length : 4
            // 最後一個位置：length-1 ==> 3
            //  
//            for (int i = names.length-1; i>=0; i=i-1) {
//                  String name = names[i];
//                  
//            }
            
            
      }
}
