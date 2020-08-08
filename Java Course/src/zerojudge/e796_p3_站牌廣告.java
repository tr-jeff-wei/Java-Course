package zerojudge;


import java.util.Scanner;

public class e796_p3_站牌廣告 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int np = sc.nextInt();
            int[] stations = new int[n + 1];
            for (int i = 0; i < np; i++) {
                  int s = sc.nextInt();
                  int e = sc.nextInt();
                  if (e < s) {
                        int tmp = s;
                        s = e;
                        e = tmp;
                  }
                  //System.out.println(s+"--"+e);
                  stations[s]++;
                  if(e+1<stations.length){
                        stations[e+1]--;
                  }
            }
            int total = 0;
            int maxIdx = -1 ;
            int max =-1 ;
            int minIdx = -1;
            int min = -1;
            for (int i = 1; i < stations.length; i++) {
                  total += stations[i];
                  
                  //System.out.println("==>"+total);
                  if( maxIdx==-1 || total>=max){
                        maxIdx = i ;
                        max = total ;
                  }
                  
                  if( minIdx==-1 || total<min){
                        minIdx = i ;
                        min = total ;
                  }
            }
            
            System.out.println(minIdx+" "+maxIdx);

      }
}
