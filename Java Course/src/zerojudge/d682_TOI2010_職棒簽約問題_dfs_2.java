package zerojudge;

import java.util.ArrayList;
import java.util.Scanner;

public class d682_TOI2010_職棒簽約問題_dfs_2 {

      static int[][] price;
      static int[][] ap;
      static int maxAp = 0;
      static int maxTotal = 0;

      static ArrayList<int[]> toDoList = new ArrayList<>();

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            maxTotal = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();

            // 允許某一組沒有選人，把最後一個位置當作空選項，所以 +1
            price = new int[r][c + 1];
            ap = new int[r][c + 1];

            for (int i = 0; i < r; i++) {
                  for (int j = 0; j < c; j++) {
                        price[i][j] = sc.nextInt();
                        ap[i][j] = sc.nextInt();
                  }
            }

            //  put the nodes of the first layer
            for (int j = 0; j < price[0].length; j++) {
                  int[] data = new int[]{0, j, price[0][j], ap[0][j]}; // i , j , price , ap
                  toDoList.add(data);
            }
            while (toDoList.isEmpty() == false) {
                  // First in last out ==> get last one
                  int[] node = toDoList.remove(toDoList.size() - 1);

                  // to next layer
                  int layer = node[0];
                  //int iOfLayer = node[1];
                  int myPrice = node[2];
                  int myAp = node[3];
                  if (layer == r - 1) { // last layer
                        if (myPrice <= maxTotal) {
                              if (myAp > maxAp) {
                                    maxAp = myAp;
                              }
                        }
                        continue;
                  }

                  layer++;
                  for (int j = 0; j < price[layer].length; j++) {
                        int[] data = new int[]{layer, j, price[layer][j] + myPrice, ap[layer][j] + myAp}; // i , j , price , ap
                        if (data[2] <= maxTotal) {
                              toDoList.add(data);
                        }

                  }
            }

            System.out.println(maxAp);

      }

}
