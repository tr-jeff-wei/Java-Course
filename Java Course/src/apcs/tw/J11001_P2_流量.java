package apcs.tw;

import java.util.ArrayList;
import java.util.Scanner;

public class J11001_P2_流量 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[][] flow = new int[n][m];
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        flow[i][j] = sc.nextInt();
                  }
            }

            int minTotal = Integer.MAX_VALUE;
            for (int a = 0; a < k; a++) {

                  // solution
                  ArrayList<Integer>[] cityServers = new ArrayList[m];
                  for (int i = 0; i < cityServers.length; i++) {
                        cityServers[i] = new ArrayList<Integer>();
                  }
                  for (int i = 0; i < n; i++) {
                        int city = sc.nextInt();
                        cityServers[city].add(i);
                  }

                  // city_a --> city_b
                  int solTotal = 0;
                  for (int ca = 0; ca < m; ca++) {
                        if (cityServers[ca].isEmpty()) {
                              continue;
                        }
                        for (int cb = 0; cb < m; cb++) {

                              int totalFlow = 0;
                              for (int serverIdx : cityServers[ca]) {
                                    totalFlow += flow[serverIdx][cb];
                              }

                              if (ca == cb) {
                                    solTotal += totalFlow;
                              } else {
                                    if (totalFlow > 1000) {
                                          solTotal += (1000 * 3 + 2 * (totalFlow - 1000));
                                    } else {
                                          solTotal += totalFlow * 3;
                                    }
                              }
                        }
                  }

                  if (solTotal < minTotal) {
                        minTotal = solTotal;
                  }
                  //System.out.println("m >> " + solTotal);
            }
            System.out.println(minTotal);
      }

}
