package zerojudge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class a017_五則運算_1 {

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
                  sc.close();
            }
      }
      
      static int calculate( List<String> tks , int idx ){
            
            int a =0;
            // 數字  x/%
            
            // 數字  +-  後面要下一層
            
            // (  ==> 直接下一層
            
            if( tks.get(idx).equals("(")){
                  tks.remove(idx) ;
                  a = calculate(tks,idx) ;
            }else{
                  int i =Integer.parseInt(tks.get(idx) ) ;
                  String op = tks.remove(idx );
                  
            }
            
      }

      static void op(List<String> tks, String operator, int idx) {
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
