import java.util.Scanner;

public class b517_是否為樹_商競103_2 {

     public static void main(String[] args) {
          
/*
4
6,8  5,3  5,2  6,4  5,6  1,2  2,0
8,1  1,3  6,2  8,10  7,5  1,4  7,8  7,6  8,0
3,8  6,8  6,4  5,3  5,6  8,2  2,0
1,0  4,3  1,2           
 */
          
          Scanner sc = new Scanner(System.in) ;
          int n = sc.nextInt(); // n<--4
          sc.nextLine();
          for( int i=0 ; i<n ; i++) {
               
               // 新的一題
               String line = sc.nextLine();
               
               // 組別倉庫， 0 當作沒有分組
               int[] group = new int[100] ;
               int groupId = 1 ;
               boolean answer = true ;
               
               String[] pairs = line.split(" ") ;
               for( int j=0 ; j<pairs.length ; j++) {
                    if(pairs[j].isEmpty()) {
                         continue ;
                    }
                    String[] nums = pairs[j].split(",") ;
                    int a = Integer.parseInt( nums[0] ) ;
                    int b = Integer.parseInt( nums[1] ) ;                   
                    
                    // (1) 都沒分組 : 新的一組
                    if( group[a]==0  && group[b]==0) {
                         group[a] = groupId ;
                         group[b] = groupId ;
                         groupId++ ;
                         continue ;
                    }
                    // (2) A 有組  B 沒有 : B <-- A
                    if( group[a]!=0  && group[b]==0) {
                         group[b] = group[a] ;
                         continue ;
                    }
                    // (3) B 有組  A 沒有 : A <-- B
                    if( group[b]!=0  && group[a]==0) {
                         group[a] = group[b] ;
                         continue ;
                    }
                    
                    // (4) A,B 都有組
                    //      --> AB 一樣：產生圍圈，不是樹
                    //      --> AB 不一樣：合併組
                    if(group[a]!=0  && group[b]!=0) {                         
                         if(group[a]==group[b]) {
                              //System.out.println("F");
                              answer = false ;
                              break ;
                         }else {
                              // 合併組：b 都變成 a 的組
                              int ref = group[b];
                              for( int m=0 ; m<group.length ; m++) {
                                   if( group[m] == ref) {
                                        group[m] = group[a] ;
                                   }                                   
                              }
                         }    
                    }
               } // for -> pairs end========
               
               // 確定所有的圈圈，都是同一組
               
               if( answer == true) {               
                         int g = 0 ;             
                         for( int m=0 ; m<group.length ; m++) {
                               if(group[m]!=0 && g==0) {
                                    g= group[m] ;                          
                               }
                               
                               if( g!=0) {
                                    if( group[m]!=0 && group[m]!=g) {
                                         //System.out.println("F");
                                         answer = false ;
                                         break ;
                                    }
                               }
                         }
               }
               if( answer ) {
                    System.out.println("T");
               }else {
                    System.out.println("F");
               }                              
          }
          
          
     }
}
