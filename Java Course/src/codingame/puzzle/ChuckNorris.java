package codingame.puzzle;

import java.util.*;

// 
// 將 char 轉 int --> 轉 binary code
//
class Solution {

      public static void main(String args[]) {

            Scanner in = new Scanner(System.in);
            String msg = in.nextLine();

            ArrayList<Integer> tList = new ArrayList<>();
            for (int i = 0; i < msg.length(); i++) {
                  char a = msg.charAt(i);
                  tList.addAll(getBinaryList(a));
            }
            encode(tList, false);
      }

      static ArrayList<Integer> getBinaryList(char cc) {
            int c = (int) cc;
            ArrayList<Integer> list = new ArrayList<>();
            while (true) {
                  int k = c % 2;
                  list.add(0, k);
                  if (c < 2) {
                        break;
                  }
                  c = c / 2;
            }
            while( list.size()<7){
                  list.add(0,0) ;
            }
            
            return list;
      }

      static void encode(ArrayList<Integer> list, boolean hasNext) {

            int lastI = list.get(0);
            int nc = 1;
            for (int i = 1; i < list.size(); i++) {
                  int k = list.get(i);
                  if (k != lastI) {
                        showResult(lastI, nc, true);
                        nc = 1;
                  } else {
                        nc++;
                  }
                  lastI = k;
            }
            // last one

            showResult(lastI, nc, hasNext);
      }

      static void showResult(int i, int n, boolean hasNext) {
            if (i == 0) {
                  System.out.print("00 ");
            } else {
                  System.out.print("0 ");
            }
            for (int j = 0; j < n; j++) {
                  System.out.print("0");
            }
            if (hasNext) {
                  System.out.print(" ");
            }
            System.err.println(">> " + i + " " + n);
      }
}
