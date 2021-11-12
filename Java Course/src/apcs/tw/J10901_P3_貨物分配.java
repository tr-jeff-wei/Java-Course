package apcs.tw;

import java.util.ArrayList;
import java.util.Scanner;

public class J10901_P3_貨物分配 {

//      7 2
//9 2 1 6 7 4 5
//2 3
//1 2 5
//2 3 7
//3 13 10
//4 9 11
//6 12 8
//5 6 4
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            DistN[] arr = new DistN[2 * n];

            for (int i = 1; i < arr.length; i++) {
                  arr[i] = new DistN(i);
            }
            for (int i = n; i < arr.length; i++) {
                  arr[i].weight = sc.nextInt();
            }

            // cargo
            ArrayList<Integer> cargos = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                  cargos.add(sc.nextInt());
            }

            // build tree
            for (int i = 0; i < n - 1; i++) {
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  int c = sc.nextInt();
                  arr[a].left = arr[b];
                  arr[a].right = arr[c];
                  
                  arr[b].parent = arr[a] ;
                  arr[c].parent = arr[a] ;
            }

      }
}

class DistN {

      DistN parent;
      DistN left;
      DistN right;
      int weight;

      int id;

      DistN(int id) {
            this.id = id;
      }

//      void setWeight(int w){
//            weight += w ;
//            if( parent!=null){
//                  parent.setWeight(w);
//            }
//      }
}
