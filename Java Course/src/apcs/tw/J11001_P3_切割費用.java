package apcs.tw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J11001_P3_切割費用 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int L = sc.nextInt();
            int[] cuts = new int[n+1] ;
            for (int i = 0; i < n; i++) {
                  int s = sc.nextInt();
                  int idx = sc.nextInt() ;
                  cuts[idx] = s ;
            }
            
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0) ;
            list.add(L) ;
            
            long total =  0 ;
            for (int i = 1; i < cuts.length; i++) {
                  int cut = cuts[i];
                  int idx = Collections.binarySearch(list, cut) ;
                  if( idx < 0 ){
                        idx = -( idx+1) ;
                  }
                  total = total + ( list.get(idx)-list.get(idx-1)) ;
                  list.add(idx,cut) ;
            }
            System.out.println(total);
      }
}
