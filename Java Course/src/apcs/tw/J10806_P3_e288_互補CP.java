package apcs.tw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chuan
 */
public class J10806_P3_e288_互補CP {

        public static void main(String[] args) throws IOException {

//                String  input = "3 4\n"
//                        + "ABzBc\n"
//                        + "cGb\n"
//                        + "bbG\n"
//                        + "zBAz\n";
//                InputStream is = new ByteArrayInputStream(input.getBytes());
//                System.setIn(is);
                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                String[] tokens = buf.readLine().split(" ");
                int m = Integer.parseInt(tokens[0]);
                int n = Integer.parseInt(tokens[1]);
                long wholeGroup = 0l;
                long[] group = new long[n];
                for (int i = 0; i < n; i++) {
                        String s = buf.readLine().trim();
                        long myGroup = 0l;
                        //System.out.println("====" + s);
                        for (int si = 0; si < s.length(); si++) {
                                char c = s.charAt(si);
                                int ci = c - 'A';
                                long pi = 1l << ci;
                                ////System.out.println(c + " -->" + ci);
                                myGroup = myGroup | pi;
                                wholeGroup = wholeGroup | pi;
                                //System.out.println(Long.toBinaryString(myGroup));
                        }
                        group[i] = myGroup;
                        //System.out.println("----");

                }
                //System.out.println("====");
                //System.out.println(Long.toBinaryString(wholeGroup));
                //System.out.println("====");

                int pairCount = 0;
                for (int g1 = 0; g1 < group.length; g1++) {
                        for (int g2 = g1 + 1; g2 < group.length; g2++) {
                                long result = group[g1] ^ group[g2];
                                if (result == wholeGroup) {
                                        //System.out.println("==> g1:" + g1 + "  g2:" + g2);
                                        //System.out.println(Long.toBinaryString(result));
                                        pairCount++;
                                }
                        }
                }

                System.out.println(pairCount);

        }

}
