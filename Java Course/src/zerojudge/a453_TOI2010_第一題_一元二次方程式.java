package zerojudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chuan
 */
public class a453_TOI2010_第一題_一元二次方程式 {

      public static void main(String[] args) throws IOException {

//            String data = "3\n"
//                    + "1 2 1\n"
//                    + "1 2 2\n"
//                    + "2 10 8\n";
//            
//
//            InputStream is = new ByteArrayInputStream(data.getBytes());
//            System.setIn(is);
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            String s = buf.readLine();
            int n = Integer.parseInt(s);
            for (int i = 0; i < n; i++) {
                  String[] tokens = buf.readLine().split(" ");
                  int a = Integer.parseInt(tokens[0]);
                  int b = Integer.parseInt(tokens[1]);
                  int c = Integer.parseInt(tokens[2]);
                  int d = b * b - 4 * a * c;

                  if (d >= 0) {
                        int d2 = (int) Math.sqrt(d);
                        if (d2 * d2 == d) {
                              System.out.println("Yes");
                        }else{
                               System.out.println("No");
                        }

                  } else {
                        System.out.println("No");
                  }
            }

      }

}
