package zerojudge;

import java.util.Scanner;

/**
 *
 * @author Chun Fong
 */
public class b525_先別管這個了你聽過turtlebee嗎 {

      static final long C = 100000007l;

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                  int m = sc.nextInt();
                  int f = sc.nextInt();
                  int days = sc.nextInt();
                  afterNDays(m, f, days);
            }
      }

      static void afterNDays(int m, int f, int days) {

            // 1 day
            long[][] start = new long[][]{{1, 0}, {0, 1}};
            start = iteration(start);
            days--;

            // set initial
            long[][] result = new long[][]{{start[0][0], start[0][1]}, {start[1][0], start[1][1]}};
            long[][] transform = new long[][]{{start[0][0], start[0][1]}, {start[1][0], start[1][1]}};
            while (days > 0) {

                  if (days % 2 == 1) {
                        result = jump(result[0], result[1], transform[0], transform[1]);
                        days--;
                  }

                  // double transform
                  transform = jump(transform[0], transform[1], transform[0], transform[1]);
                  days /= 2;
            }

            long rm = result[0][0] * m + result[0][1] * f;

            long rf = result[1][0] * m + result[1][1] * f;

            System.out.println((rm + rf) % C);
      }

      //////////////////////////////////////////////// FOR TEST
      static void testIteration() {
            long[][] start = new long[][]{{1, 0}, {0, 1}};
            start = iteration(start);

            System.out.println("");
            for (int i = 0; i < 10; i++) {
                  start = iteration(start);
                  showFunction(start[0], start[1]);
                  System.out.println("");
            }
      }

      static long[][] iteration(long[][] malefemal) {
            long[] tmpMale = malefemal[1];
            long[] tmpFemale = {malefemal[0][0] + malefemal[1][0], malefemal[0][1] + malefemal[1][1]};
            return new long[][]{tmpMale, tmpFemale};
      }

      static long[][] jump(long[] mOri, long[] fOri, long[] mFn, long[] fFn) {

            // male
            long m_cx = mFn[0] * mOri[0] + mFn[1] * fOri[0];
            long m_cy = mFn[0] * mOri[1] + mFn[1] * fOri[1];
            m_cx %= C;
            m_cy %= C;

            // female
            long f_cx = fFn[0] * mOri[0] + fFn[1] * fOri[0];
            long f_cy = fFn[0] * mOri[1] + fFn[1] * fOri[1];
            f_cx %= C;
            f_cy %= C;

            return new long[][]{{m_cx, m_cy}, {f_cx, f_cy}};
      }

      static void showFunction(long[] male, long[] female) {
            System.out.println("M : " + male[0] + " x + " + male[1] + " y");
            System.out.println("F : " + female[0] + " x + " + female[1] + " y");

      }

      public static void testmain(String[] args) {
            long[][] start = new long[][]{{1, 0}, {0, 1}};
            start = iteration(start);

            for (int i = 0; i < 5; i++) {
                  showFunction(start[0], start[1]);
                  jump(start[0], start[1], start[0], start[1]);

            }
      }
}
