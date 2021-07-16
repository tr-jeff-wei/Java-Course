package zerojudge;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class a017_五則運算_2 {
      public static void main(String[] args) {

//        String test = "3 * ( 2 + 1 )" ;
//        test="2 * ( 3 + 4 ) * 5";
////        test="2 + 3 * 4" ;
//        InputStream is =new ByteArrayInputStream(test.getBytes());
//        System.setIn(is);


            Scanner sc = new Scanner(System.in) ;
            while (sc.hasNextLine()){
                  String eq = sc.nextLine() ;
                  String[] tks= eq.trim().split(" ") ;
                  int ans = solEquation(tks,0,tks.length) ;
                  System.out.println(ans);
            }




      }

      static int solEquation(String[] s , int start , int end ){

            // 找區段中，+-先拉出，不含 ()
            int check = 0;
            for (int i = end - 1; i >= start; i--) {
                  //System.out.println(s.charAt(i));
                  if (s[i].equals( ")")) {
                        check++;
                  }
                  if (s[i].equals( "(")) {
                        check--;
                  }
                  if (s[i].equals( "+") && check == 0) {
                        return solEquation(s, start, i) + solEquation(s, i + 1, end);
                  }
                  if (s[i].equals( "-") && check == 0) {
                        return solEquation(s, start, i) - solEquation(s, i + 1, end);
                  }
            }

            // 找區段中，*/% 拉出，不含 ()
            check=0;
            for (int i = end - 1; i >= start; i--) {
                  if (s[i].equals( ")")) {
                        check++;
                  }
                  if (s[i].equals( "(")) {
                        check--;
                  }
                  if (s[i].equals( "*" )&& check == 0) {
                        return solEquation(s, start, i) * solEquation(s, i + 1, end);
                  }
                  if (s[i].equals( "/") && check == 0) {
                        return solEquation(s, start, i) / solEquation(s, i + 1, end);
                  }
                  if (s[i].equals( "%" )&& check == 0) {
                        return solEquation(s, start, i) % solEquation(s, i + 1, end);
                  }
            }

            // 區段是 ()
            if (s[start].equals("(") && s[end - 1].equals(")") ){
                  return solEquation(s, start + 1, end - 1);
            }

            // 區段是數字
            return Integer.parseInt(s[start]) ;

      }
}
