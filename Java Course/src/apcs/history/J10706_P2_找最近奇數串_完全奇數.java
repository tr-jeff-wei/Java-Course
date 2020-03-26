package apcs.history;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chuan
 */
public class J10706_P2_找最近奇數串_完全奇數 {

      private static char zero = '0';

      public static void main(String[] args) throws IOException {

//            String data = "135\n"
//                    + "13256\n"
//                    + "35001\n"
//                    + "1001\n";
//
//            System.setIn(new ByteArrayInputStream(data.getBytes()));



            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

            int[] original = new int[20];
            int[] large = new int[20];
            int[] less = new int[20];
            int size = 0;
            int firstEven = -1;
            
            while (true) {
                  int a = buf.read();
                  if (a == '\n') { //end of line
                        findAnswer(original, large, less, firstEven, size);
                        // reset
                        original = new int[20];
                        large = new int[20];
                        less = new int[20];
                        firstEven = -1;
                        size = 0;
                        continue;
                  } else if (a == -1) { // end of file
                        findAnswer(original, large, less, firstEven, size);
                        break;
                  }

                  int n = toInt((char) a);
                  original[size] = n;
                  large[size] = n;
                  less[size] = n;

                  if (firstEven != -1) {
                        large[size] = 1;
                        less[size] = 9;
                  } else {

                        if (n % 2 == 0) {
                              large[size]++; // 往上加1
                              less[size]--; // 往下減1
                              firstEven = size;

                              if (less[size] < 0) {// 往下減要考慮，往前借位
                                    for (int i = size; i >= 0; i--) {
                                          if (less[i] < 0) {
                                                if (i == 0) {
                                                      // 已經是首位
                                                      less[i] = 0;
                                                      break;
                                                } else {
                                                      // 非首位，往前借
                                                      less[i] = 9;
                                                      less[i - 1] -= 2;
                                                }
                                          } else {
                                                break;
                                          }
                                    }
                              }
                        }
                  }
                  size++;

            }
      }

      // char to int
      public static int toInt(char n) {
            return n - zero;
      }

      public static void findAnswer(int[] ori, int[] large, int[] less, int startIdx, int size) {
//
//            System.out.println("=====================");
//            for (int i = 0; i < size; i++) {
//                  System.out.print(ori[i]);
//            }
//            System.out.println("");
//            for (int i = 0; i < size; i++) {
//                  System.out.print(large[i]);
//            }
//            System.out.println("");
//            for (int i = 0; i < size; i++) {
//                  System.out.print(less[i]);
//            }
//            System.out.println("");
//            System.out.println("==========================");

            if (startIdx == -1) {
                  System.out.println(0);
                  return;
            }

            long diff1 = 0;
            long diff2 = 0;

            for (int i = 0; i < size; i++) {
//                  System.out.println(diff1 + " x10   +   " + large[i] + " - " + ori[i]);
                  diff1 = diff1 * 10 + (large[i] - ori[i]);
//                  System.out.println(diff2 + " x10   +   " + ori[i] + " - " + less[i]);
                  diff2 = diff2 * 10 + (ori[i] - less[i]);
//                  System.out.println("d1 : " + diff1 + "          d2 : " + diff2);
            }
            System.out.println(Math.min(diff1, diff2));

      }

}
