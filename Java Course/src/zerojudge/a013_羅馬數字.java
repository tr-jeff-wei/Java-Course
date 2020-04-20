package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class a013_羅馬數字 {
//      I	1
//V	5
//X	10
//L	50
//C	100
//D	500
//M	1,000

      static int[] rome = new int['Z' + 1];
      static String[] romeSym = new String[]{"I", "V", "X", "L", "C", "D", "M"};

      public static void main(String[] args) {
            rome['I'] = 1;
            rome['V'] = 5;
            rome['X'] = 10;
            rome['L'] = 50;
            rome['C'] = 100;
            rome['D'] = 500;
            rome['M'] = 1000;
            Scanner sc = new Scanner(System.in);
            while (true) {
                  String a = sc.next();
                  if (a.equals("#")) {
                        break;
                  }
                  int an = getNumber(a);
                  String b = sc.next();
                  int bn = getNumber(b);
                  int diff = Math.abs(an - bn);
                  if (diff == 0) {
                        System.out.println("ZERO");
                  } else {
                        String result = "";
                        int pos = 1;
                        while (diff > 0) {
                              int d = diff % 10;
                              result = getRome(d, pos) + result;
                              diff /= 10;
                              pos++;
                        }
                        System.out.println(result);
                  }
                  
                  sc.nextLine();
            }
      }

      public static int getNumber(String d) {
            // 順序顛倒時，要把前一數變成減
            
            
            
            
            int sum = 0;
            
            int tmp = 0 ;
            for (int i = 0; i < d.length(); i++) {
                  char c = d.charAt(i);
                  if( rome[c] <= tmp ){
                        sum+=tmp ;
                  }else{
                        sum-=tmp ;
                  }                  
                  tmp = rome[c] ;                  
            }
            sum+=tmp ; // last one
            
            return sum;
      }

      /**
       *
       * @param digit 數 0~9
       * @param size 有幾位
       * @return
       */
      public static String getRome(int digit, int size) {

            String s1 = "", s5 = "", s10 = "";

            if (size < 4) {
                  s1 = romeSym[(size - 1) * 2];
                  s5 = romeSym[(size - 1) * 2 + 1];
                  s10 = romeSym[(size - 1) * 2 + 2];
            } else if (size == 4) {
                  s1 = romeSym[(size - 1) * 2];
            }

            String result = "";
            switch (digit) {
                  case 1:
                  case 2:
                  case 3:
                        for (int i = 0; i < digit; i++) {
                              result += s1;
                        }
                        break;
                  case 4:
                        result = s1 +s5;
                        break;
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                        result = s5;
                        for (int i = 6; i <= digit; i++) {
                              result += s1;
                        }
                        break;
                  case 9:
                        result = s1 + s10;
                        break;
            }

            return result;
      }
}
