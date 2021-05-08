package zerojudge;

import java.util.ArrayList;
import java.util.Scanner;

public class a034_二進位制轉換 {

      public static ArrayList<Long> nList = new ArrayList<>();

      public static void main(String[] args) {
            
            
            Scanner sc = new Scanner(System.in);
            nList.add(1l);
            long last = 1;
            while (sc.hasNextInt()) {
                  int n = sc.nextInt();
                  while (last < n) {
                        last = last * 2;
                        nList.add(last);
                  }
                  showBinary(n);
            }
      }

      public static void showBinary(int n) {
            boolean start = false;
            StringBuilder sb = new StringBuilder();
            for (int i = nList.size() - 1; i >= 0; i--) {
                  if (start == false) {
                        if (nList.get(i) <= n) {
                              sb.append(1);
                              n -= nList.get(i);
                              start = true;
                        }
                  } else {
                        if (nList.get(i) <= n) {
                              sb.append(1);
                              n -= nList.get(i);
                        } else {
                              sb.append(0);
                        }
                  }
            }
            System.out.println(sb);
      }

}
