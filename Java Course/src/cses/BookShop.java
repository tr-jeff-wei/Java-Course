//package cses;

import java.util.Scanner;

public class BookShop {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int max = sc.nextInt();
            int[] prices = new int[n];
            int[] pages = new int[n];
            int[] costPages = new int[max + 1];
            for (int i = 0; i < n; i++) {
                  prices[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                  pages[i] = sc.nextInt();
            }

            int maxPages = 0;
            for (int i = 1; i <= n; i++) {
                  int bookPrice = prices[i - 1];
                  int bookPages = pages[i - 1];
                  // 新一輪的判斷（前一輪的結果）和更新，要全部處理完，才可以一起更新。否則可能會拿到新更新的結果作判斷，而不是前一輪的結果
                  // 除非由『後往前處理』，因為更新的結果都在後方（不會被使用）
                  for (int j = max; j >= bookPrice; j--) {
                        int nPages = costPages[j - bookPrice] + bookPages;
                        costPages[j] = Math.max(costPages[j], nPages);
                        // log max
                        if (costPages[j] > maxPages) {
                              maxPages = costPages[j];
                        }
                  }
            }

            System.out.println(maxPages);

      }
}
