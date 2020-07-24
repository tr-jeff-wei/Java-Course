
import java.util.Scanner;

public class CodeforcesRound_648_C {

      public static void main(String[] args) {
//            String data = "5\n"
//                    + "1 2 3 4 5\n"
//                    + "2 3 4 5 1\n";
//
//            InputStream is = new ByteArrayInputStream(data.getBytes());
//            System.setIn(is);
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] aIdx = new int[n + 2];
            int[] count = new int[n + 2];
            int maxCount = 0;

            for (int i = 0; i < n; i++) {
                  aIdx[sc.nextInt()] = i;
            }
            for (int i = 0; i < n; i++) {
                  int b = sc.nextInt();
                  int diff;
                  if (aIdx[b] >= i) {
                        diff = aIdx[b] - i;
                  } else {
                        diff = n + aIdx[b] - i;
                  }
                  count[diff]++;
                  if (count[diff] > maxCount) {
                        maxCount = count[diff];
                  }
            }
            System.out.println(maxCount);

      }
}
