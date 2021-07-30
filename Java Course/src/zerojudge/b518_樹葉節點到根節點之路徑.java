package zerojudge;

import java.util.ArrayList;
import java.util.Scanner;

class b518_樹葉節點到根節點之路徑商競 {

      /*
3
7
0,99
1,3
2,3
3,5
4,6
5,0
6,5
4
0,99
1,0
2,0
3,0
1
0,99
========
1:{3,5}
2:{3,5}
4:{6,5}

1:N
2:N
3:N

0:N
       */
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {

                  // 每一題
                  int m = sc.nextInt();
                  int[] myParent = new int[m];
                  boolean[] isParent = new boolean[m];

                  sc.nextLine();
                  for (int j = 0; j < m; j++) {
                        String s = sc.nextLine();
                        String[] nums = s.split(",");
                        int child = Integer.parseInt(nums[0]);
                        int parent = Integer.parseInt(nums[1]);

                        myParent[child] = parent;
                        if (parent < m) {
                              isParent[parent] = true;
                        }
                  }

                  // 找最下面的孫子
                  for (int j = 0; j < isParent.length; j++) {
                        if (isParent[j] == false) {
                              // 這就是最下面的孫子
                              //System.out.println("leaf node:" + j);

                              // 一層一層往上找父親
                              ArrayList<Integer> ans = new ArrayList<Integer>();
                              System.out.print(j + ":");
                              findParent(myParent, j, ans);
                        }
                  }
                  System.out.println("");

            }

      }

      // 工廠， findParent
      static void findParent(int[] myParent, int node, ArrayList<Integer> result) {
            result.add(node);

            int p = myParent[node];
            if (p == 99) { // node is root
                  printAList(result);
            } else {
                  // findParent                            
                  findParent(myParent, p, result);
            }

      }

      static void printAList(ArrayList<Integer> data) {

            // {,3,6,2,1,9}
            if (data.size() <= 2) {
                  System.out.println("N");
            } else {

                  // 刪掉頭尾
                  data.remove(0); // 刪掉頭
                  // 刪掉尾巴
                  data.remove(data.size() - 1);

                  String r = "";
                  for (int i = 0; i < data.size(); i++) {

                        if (i == 0) {
                              // 第一個
                              r = r + data.get(i);
                        } else {
                              // 其他的
                              r = r + "," + data.get(i);
                        }
                  }

                  System.out.println("{" + r + "}");
            }

      }

}
