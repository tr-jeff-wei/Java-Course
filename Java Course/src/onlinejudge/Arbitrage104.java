package onlinejudge;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Arbitrage104 {

      public static void main(String[] args) {

            String data = "3\n"
                    + "1.2 .89\n"
                    + ".88 5.1\n"
                    + "1.1 0.15\n"
                    + "4\n"
                    + "3.1 0.0023 0.35\n"
                    + "0.21 0.00353 8.13\n"
                    + "200 180.559 10.339\n"
                    + "2.11 0.089 0.06111\n"
                    + "2\n"
                    + "2.0\n"
                    + "0.45";

            InputStream is = new ByteArrayInputStream(data.getBytes());
            System.setIn(is);

            Scanner sc = new Scanner(System.in);

            while (sc.hasNextInt()) {
                  int n = sc.nextInt();
                  float[][] ratio = new float[n][n];
                  for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                              if (i == j) {
                                    continue;
                              }
                              ratio[i][j] = sc.nextFloat();
                        }
                  }

                  PriorityQueue<Node> pq = new PriorityQueue();
                  for (int i = 0; i < n; i++) {
                        Node node = new Node() ;
                        node.path.add(i) ;
                        pq.add(node) ;
                  }
                  

                  while (pq.size() > 0) {
                        Node node = pq.poll();
                        
                        
                  }

                  
            }

      }
}

class Node implements Comparable<Node> {
      
      String path="" ;
      int lastIndex;

      //ArrayList<Integer> path = new ArrayList<>();
      double score = 0;

      
      public Node(int i){
            path +=i ;
            lastIndex = i ;
      }
      
      public boolean add( float[][] matrix , int idx ){
            // check repeat
      }
      
      @Override
      public int compareTo(Node o) {
            if (this.path.length() != o.path.length()) {
                  return this.path.length() - o.path.length();
            }
            return o.score > this.score ? 1 : -1;
      }
      
      public String toString(){
            System.out.print(path);
            System.out.println(" -> "+score);
            return "";
      }
}
