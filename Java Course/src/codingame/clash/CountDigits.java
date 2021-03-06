package codingame.clash;

import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

      public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            long i = in.nextLong();

            int[] d = new int[10];
            String s = "" + i;
            for (int a = 0; a < s.length(); a++) {
                  char c = s.charAt(a);
                  d[c - '0']++;
            }

            for (int j = 0; j < 10; j++) {
                  if (d[j] > 0) {
                        System.out.print(d[j] + "" + j);
                  }
            }

      }
}
