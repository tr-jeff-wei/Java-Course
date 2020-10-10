package apcs.tw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author chuan
 */
class J10806_P3_e288_CP {

      static long wholeGroup;

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
            int nchars = Integer.parseInt(tokens[0]);
            int n = Integer.parseInt(tokens[1]);
            wholeGroup = (long) Math.pow(2, nchars) - 1;

            ArrayList<Long> mySet = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                  String s = buf.readLine().trim();
                  long seqTag = 0l;
                  //System.out.println("====" + s);
                  for (int si = 0; si < s.length(); si++) {
                        char c = s.charAt(si);
                        int ci = charToCode(c);
                        long pi = 1l << ci;
                        ////System.out.println(c + " -->" + ci);
                        seqTag = seqTag | pi;
                        //System.out.println(Long.toBinaryString(seqTag));
                  }
                  mySet.add(seqTag);                
            }
            buf.close();

            Collections.sort(mySet);

            
            int pc = count(mySet);
            System.out.println(pc);

      }

      public static int count(ArrayList<Long> mySet) {
            
            // 使用 ai , bi 從前後夾擊
            
            int ai = 0;
            int bi = mySet.size() - 1;

            int pairCount = 0;

            while (ai < bi) {
                  long a = mySet.get(ai);
                  long b = wholeGroup - a;

                  while (mySet.get(bi) > b) {
                        bi--;
                        if (bi <= ai) {
                              return pairCount;
                        }
                  }

                  if (mySet.get(bi) == b) {

                        int ac = 0;
                        while (mySet.get(ai) == a) {
                              ai++;
                              ac++;
                        }

                        int bc = 0;
                        while (mySet.get(bi) == b) {
                              bi--;
                              bc++;
                        }
                        pairCount += ac * bc;
                  } else {
                        while (mySet.get(ai) == a) {
                              ai++;
                        }
                  }
            }
            return pairCount;
      }

      public static int charToCode(char c) {
            // A B C ... Z    a     b   ... 
            // 0  1 2 ...25  26   27 ...
            if (c > 'Z') {
                  return c - 'a' + 26;
            } else {
                  return c - 'A';
            }
      }

}
