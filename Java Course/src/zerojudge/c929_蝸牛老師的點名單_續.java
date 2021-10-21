package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class c929_蝸牛老師的點名單_續 {

      public static void main(String[] args) {
            // 建立掃描器
            Scanner sc = new Scanner(System.in);
            // 讀取一行文字  ex. and  ,
            String line1 = sc.nextLine();
            // 讀取一行文字  ex. appleandbanana
            String line2 = sc.nextLine();

            String[] xs = line2.split(line1);
            // 用 for 把 xs 每個東西印出來
            
          
            for ( int i=0 ; i < xs.length ; i++ ) {
                  System.out.println(xs[ i ]);
            }

      }

}
