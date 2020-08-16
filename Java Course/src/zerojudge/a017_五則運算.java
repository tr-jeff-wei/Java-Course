package zerojudge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class a017_五則運算 {

      static HashSet<String> opsMDR = new HashSet<>();
      static HashSet<String> opsAS = new HashSet<>();

      static {
            opsMDR.add("*");
            opsMDR.add("/");
            opsMDR.add("%");
            opsAS.add("+");
            opsAS.add("-");

      }

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                  String line = sc.nextLine();
                  if (line == null || line.trim().isEmpty()) {
                        break;
                  }
                  String[] tokens = line.split(" ");
                  ArrayList<String> tks = new ArrayList<>();
                  for (String tk : tokens) {
                        tks.add(tk);
                  }
                  while (removeParentheses(tks)) ;
                  while (findOperators(tks , opsMDR));
                  while (findOperators(tks,opsAS));
                  System.out.println(tks.get(0));
            }
            sc.close();
      }

      public static boolean removeParentheses(ArrayList<String> tks) {
            int s = tks.lastIndexOf("(");
            if (s < 0) {
                  return false;
            }
            int e = s + 1;
            while (e < tks.size()) {
                  if (tks.get(e).equals(")")) {
                        break;
                  }
                  e++;
            }
            tks.remove(e);
            List<String> sub = tks.subList(s + 1, e);
            while (findOperators(sub,opsMDR));
            while (findOperators(sub,opsAS));
            tks.remove(s);
            return true;
      }

      // 處理 * / %
      public static boolean findOperators(List<String> tks, HashSet<String> operators) {

            // 找到最左側元素，由左而右計算
            for (int i = 0; i < tks.size(); i++) {
                  String op = tks.get(i);
                  if (operators.contains(op)) {
                        op(tks, op, i);
                        return true;
                  }
            }

            return false;
      }

      // 處理 + -
//      public static boolean opAS(List<String> tks) {
//
//            int op = tks.indexOf("+");
//            if (op > -1) {
//                  op(tks, "+", op);
//                  return true;
//            }
//
//            op = tks.indexOf("-");
//            if (op > -1) {
//                  op(tks, "-", op);
//                  return true;
//            }
//
//            return false;
//      }

      public static void op(List<String> tks, String operator, int idx) {
//            System.out.println(tks);
            int a = Integer.parseInt(tks.get(idx - 1));
            int b = Integer.parseInt(tks.get(idx + 1));
            int result = 0;
            switch (operator) {
                  case "+":
                        result = a + b;
                        break;
                  case "-":
                        result = a - b;
                        break;
                  case "*":
                        result = a * b;
                        break;
                  case "/":
                        result = a / b;
                        break;
                  case "%":
                        result = a % b;
                        break;
            }

            int target = idx - 1;
            tks.remove(target);
            tks.remove(target);
            tks.remove(target);
            tks.add(target, "" + result);
//            System.out.println("===> " + a + operator + b + "  =  " + result);
      }

}
