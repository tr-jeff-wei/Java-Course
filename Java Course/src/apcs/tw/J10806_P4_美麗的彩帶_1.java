package apcs.tw;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 這個程式只能處理部份條件的數字
 * 1. 顏色代碼在 99 以內
 * 2. 所有數字 int 可以處理
 * @author chuan
 */
public class J10806_P4_美麗的彩帶_1 {

      static int perfectLen;
      static int bandLength;
      static long perfectCount = 0;
      static HashMap<String, Integer> perfectSet = new HashMap<>();

      public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int[] colorCount = new int[100];
            int ans = 0;
            int packageColorSize = 0;
            int checkSize = sc.nextInt();
            
            // 讀入 band 內容
            int bandSize = sc.nextInt();
            int[] band = new int[bandSize];
            for (int i = 0; i < band.length; i++) {
                  band[i] = sc.nextInt();
            }
            
            // 先取出第一段，長度為  checkSize 的內容
            for (int i = 0; i < checkSize ; i++) {
                  int colorId = band[i] ;
                  
                  if (colorCount[colorId] == 0) {
                        // 如果第一次加入，將取得的顏色加一
                        packageColorSize++;
                  }
                  colorCount[colorId]++;
            }            
            if (packageColorSize == checkSize) {
                  ans++;
            }

            for (int i = 1; i < band.length - checkSize + 1; i++) {
                  colorCount[band[i - 1]]--;
                  if (colorCount[band[i - 1]] == 0) {
                        packageColorSize--;
                  }
                  colorCount[band[i + checkSize - 1]]++;
                  if (colorCount[band[i + checkSize - 1]] == 1) {
                        packageColorSize++;
                  }
                  if (packageColorSize == checkSize) {
                        ans++;
                  }

            }
            System.out.println(ans);
      }

}
