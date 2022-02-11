package zerojudge;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class b971_等差數列 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();

            StringBuilder sb = new StringBuilder();

            sb.append(a);
            
            a+=d;
            while (a!=b) {
                  sb.append(" ") ;
                  sb.append(a) ;
                  a+=d ;
                  if( sb.length()>500){
                        System.out.print(sb);
                        sb = new StringBuilder();
                  }
            }
            sb.append(" ");
            sb.append(b);
            System.out.println(sb);
      }
}
