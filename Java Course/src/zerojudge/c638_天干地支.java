package zerojudge;

import java.util.Scanner;

public class c638_天干地支 {

      public static void main(String[] args) {

            String[] s1 = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
            String[] s2 = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};

            Scanner sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                  int n = sc.nextInt();
                  n = n - 1924; // 甲子
                  if(n<0){
                        n+=6000;
                  }
                  System.out.println(s1[n % 10] + s2[n % 12]);
            }

      }
}
