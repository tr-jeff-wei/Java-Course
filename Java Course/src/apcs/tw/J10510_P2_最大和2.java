
package apcs.tw;

import java.util.Scanner;


public class J10510_P2_最大和2 {
       public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in) ;
          
          int groups =  sc.nextInt() ;// 幾組
          int n =  sc.nextInt() ;// 每組幾個
          
          // 記錄每一組最大的數字是多少
          int[] gMax = new int[groups] ;
          
          int total = 0 ; // 把最大的都加在 total
          
          for( int g=0;g<groups;g++) { // for 每一組
               // 找到組內最大
               int max = 0 ;
               
               // 每組會有 n 個數字
               for( int i=0 ; i<n ; i++ ) {
                    int x = sc.nextInt() ;
                    if( x>max) {
                         max = x ;
                    }
               }               
               // 把 max 記下
               gMax[g] = max ;
               // 把 max 加到 total
               total = total + max ;
               //System.out.println("第"+g+"組 ===> "+max);
          }
          System.out.println(total);
          
          // 把 gMax 的每一個拿出來，看看是否可以把 total 整除
          boolean print = false ; // 紀錄有沒有印過:可以整除的餘數
          for (int i = 0; i < gMax.length; i++) {
               if( total % gMax[i] == 0 ) {
                    // 整除，要印
                    if( print == false) {
                         // 第一次要印，不印空格
                         System.out.print(gMax[i]);
                    }else {
                         // 之前有印過的，要有空格
                         System.out.print(" "+gMax[i]);                         
                    }                    
                    print = true;
               }
          }
          // 所有都不能整除，印-1
          if( print == false ) {
               System.out.println(-1);
          }
          
          
     }
}
