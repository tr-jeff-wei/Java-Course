package zerojudge;


import java.util.Scanner;

public class e797_數位邏輯運算 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] arr = new int[r][c];
            for (int i = 0; i < arr.length; i++) {
                  for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j] = sc.nextInt();
                  }
            }
            String sand = "AND: ";
            String sor = " OR: ";
            String sxor = "XOR: ";

            for (int j = 0; j < c; j++) {
                  
                  int and = arr[0][j];
                  int or = arr[0][j];
                  int xor = arr[0][j];
                  
                  for (int i = 1; i < r; i++) {
                        and = and & arr[i][j];
                        or = or | arr[i][j];
                        xor = xor ^ arr[i][j];
                  }
                  sand = sand + and+" ";
                  sor = sor + or+" ";
                  sxor = sxor + xor+" ";
            }
            
            System.out.println(sand);
            System.out.println(sor);
            System.out.println(sxor);
            
      }
      
}
