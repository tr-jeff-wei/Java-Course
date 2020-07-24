
package atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class D {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            List<Integer>[] links = new ArrayList[N+1] ;
            for (int i = 0; i < links.length; i++) {
                  links[i] = new ArrayList<Integer>() ;                  
            }
            
            //boolean[][] passages = new boolean[N + 1][N + 1];
            for (int i = 0; i < M; i++) {
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  links[a].add(b) ;
                  links[b].add(a) ;
            }
            
            //boolean[] roomVisited
            List<Integer> visits = new ArrayList<>();
            visits.add(1) ;

      }
}

class C {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a_h = sc.nextInt();
            int b_m = sc.nextInt();
            int h = sc.nextInt();
            int m = sc.nextInt();

            double dh = (h * 60 + m) * 2 * Math.PI / (12 * 60);
            double hx = a_h * Math.cos(dh);
            double hy = a_h * Math.sin(dh);

            double dm = m * 2 * Math.PI / 60;
            double mx = b_m * Math.cos(dm);
            double my = b_m * Math.sin(dm);

            double dx = mx - hx;
            double dy = my - hy;

            double result = Math.sqrt(dx * dx + dy * dy);
            System.out.println(result);
      }

}

class B {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            String s = sc.next();

            if (k >= s.length()) {
                  System.out.println(s);
            } else {
                  System.out.println(s.substring(0, k) + "...");
            }

      }

}

class A {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine().trim();
            char c = s.charAt(s.length() - 1);
            switch (c) {
                  case '2':
                  case '4':
                  case '5':
                  case '7':
                  case '9':
                        System.out.println("hon");
                        break;
                  case '0':
                  case '1':
                  case '6':
                  case '8':
                        System.out.println("pon");
                        break;
                  case '3':
                        System.out.println("bon");

            }

      }

}
