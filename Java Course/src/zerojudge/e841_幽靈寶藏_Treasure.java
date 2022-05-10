package zerojudge;


import java.util.Scanner;


/**
 *
 * @author chuan
 */
public class e841_幽靈寶藏_Treasure {
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            int n = sc.nextInt() ;
            int m = sc.nextInt() ; // 操作數
           
            long[] diff = new long[n+2] ; // for +/-
            long[] mul = new long[n+2] ; // for x
            long[] div  = new long[n+2] ;
            for (int i = 0; i < div.length; i++) {
                  div[i]=mul[i]=1;                  
            }
            
            
            for (int i = 0; i < m; i++) {
                  int a = sc.nextInt() ;
                  int b = sc.nextInt() ;
                  int action = sc.nextInt() ;
                  int amount = sc.nextInt() ;
                  if( action == 1 ){ // + 
                        diff[a]   += amount ;
                        diff[b+1] -= amount ;
                  }else if( action == 2 ){ // */
                        mul[a] *= amount ;
                        div[b+1] *= amount ; // 注意！還是用乘法累積在"除"的欄位
                  }
            }
            
            long max_i = -1 ;
            long max  = -1 ;
            for (int i = 1; i < diff.length; i++) {
                  diff[i] += diff[i-1] ;
                  mul[i] *= mul[i-1] ;
                  mul[i] /= div[i] ;
                  
                  long v = diff[i]*mul[i] ;
                  if( v > max){
                        max = v ;
                        max_i = i ;
                  }
            }
            
            System.out.println(max_i +" "+max);
            
            
      }
      
}
