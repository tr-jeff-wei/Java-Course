//package codeforces;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class CodeforcesRound_648_B {

      public static void main(String[] args) {
//            String data = "5\n"
//                    + "4\n"
//                    + "10 20 20 30\n"
//                    + "0 1 0 1\n"
//                    + "3\n"
//                    + "3 1 2\n"
//                    + "0 1 1\n"
//                    + "4\n"
//                    + "2 2 4 8\n"
//                    + "1 1 1 1\n"
//                    + "3\n"
//                    + "5 15 4\n"
//                    + "0 0 0\n"
//                    + "4\n"
//                    + "20 10 100 50\n"
//                    + "1 0 0 1\n";
//
//            InputStream is = new ByteArrayInputStream(data.getBytes());
//            System.setIn(is);

//            String data = "10\n"
//                    + "4\n"
//                    + "61984 85101 45152 74839\n"
//                    + "1 0 0 1\n"
//                    + "4\n"
//                    + "4214 35436 84747 99946\n"
//                    + "0 0 1 1\n"
//                    + "3\n"
//                    + "79565 44828 8501\n"
//                    + "1 0 1\n"
//                    + "1\n"
//                    + "38344\n"
//                    + "0\n"
//                    + "2\n"
//                    + "34421 26750\n"
//                    + "1 0\n"
//                    + "3\n"
//                    + "16298 12276 30423\n"
//                    + "0 1 1\n"
//                    + "5\n"
//                    + "54423 7612 48964 84655 21084\n"
//                    + "0 0 1 1 0\n"
//                    + "4\n"
//                    + "3815 47682 5788 98926\n"
//                    + "0 1 0 0\n"
//                    + "1\n"
//                    + "89288\n"
//                    + "1\n"
//                    + "7\n"
//                    + "45399 99669 77314 13900 19409 12543 79739\n"
//                    + "0 0 1 1 1 1 1\n";
//
//            InputStream is = new ByteArrayInputStream(data.getBytes());
//            System.setIn(is);
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int qi = 0; qi < n; qi++) {
                  int nd = sc.nextInt();
                  int preD = -1;
                  boolean pass = true;
                  for (int d = 0; d < nd; d++) {
                        int digit = sc.nextInt();
                        if (digit >= preD) {
                              preD = digit;
                        } else {
                              pass = false;
                        }
                  }
                  if (nd == 1) {
                        pass = true;
                  }
//                  int n0 = -1;
//                  int n1 = -1;
//                  boolean pass = true; 
                  int total = 0;
                  for (int i = 0; i < nd; i++) {
                        total += sc.nextInt();
//                        if( pass == false ){
//                              continue ;
//                        }
//                        if (ntype == 0) {
//                              if (list[i] >= n0) {
//                                    n0 = list[i];
//                              } else {
//                                    pass = false ;
//                              }
//                        } else {
//                              if (list[i] >= n1) {
//                                    n1 = list[i];
//                              } else {
//                                    pass = false ;
//                              }
//                        }

                  }
                  if (pass) {
                        System.out.println("Yes");
                  } else if (total != 0 && total != nd) {
                        System.out.println("Yes");
                  } else {
                        System.out.println("No");
                  }
            }
      }

}
