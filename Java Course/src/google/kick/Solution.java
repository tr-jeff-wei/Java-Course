package google.kick;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

      public static void main(String[] args) {

            String data = "3\n"
                    + "4 100\n"
                    + "20 90 40 90\n"
                    + "4 50\n"
                    + "30 30 10 10\n"
                    + "3 300\n"
                    + "999 999 999\n";

            InputStream is = new ByteArrayInputStream(data.getBytes());
            System.setIn(is);
            

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {

                  int m = sc.nextInt();
                  int budget = sc.nextInt();
                  int[] list = new int[m];
                  for (int j = 0; j < m; j++) {
                        list[j] = sc.nextInt();
                  }
                  Arrays.sort(list);
                  int total = 0 ;
                  int result = 0 ;
                  for (int j = 0; j < list.length; j++) {
                        total+=list[j] ;
                        if( total<=budget){
                              result++ ;
                        }else{
                              break ;
                        }
                  }
                  System.out.println("Case #"+i+": "+result);
            }

      }

}
