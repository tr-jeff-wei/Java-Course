/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class a017_五則運算_2 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                  String s = sc.nextLine();
                  if( s.isEmpty()){
                        break ;
                  }
                  int result = DFS(s, 0, s.length());
                  System.out.println(result);
            }
      }

      static int DFS(String s, int le, int ri) {
            int c = 0;
            for (int i = ri - 1; i >= le; --i) {
                  //System.out.println(s.charAt(i));
                  if (s.charAt(i) == ')') {
                        ++c;
                  }
                  if (s.charAt(i) == '(') {
                        --c;
                  }
                  if (s.charAt(i) == '+' && c == 0) {
                        return DFS(s, le, i) + DFS(s, i + 1, ri);
                  }
                  if (s.charAt(i) == '-' && c == 0) {
                        return DFS(s, le, i) - DFS(s, i + 1, ri);
                  }
            }
            for (int i = ri - 1; i >= le; --i) {
                  if (s.charAt(i) == ')') {
                        ++c;
                  }
                  if (s.charAt(i) == '(') {
                        --c;
                  }
                  if (s.charAt(i) == '*' && c == 0) {
                        return DFS(s, le, i) * DFS(s, i + 1, ri);
                  }
                  if (s.charAt(i) == '/' && c == 0) {
                        return DFS(s, le, i) / DFS(s, i + 1, ri);
                  }
                  if (s.charAt(i) == '%' && c == 0) {
                        return DFS(s, le, i) % DFS(s, i + 1, ri);
                  }
            }
            if ((s.charAt(le) == '(') && (s.charAt(ri - 1) == ')')) {
                  return DFS(s, le + 1, ri - 1);
            }
            if (s.charAt(le) == ' ' && s.charAt(ri - 1) == ' ') {
                  return DFS(s, le + 1, ri - 1);
            }
            if (s.charAt(le) == ' ') {
                  return DFS(s, le + 1, ri);
            }
            if (s.charAt(ri - 1) == ' ') {
                  return DFS(s, le, ri - 1);
            }
            int n = 0;
            if (isdigit(s.charAt(le)) && isdigit(s.charAt(ri - 1))) {
                  for (int i = le; i < ri; ++i) {
                        n = n * 10 + s.charAt(i) - '0';
                  }
                  return n;
            }
            return 0;
      }

      static boolean isdigit(char d) {
            return d >= '0' && d <= '9';
      }
}
