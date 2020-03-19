/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.history;

import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J10806_P2_e287_機器人的路徑 {

        static int MAX = Integer.MAX_VALUE;
        static int[][] direction;

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[][] map = new int[n][m];
                int minR = 0, minC = 0;
                for (int r = 0; r < map.length; r++) {
                        for (int c = 0; c < map[r].length; c++) {
                                map[r][c] = sc.nextInt();
                                if (map[r][c] < map[minR][minC]) {
                                        minR = r;
                                        minC = c;
                                }
                        }
                }

                direction = new int[4][];
                direction[0] = new int[]{-1, 0};
                direction[1] = new int[]{1, 0};
                direction[2] = new int[]{0, -1};
                direction[3] = new int[]{0, 1};

                // walk
                int total = 0;
                while (true) {
                        total += map[minR][minC];
                        map[minR][minC] = -1;
                        int[] nextStep = next(minR, minC, map);
                        if (nextStep == null) {
                                break;
                        } else {
                                minR = nextStep[0];
                                minC = nextStep[1];
                        }
                }
                System.out.println(total);

        }

        public static int getValue(int r, int c, int[][] map) {
                if (r < 0 || c < 0) {
                        return -1;
                }
                if (r >= map.length || c >= map[0].length) {
                        return -1;
                }
                if (map[r][c] == -1) {
                        return -1;
                }

                return map[r][c];
        }

        public static int[] next(int r, int c, int[][] map) {
                int nextR = -1, nextC = -1;
                int minV = Integer.MAX_VALUE;
                for (int dir = 0; dir < direction.length; dir++) {
                        int mr = r+direction[dir][0];
                        int mc = c+direction[dir][1];

                        int v = getValue(mr, mc, map);
                        if (v == -1) {
                                continue;
                        }
                        if (nextR == -1 || v < minV) {
                                nextR = mr;
                                nextC = mc;
                                minV = v;
                        }
                }

                if (nextR == -1) {
                        return null;
                } else {
                        return new int[]{nextR, nextC};
                }
        }

}
