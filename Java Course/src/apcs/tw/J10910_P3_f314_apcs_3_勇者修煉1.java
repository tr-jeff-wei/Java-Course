package apcs.tw;

import java.util.Scanner;

public class J10910_P3_f314_apcs_3_勇者修煉1 {
     
     public static void main(String[] args) {          
          
          Scanner sc = new Scanner(System.in) ;
          int r = sc.nextInt() ;
          int c = sc.nextInt() ;
          
          //多預留上側邊、左側邊、右側邊各一空行
          int[][] ori = new int[r+1][c+2] ;          
          int[][] l2r = new int[r+1][c+2] ;
          int[][] r2l = new int[r+1][c+2] ;
          
          for (int i = 1; i <= r; i++) {
               for (int j = 1; j <=c; j++) {
                    ori[i][j] = sc.nextInt() ;
               }
          }
          
          //----------------------------------  
          
          int fmax = -1 ;
          
          for( int ri = 1 ; ri<=r ; ri++) {
               
               // l2r
               for( int c1 = 1 ; c1<=c ; c1++) {
                    
                    // up
                    int u = ori[ri-1][c1] + ori[ri][c1] ;
                    
                    // left
                    int l = l2r[ri][c1-1] + ori[ri][c1] ;
                    
                    // keep best value
                    l2r[ri][c1] = Math.max(u, l) ;
               }
               
               // r2l
               for( int c2 = c ; c2>=1 ; c2--) {
                    // up
                    int u = ori[ri-1][c2] + ori[ri][c2] ;
                    
                    // right
                    int rt = r2l[ri][c2+1] + ori[ri][c2] ;
                    
                    // keep best value
                    r2l[ri][c2] = Math.max(u, rt) ;
                    
                    // final best value
                    ori[ri][c2] = Math.max( r2l[ri][c2] , l2r[ri][c2]) ;     
                    
                    if( ri==r) {
                         if( ori[ri][c2] >fmax) {
                              fmax = ori[ri][c2]  ;
                         }
                    }
               }
          }
          System.out.println(fmax);
          
     }

}
