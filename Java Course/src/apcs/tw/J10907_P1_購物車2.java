package apcs.tw;

import java.util.Scanner;

class f579_購物車 {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          // 兩個商品 a , b
          int a = sc.nextInt();
          int b = sc.nextInt();
          int cus = sc.nextInt();
          int target =  0 ; // 目標客戶

          for (int i = 0; i < cus; i++) {
               // 每個顧客，都要做的事
               // 統計目標物買多少
               int ac = 0;
               int bc = 0;
               // 開始檢查購物清單
               while (true) {
                    int g = sc.nextInt(); // 買的東西

                    // 判斷有沒有買到目標物
                    if (g == a) {
                         ac = ac + 1;
                    }
                    if (g == -a) {
                         ac = ac - 1;
                    }
                    if (g == b) {
                         bc = bc + 1;
                    }
                    if (g == -b) {
                         bc = bc - 1;
                    }
                    if (g == 0) { // 清單結束
                         break;
                    }
               }
               
               if( ac>0 && bc>0 ) {
                    target = target + 1 ;
               }
          }

          System.out.println(target);

     }
}
