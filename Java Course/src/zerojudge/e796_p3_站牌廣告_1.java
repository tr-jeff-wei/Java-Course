package zerojudge;


import java.util.Scanner;

public class e796_p3_站牌廣告_1 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int np = sc.nextInt();
            int[] stations = new int[n + 1];
            for (int i = 0; i < np; i++) {
                  int start = sc.nextInt();
                  int end = sc.nextInt();
                  // 小的數在前
                  if (end < start) {
                        int tmp = start;
                        start = end;
                        end = tmp;
                  }
                  for (int j=start; j <= end; j++) {
                        stations[j]++ ;                        
                  }
            }
            int maxIdx = -1 ;
            int max =-1 ;
            int minIdx = -1;
            int min = -1;
            // 找最大、最小 的位置
            for (int i = 1; i < stations.length; i++) {
                  
                  
                  //System.out.println("==>"+total);
                  if( maxIdx==-1 || stations[i]>=max){
                        maxIdx = i ;
                        max = stations[i] ;
                  }
                  
                  if( minIdx==-1 || stations[i]<min){
                        minIdx = i ;
                        min = stations[i] ;
                  }
            }
            
            System.out.println(minIdx+" "+maxIdx);

      }
}
