package apcs.tw;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J11011_P2_g596_動線安排 {

      static char[][] grid = null;
      static int max = 0;
      static int count = 0;

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            int h = sc.nextInt();

            grid = new char[m][n];
            for (int i = 0; i < grid.length; i++) {
                  for (int j = 0; j < grid[i].length; j++) {
                        grid[i][j] = ' ';
                  }
            }

            for (int i = 0; i < h; i++) {
                  int a = sc.nextInt();
                  int b = sc.nextInt();
                  int action = sc.nextInt();
                  if (action == 0) {
                        // add
                        add(a, b);
                  } else {
                        // remove
                        remove(a, b);
                  }
                  if (count > max) {
                        max = count;
                  }
                  show();

            }
            System.out.println(max);
            System.out.println(count);

      }

      private static void show() {
            for (int i = 0; i < grid.length; i++) {
                  char[] cs = grid[i];
                  for (int j = 0; j < cs.length; j++) {
                        System.out.print(cs[j] + " ");
                  }
                  System.out.println("");
            }
            System.out.println("max : " + max);
            System.out.println("count: " + count);
            System.out.println("\n");
      }

      private static void add(int a, int b) {

            if (grid[a][b] == ' ') {
                  count++;
            }
            grid[a][b] = 'x';
            // move up
            moveAndSet(a, b, -1, 0);

            // move down
            moveAndSet(a, b, 1, 0);

            // move left
            moveAndSet(a, b, 0, -1);

            // move right
            moveAndSet(a, b, 0, 1);
      }

      private static void moveAndSet(int a, int b, int ma, int mb) {
            int ta = a + ma;
            int tb = b + mb;

            boolean found = false;
            while (true) {
                  if (ta < 0 || tb < 0 || ta >= grid.length || tb >= grid[0].length) {
                        break;
                  }
                  if (grid[ta][tb] == 'x') {
                        found = true;
                        break;
                  }
                  ta += ma;
                  tb += mb;
            }
            if (found) {
                  while (true) {
                        ta -= ma;
                        tb -= mb;
                        if (ta == a && tb == b) {
                              break;
                        }

                        if (ma == 0) {
                              // go horizontal
                              switch (grid[ta][tb]) {
                                    case ' ':
                                          grid[ta][tb] = '-';
                                          count++;
                                          break;
                                    case '-':
                                          break;
                                    case '|':
                                          grid[ta][tb] = '+';
                                          break;
                                    case '+':
                                          break;

                              }
                        } else {
                              // go vertical
                              switch (grid[ta][tb]) {
                                    case ' ':
                                          grid[ta][tb] = '|';
                                          count++;
                                          break;
                                    case '-':
                                          grid[ta][tb] = '+';
                                          break;
                                    case '|':
                                          break;
                                    case '+':
                                          break;

                              }
                        }

                  }
            }
      }

      private static void moveAndRemove(int a, int b, int ma, int mb) {
            int ta = a + ma;
            int tb = b + mb;

            while (true) {
                  if (ta < 0 || tb < 0 || ta >= grid.length || tb >= grid[0].length) {
                        break;
                  }
                  if (grid[ta][tb] == 'x') {
                        break;
                  }
                  if (grid[ta][tb] == ' ') {
                        break;
                  }
                  if (grid[ta][tb] == '+') {
                        if (ma == 0) {
                              grid[ta][tb] = '|';
                        } else {
                              grid[ta][tb] = '-';
                        }

                  } else if (grid[ta][tb] == '|' && mb == 0) {
                        grid[ta][tb] = ' ';
                        count--;
                  } else if (grid[ta][tb] == '-' && ma == 0) {
                        grid[ta][tb] = ' ';
                        count--;
                  }
                  ta += ma;
                  tb += mb;
            }
      }

      private static void remove(int a, int b) {

            // remove
            grid[a][b] = ' ';
            count--;

            // move up
            moveAndRemove(a, b, -1, 0);

            // move down
            moveAndRemove(a, b, 1, 0);

            // move left
            moveAndRemove(a, b, 0, -1);

            // move right
            moveAndRemove(a, b, 0, 1);
      }

}
