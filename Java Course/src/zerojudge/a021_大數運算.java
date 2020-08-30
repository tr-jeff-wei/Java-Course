package zerojudge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class a021_大數運算 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String s1 = sc.next();
            String op = sc.next();;
            String s2 = sc.next();

            switch (op) {
                  case "+":
                        add(s1, s2);
                        break;
                  case "-":
                        minus(s1, s2, true);
                        break;
                  case "*":
                        multiply(s1, s2);
                        break;
                  case "/":
                        div(s1, s2);
                        break;
            }

      }

      static void add(String s1, String s2) {
            String s = "";

            int max = Math.max(s1.length(), s2.length());
            int parentDigit = 0;

            for (int i = 0; i < max; i++) {
                  int n1 = 0;
                  int n2 = 0;
                  if (i < s1.length()) {
                        n1 = s1.charAt(s1.length() - 1 - i) - '0';
                        //System.out.println("s1 --> " + n1 + "   " + i);
                  }
                  if (i < s2.length()) {
                        n2 = s2.charAt(s2.length() - 1 - i) - '0';
                        //System.out.println("s2 --> " + n2 + "    " + i);
                  }
                  int result = n1 + n2 + parentDigit;

                  if (result >= 10) {
                        parentDigit = result / 10;
                        result %= 10;
                  } else {
                        parentDigit = 0;
                  }
                  s = result + s;
            }
            if (parentDigit > 0) {
                  s = parentDigit + s;
            }
            System.out.println(s);
      }

      static String minus(String s1, String s2, boolean sout) {

            boolean neg = false;
            if (s2.length() > s1.length()) {
                  String t = s1;
                  s1 = s2;
                  s2 = t;
                  neg = true;
            } else if (s1.equals(s2)) {
                  if (sout) {
                        System.out.println(0);
                  }
                  return "0";
            }

            String s = "";

            int max = Math.max(s1.length(), s2.length());
            int parentDigit = 0;

            for (int i = 0; i < max; i++) {
                  int n1 = 0;
                  int n2 = 0;
                  if (i < s1.length()) {
                        n1 = s1.charAt(s1.length() - 1 - i) - '0';
                        //System.out.println("s1 --> " + n1 + "   " + i);
                  }
                  if (i < s2.length()) {
                        n2 = s2.charAt(s2.length() - 1 - i) - '0';
                        //System.out.println("s2 --> " + n2 + "    " + i);
                  }
                  int result = n1 - n2 + parentDigit;

                  if (result >= 0) {
                        parentDigit = 0;
                  } else {
                        result += 10;
                        parentDigit = -1;
                  }
                  s = result + s;
            }

            // remove head zero
            int i = 0;
            while (i < s.length() && s.charAt(i) == '0') {
                  i++;
            }
            s = s.substring(i);

            // add negative sign
            if (neg || parentDigit == -1) {
                  s = "-" + s;
            }
            if (sout) {
                  System.out.println(s);
            }
            return s;
      }

      static void div(String s1, String s2) {

            if (s1.length() < s2.length()) {
                  System.out.println(0);
                  return;
            }

            String s = "";

            while (isLargeEqual(s1, s2)) {
                  int L = 0;
                  int E = L + s2.length();

                  String cand = s1.substring(L, E);
                  if (s2.compareTo(cand) > 0) {
                        E++;
                        cand = s1.substring(L, E);
                        s += "0";
                  }

                  int n = 0;
                  //System.out.println(cand + "==>");
                  while (isLargeEqual(cand, s2)) {
                        n++;
                        cand = minus(cand, s2, false);
                  }
                  s += n;
                  s1 = cand + s1.substring(E);

//                  System.out.println(s1);
            }

            System.out.println(s);
      }

      static void multiply(String s1, String s2) {

            ArrayList<Long> result = new ArrayList<>();
            int digitIdx = 0;
            for (int i = s1.length() - 1, k = 0; i >= 0; i--, k++) {
                  digitIdx = k;
                  long n1 = s1.charAt(i) - '0';
                  long tmp = 0;
                  for (int j = s2.length() - 1; j >= 0; j--) {
                        int n2 = s2.charAt(j) - '0';
                        long s = n1 * n2 + tmp;
                        long s0 = s % 10;
                        if (digitIdx < result.size()) {
                              result.set(digitIdx, result.get(digitIdx) + s0);
                        } else {
                              result.add(s0);
                        }

                        tmp = s / 10;
                        digitIdx++;
                  }
                  if (tmp > 0) {

                        if (digitIdx < result.size()) {
                              result.set(digitIdx, result.get(digitIdx) + tmp);
                        } else {
                              result.add(tmp);
                        }
                  }
                  //System.out.println(result);
            }

            String sb = "";
            long tmp = 0;
            for (Long n : result) {
                  long s = n + tmp;
                  sb = (s % 10) + sb;
                  tmp = s / 10;
            }
            if (tmp > 0) {
                  sb = tmp + sb;
            }

            System.out.println(sb);

      }

      static boolean isLargeEqual(String s1, String s2) {
            return s1.length() > s2.length() || s1.length() == s2.length() && s1.compareTo(s2) >= 0;
      }
}
