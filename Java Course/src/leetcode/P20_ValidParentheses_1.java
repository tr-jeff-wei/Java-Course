package leetcode;

import java.util.ArrayList;

public class P20_ValidParentheses_1 {

      static int[] pairs = new int[300];

      public boolean isValid(String s) {
            pairs['{'] = '}';
            pairs['['] = ']';
            pairs['('] = ')';

            int i = 0;
            while (i >= 0) {
                  i = f(s, i);
                  if (i == s.length()) {
                        return true;
                  }
            }
            return false;
      }

      public int f(String s, int i) {
            if (i + 1 >= s.length()) {
                  return -1;
            }

            char c1 = s.charAt(i);
            int t = i + 1;
            while (t<s.length()) {
                  char c2 = s.charAt(t);
                  if (pairs[c1] == c2) {
                        return t + 1;
                  } else {
                        t = f(s, t);
                        if (t < 0) {
                              return -1;
                        }
                  }
            }
            return -1 ;
      }

      public static void main(String[] args) {
            String test = "({}()[])";
            boolean b = new P20_ValidParentheses_1().isValid(test);
            System.out.println(test + " ===> " + b);
            test = "()[]{}";
            b = new P20_ValidParentheses_1().isValid(test);
            System.out.println(test + " ===> " + b);
            test = "([)]";
            b = new P20_ValidParentheses_1().isValid(test);
            System.out.println(test + " ===> " + b);
            test = "{[]}";
            b = new P20_ValidParentheses_1().isValid(test);
            System.out.println(test + " ===> " + b);

      }
}
