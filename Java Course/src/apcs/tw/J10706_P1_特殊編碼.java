package apcs.tw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chuan
 */
public class J10706_P1_特殊編碼 {

      public static void main(String[] args) throws IOException {

//            String data = "1\n"
//                    + "0 1 0 1\n"
//                    + "1\n"
//                    + "0 0 1 0\n"
//                    + "2\n"
//                    + "1 0 0 0\n"
//                    + "1 1 0 0\n"
//                    + "4\n"
//                    + "1 1 0 1\n"
//                    + "1 0 0 0\n"
//                    + "0 1 1 1\n"
//                    + "1 1 0 1";
//            InputStream is = new ByteArrayInputStream(data.getBytes());
//            System.setIn(is);
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder result = new StringBuilder();
            
            while (true) {
                  String lineDigit = buf.readLine();
                  if (lineDigit == null) {
                        break;
                  }
                  int n = Integer.parseInt(lineDigit);

                  for (int i = 0; i < n; i++) {                        
                        switch (buf.readLine()) {
                              case "0 1 0 1":
                                    result.append("A");
                                    break;
                              case "0 1 1 1":
                                    result.append("B");
                                    break;
                              case "0 0 1 0":
                                    result.append("C");
                                    break;
                              case "1 1 0 1":
                                    result.append("D");
                                    break;
                              case "1 0 0 0":
                                    result.append("E");
                                    break;
                              case "1 1 0 0":
                                    result.append("F");
                                    break;
                        }
                       
                        if (result.length() > 5000) {
                              System.out.print(result);
                              result = new StringBuilder();
                        }

                  }
                  result.append("\n");

            }
            System.out.print(result);
      }
}
