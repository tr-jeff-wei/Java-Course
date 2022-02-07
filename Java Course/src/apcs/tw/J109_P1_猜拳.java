
package apcs.tw;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J109_P1_猜拳 {

      // （0指石頭，2指剪刀，5指布）
      static int pss(int a, int b) {
            // 平手 ==> 0
            if (a == b) {
                  return 0;
            }

            // a win ==> 1
            if (a == 0 && b == 2) {
                  return 1;
            }
            if (a == 2 && b == 5) {
                  return 1;
            }
            if (a == 5 && b == 0) {
                  return 1;
            }

            return -1;
            // a lose ==> -1
      }

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int b1 = sc.nextInt(); // 哥第一場
            int n = sc.nextInt(); // 最多玩幾場

            int[] b = new int[n];// 哥哥場
            int[] s = new int[n]; // 妹妹場

            // 先放進妹妹的出拳
            for (int i = 0; i < n; i++) {
                  s[i] = sc.nextInt();
            }

            // 放入哥哥的第一場
            b[0] = b1;

            // 判斷第一場的輸贏
            int r1 = pss(b[0], s[0]);
            if (r1 > 0) {
                  // win
                  System.out.println(b[0] + " : Won at round 1");
                  return;
            }
            if (r1 < 0) {
                  // lose
                  System.out.println(b[0] + " : Lost at round 1");
                  return;
            }

            // 往後猜拳
            for (int round = 1; round < n; round++) {
                  // 先決定哥哥這一場的出拳                               

                  // 1. 沒有出兩次相同 or 第二局(round:1) ==> 用妹妹前一局的拳
                  if (round == 1 || s[round - 2] != s[round - 1]) {
                        b[round] = s[round - 1]; // 用妹妹前一局的拳
                  } else {
                        // 2. 妹妹連出兩次相同 ==> 出能擊倒妹妹前一局的拳
                        if (s[round - 1] == 0) { // 石
                              b[round] = 5; // 布
                        } else if (s[round - 1] == 2) { // 剪
                              b[round] = 0; // 石
                        } else { // 布
                              b[round] = 2; // 剪
                        }
                  }

                  // 決定輸贏
                  int result = pss(b[round], s[round]);
                  String bresult = "";
                  for (int i = 0; i <= round; i++) {
                        bresult = bresult + b[i] + " ";
                  }
                  if (result > 0) {
                        // win
                        System.out.println(bresult + ": Won at round " + (round + 1));
                        return;
                  }
                  if (result < 0) {
                        // lose
                        System.out.println(bresult + ": Lost at round " + (round + 1));
                        return;
                  }

            }

            // 能走到這裡一定是平手
            String bresult = "";
            for (int i = 0; i < n; i++) {
                  bresult = bresult + b[i] + " ";
            }
            System.out.println(bresult + ": Drew at round " + n);

      }

}
