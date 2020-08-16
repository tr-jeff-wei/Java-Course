package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class a020_身分證檢驗 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            int citycode = getCityCode(id.charAt(0));
            int code = 9 * (citycode % 10) + (citycode / 10);

            for (int i = 1; i <= 8; i++) {
                  int d = id.charAt(i) - '0';
                  code = code + d * (9 - i);
            }
            code += (id.charAt(9) - '0');

            if (code % 10 == 0) {
                  System.out.println("real");
            } else {
                  System.out.println("fake");

            }

      }

      public static int getCityCode(char c) {
//            A=10 台北市     J=18 新竹縣     S=26 高雄縣
//      B=11 台中市     K=19 苗栗縣     T=27 屏東縣
//      C=12 基隆市     L=20 台中縣     U=28 花蓮縣
//      D=13 台南市     M=21 南投縣     V=29 台東縣
//      E=14 高雄市     N=22 彰化縣     W=32 金門縣
//      F=15 台北縣     O=35 新竹市     X=30 澎湖縣
//      G=16 宜蘭縣     P=23 雲林縣     Y=31 陽明山
//      H=17 桃園縣     Q=24 嘉義縣     Z=33 連江縣
//      I=34 嘉義市     R=25 台南縣

            if (c <= 'H') {
                  return c - 'A' + 10;
            } else if (c == 'I') {
                  return 34;
            } else if (c <= 'N') {
                  return c - 'J' + 18;
            } else if (c == 'O') {
                  return 35;
            } else if (c <= 'V') {
                  return c - 'P' + 23;
            } else if (c == 'W') {
                  return 32;
            } else if (c == 'Y') {
                  return c - 'X' + 30;
            } else {
                  return 33;// Z
            }
      }

      public static void main1(String[] args) {
            for (int i = 0; i < 26; i++) {
                  char k = (char) ('A' + i);
                  System.out.println(k + "  " + getCityCode(k));

            }
      }
}
