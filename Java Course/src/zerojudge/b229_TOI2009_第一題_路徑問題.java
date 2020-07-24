package zerojudge;

import java.math.BigInteger;
import java.util.Scanner;

public class b229_TOI2009_第一題_路徑問題 {

      static int Up = 0;
      static int Left = 1;
      static int Right = 2;

      static long total = 0;

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int nSteps = sc.nextInt();
            //next(n, 0, Up);
            //            System.out.println(total);
            next(nSteps);
      }

      // recursive version
      public static void next(int targetSteps, int oriSteps, int fromDirection) {
            if (targetSteps == oriSteps) {
                  total++;
                  return;
            }
            if (fromDirection == Up) {
                  next(targetSteps, oriSteps + 1, Up);
                  next(targetSteps, oriSteps + 1, Right);
                  next(targetSteps, oriSteps + 1, Left);
            } else if (fromDirection == Right) {
                  next(targetSteps, oriSteps + 1, Up);
                  next(targetSteps, oriSteps + 1, Right);
            } else if (fromDirection == Left) {
                  next(targetSteps, oriSteps + 1, Up);
                  next(targetSteps, oriSteps + 1, Left);
            }
      }

      // variable iteration
      public static void next(int steps) {
            long n = 1; // up node
            long m = 0; // left , right node
            BigInteger bn = null;
            BigInteger bm = null;

            for (int i = 0; i < steps; i++) {
                  if (bn == null) {
                        long n2 = n + m;
                        long m2 = 2 * n + m;
                        n = n2;
                        m = m2;

                        if (n > 1000000000000000000l || m > 1000000000000000000l) {
                              bn = BigInteger.valueOf(n);
                              bm = BigInteger.valueOf(m);
                        }
                  } else {
                        BigInteger bn2 = bn.add(bm);
                        BigInteger bm2 = bn.add(bn).add(bm);
                        bn = bn2;
                        bm = bm2;
                  }

                  //System.out.println(n+m);
            }
            
            if( bn==null){
                  System.out.println(n+m);
            }else{
                  System.out.println(bn.add(bm).toString(10));                  
            }
      }
}
