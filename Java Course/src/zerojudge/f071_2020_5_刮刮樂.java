package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class f071_2020_5_刮刮樂 {

   /**
       *   
       *
       *  
       */

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int[] myNumber = new int[3];
            for (int i = 0; i < myNumber.length; i++) {
                  myNumber[i] = sc.nextInt();
            }

            int[] lottery_num = new int[5];
            int[] lottery_money = new int[101];
            for (int i = 0; i < lottery_num.length; i++) {
                  lottery_num[i] = sc.nextInt();
            }
            
            // *** 這一題中獎數字可以相同，就會發生連續加，與連續扣的情形
            //       所以這裡對應陣列，要用累加的方式!!!!
            for (int i = 0; i < lottery_num.length; i++) {
                  lottery_money[lottery_num[i]] += sc.nextInt();
            }

            int total = 0;
            if (lottery_money[myNumber[0]] > 0) {
                  total += lottery_money[myNumber[0]];

            }
            if (lottery_money[myNumber[1]] > 0) {
                  total += lottery_money[myNumber[1]];
            }

            if (lottery_money[myNumber[2]] == 0) {
                  // double
                  total = total * 2;
            } else {
                  total -= lottery_money[myNumber[2]];
                  if (total < 0) {
                        total = 0;
                  }
            }

            System.out.println(total);

      }

}
