package apcs.tw;

import java.util.Scanner;

public class J11001_P1_購買力 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int nProducts = sc.nextInt();
            int diff = sc.nextInt();
            int buyCount = 0 ;
            int buyTotal = 0 ;
            for (int i = 0; i < nProducts; i++) {
                  int max = Integer.MIN_VALUE;
                  int min = Integer.MAX_VALUE;
                  int avg = 0;
                  for (int j = 0; j < 3; j++) {
                        int v = sc.nextInt();
                        avg += v;
                        max = Math.max(v, max);
                        min = Math.min(v, min);
                  }
                  avg = avg / 3;
                  
                  if( max-min >= diff ){
                        buyTotal += avg ;
                        buyCount++ ;
                  }
            }
            
            System.out.println(buyCount +" "+buyTotal);

      }

}
