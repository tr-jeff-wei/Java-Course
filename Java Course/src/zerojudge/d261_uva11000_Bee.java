package zerojudge;

import java.util.Scanner;

public class d261_uva11000_Bee {

      static final int MALE = 0;
      static final int FEMALE = 1;
      static final int SFEMALE = 2;

      static long[][][] m = null;

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            while (true) {
                  int n = sc.nextInt();
                  if (n == -1) {
                        break;
                  }
                  m = new long[3][100][2];
                  long[] r = nextGen(SFEMALE, 0, n);
                  System.out.println(r[0] + " " + (r[0] + r[1]));
            }

      }

      static long[] nextGen(int gender, int generation, int target) {
            long[] data = new long[2];

            if (m[gender][generation][0] > 0 || m[gender][generation][1] > 0) {
                  return m[gender][generation];
            }

            if (generation == target) {
                  if (gender == MALE) {
                        data[MALE] = 1;
                  } else {
                        data[FEMALE] = 1;
                  }
                  return data;
            }

            if (gender == MALE) {
                  add(data, nextGen(MALE, generation + 1, target));
                  add(data, nextGen(FEMALE, generation + 1, target));
            } else if (gender == FEMALE) {
                  add(data, nextGen(MALE, generation + 1, target));
            } else if (gender == SFEMALE) {
                  add(data, nextGen(MALE, generation + 1, target));
                  add(data, nextGen(SFEMALE, generation + 1, target));
            }

            m[gender][generation] = data;
            return data;

      }

      static void add(long[] ori, long[] add) {

            ori[MALE] += add[MALE];
            ori[FEMALE] += add[FEMALE];
      }
}
