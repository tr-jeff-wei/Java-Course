package zerojudge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a364_2_神秘的進位問題 {

      static int[][] mat = new int[500][4];
      static int maxN = 0 ;

      public static void main(String[] args) {

            for (int i = 0; i < mat.length; i++) {
                  for (int j = 0; j < mat[i].length; j++) {
                        mat[i][j] = -1;
                  }
            }

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                  int target = sc.nextInt();
                  searchTarget(target, mat);
            }

      }

      static void searchTarget(int target, int[][] mat) {
            ArrayList<Integer> list = findMaxNAndGetList(target);
            
            for (int a : list) {
                  if(a==0){
                        continue ;
                  }
                  int ca = C(a, 3);
                  for (int b : list) {
                        if(b>=a){
                              continue; 
                        }
                        int cab = ca + C(b, 2);                        
                        if (cab > target) {
                              continue;
                        }
                        for (int c :list) {
                              if (c>=b) {
                                    continue;
                              }
                              int cc = C(c, 1);
                              //System.out.println("===>" + a + ":" + ca + "   " + b + ":" + cab + "    " + c + ":" + cc);
                              int cabc = cab + cc;
                              if (cabc == target) {
//                                    System.out.println("=");
                                    System.out.print(a);
                                    System.out.print(b);
                                    System.out.print(c);
                                    System.out.println();
                                    return;
                              } 
                        }

                  }
            }
      }
      
      static ArrayList<Integer> findMaxNAndGetList(int target){
            ArrayList<String> list = new ArrayList<>() ;
            list.add("0");
            int i=1 ;
            while (true) {
                  int r = C(i,3);
                  if( r>target){
                        maxN = i-1 ;
                        break ;
                  }  else{
                        list.add(""+i) ;
                  }
                  i++;
            }
            Collections.sort(list);
            ArrayList<Integer> listi = new ArrayList<>();
            for (String si : list) {
                  int k = Integer.parseInt(si) ;
                  listi.add(k) ;
            }
            return listi ;
      }

      static int C(int m, int n) {
            if (n == 1) {
                  return m;
            }
            if (n == 2) {
                  if (m == 2) {
                        return 1;
                  }
                  if (m < 2) {
                        return 0;
                  }
                  if (mat[m][n] == -1) {
                        mat[m][n] = m * (m - 1) / 2;
                  }

                  // m! / (2 * (m-2)!)
                  // m*(m-1)/2
                  return mat[m][n];
            }
            if (n == 3) {
                  if (m == 3) {
                        return 1;
                  }
                  if (m < 3) {
                        return 0;
                  }
                  if (mat[m][n] == -1) {
                        mat[m][n] = C(m, 2) * (m - 2) / 3;
                  }

                  // m! / (6 * (m-3)!)
                  // return c_m_2(m)*(m-2)/3;
                  // return m*(m-1)*(m-2)/6;
                  return mat[m][n];
            }
            if (mat[m][n] == -1) {
                  mat[m][n] = combination(m, n);
            }
            return mat[m][n];
      }

      static int combination(int m, int n) {
            // m >= n

            //  ------ 分子
            // m!  
            // ------- 分母
            // n!      
            // (m-n)!
            int bigOne = Math.max(n, m - n);

            // 分子 a（初步約分後)
            int a = 1; //12x11x10x9x.... (乘 m-bigOne 次)
            int r = m - bigOne;
            for (int i = 0; i < r; i++) {
                  a = a * m;
                  m--;
            }

            // 分母 b（初步約分後)
            int b = 1;
            for (int i = 1; i <= r; i++) {
                  b = b * i;
            }

            return a / b;
      }
}
