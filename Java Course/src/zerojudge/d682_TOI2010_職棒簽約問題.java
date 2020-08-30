package zerojudge;

import java.util.HashMap;
import java.util.Scanner;

public class d682_TOI2010_職棒簽約問題 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int maxTotal = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();
            int maxAp = 0;
            HashMap<Integer, Integer> costApMap = new HashMap<>();
            costApMap.put(0, 0);

            for (int i = 0; i < r; i++) {
                  HashMap<Integer, Integer> tmpMap = new HashMap<>();
                  for (int j = 0; j <= c; j++) {
                        // j==c ==> 每一個位子可以不選 price:0 , cost:0
                        int price = 0;
                        int ap = 0;
                        if (j < c) {
                              price = sc.nextInt();
                              ap = sc.nextInt();
                        }
                        for (Integer cost : costApMap.keySet()) {
                              int totalCost = cost + price;
                              int totalAp = ap + costApMap.get(cost);
                              if (totalCost <= maxTotal) {
                                    Integer tap = tmpMap.get(totalCost);
                                    if (tap == null) {
                                          tmpMap.put(totalCost, totalAp);
                                    } else if (totalAp > tap) {
                                          tmpMap.put(totalCost, totalAp);
                                    }
                                    if (totalAp > maxAp) {
                                          maxAp = totalAp;
                                    }
                              }
                        }
                  }
                  costApMap = tmpMap;
            }

            System.out.println(maxAp);

      }

}
