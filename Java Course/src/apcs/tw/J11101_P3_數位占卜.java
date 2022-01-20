package apcs.tw;

import java.util.HashSet;
import java.util.Scanner;

public class J11101_P3_數位占卜 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            HashSet<String> strSet = new HashSet<>();
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                  strSet.add(sc.nextLine());
            }
            long ans = 0 ;
            for (String w : strSet) {
                  for (int len = 2 - w.length() % 2; len < w.length(); len += 2) {
                        // w:pairpa    ir
                        int m = (w.length() + len) / 2; // full string mid point
                        
                        // 檢查後段 pa 可以匹配最前面 pa ==>  w :  pari | pa  
                        String head2 = w.substring(m) ;
                        if( w.indexOf(head2)!=0){
                              continue ;
                        }
                        
                        String target = w.substring(w.length() - m, m); // 2 ~4
                        if( strSet.contains(target)){
                              System.out.println(w+"  >>>  "+target);
                              ans++;
                        }
                  }
            }            
            System.out.println(ans);

      }

}
