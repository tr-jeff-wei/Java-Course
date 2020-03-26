package apcs.history;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author chuan
 */
public class J10706_P1_特殊編碼_1 {

      public static void main(String[] args) throws IOException {

            String data = "1\n"
                    + "0 1 0 1\n"
                    + "1\n"
                    + "0 0 1 0\n"
                    + "2\n"
                    + "1 0 0 0\n"
                    + "1 1 0 0\n"
                    + "4\n"
                    + "1 1 0 1\n"
                    + "1 0 0 0\n"
                    + "0 1 1 1\n"
                    + "1 1 0 1";
            InputStream is = new ByteArrayInputStream(data.getBytes());
            System.setIn(is);
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder result = new StringBuilder();

            while (true) {
                  String lineDigit = buf.readLine();
                  if (lineDigit == null) {
                        break;
                  }
                  int n = Integer.parseInt(lineDigit);

                  for (int i = 0; i < n; i++) {

                        String s = buf.readLine();
                        if (s.charAt(0) == '0'
                                && s.charAt(2) == '1'
                                && s.charAt(4) == '0'
                                && s.charAt(6) == '1') {
                              result.append("A");
                        } else if (s.charAt(0) == '0'
                                && s.charAt(2) == '1'
                                && s.charAt(4) == '1'
                                && s.charAt(6) == '1') {
                              result.append("B");

                        } else if (s.charAt(0) == '0'
                                && s.charAt(2) == '0'
                                && s.charAt(4) == '1'
                                && s.charAt(6) == '0') {
                              result.append("C");

                        } else if (s.charAt(0) == '1'
                                && s.charAt(2) == '1'
                                && s.charAt(4) == '0'
                                && s.charAt(6) == '1') {
                              result.append("D");
                        } else if (s.charAt(0) == '1'
                                && s.charAt(2) == '0'
                                && s.charAt(4) == '0'
                                && s.charAt(6) == '0') {
                              result.append("E");
                        } else if (s.charAt(0) == '1'
                                && s.charAt(2) == '1'
                                && s.charAt(4) == '0'
                                && s.charAt(6) == '0') {
                              result.append("F");
                        }

                  }
                  result.append("\n");

            }
            System.out.print(result);

      }
}
