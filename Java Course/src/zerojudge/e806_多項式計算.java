package zerojudge;

import java.util.Scanner;

public class e806_多項式計算 {

      public static void main(String[] args) {
            int[] eq1 = new int[1001];
            int[] eq2 = new int[1001];

            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            for (int i = 0; i < n1; i++) {
                  int p = sc.nextInt(); // 次方
                  int c = sc.nextInt(); // 係數
                  // p,c 如何放進 eq1?
                  eq1[p] = c;
            }

            int n2 = sc.nextInt();
            for (int i = 0; i < n2; i++) {
                  int p = sc.nextInt(); // 次方
                  int c = sc.nextInt(); // 係數
                  // p,c 如何放進 eq2?
                  eq2[p] = c;
            }

            // 把 eq1 , eq2 相加 ==> 放到 eq1
            for (int i = 0; i < eq1.length; i++) {
                  eq1[i] = eq1[i] + eq2[i];
            }

            // 印出答案，高次方 --> 低次方。 次方:係數
            boolean hasAns = false ;
            for (int i = eq1.length - 1; i >= 0; i--) { 
                  if (eq1[i] != 0) { // 有係數（!=0）才印出
                        System.out.println(i + ":" + eq1[i]);
                        hasAns = true ;
                  }
            }
            if( hasAns == false ){ // 從頭到尾都沒有答案
                  System.out.println("NULL!");
            }

      }
}
