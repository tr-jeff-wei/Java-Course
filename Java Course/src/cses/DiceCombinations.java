package cses;

import java.util.Scanner;

public class DiceCombinations {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] result = new int[n + 1];
            result[0] = 1;

            for (int i = 1; i < result.length; i++) {
                  // dice number
                  for (int d = 1; d <= 6; d++) {
                       if( i-d < 0){
                             break ;
                       }                       
                       result[ i ] += result[ i-d ] ;
                       
                       result[i]%=1000000007;
                  }
            }
            
            System.out.println(result[n]);
      }
}
