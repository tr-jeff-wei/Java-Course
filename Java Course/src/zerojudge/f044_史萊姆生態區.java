package zerojudge;


import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class f044_史萊姆生態區 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int n = b/a+1 ;
            int count = 0 ;
            while(n>1){
                  n/=2;
                  count++;
            }
            System.out.println(count);
      }
}
