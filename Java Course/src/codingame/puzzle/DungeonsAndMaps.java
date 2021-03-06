package codingame.puzzle;

import java.util.Scanner;

class DungeonsAndMaps {

      public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int w = in.nextInt();
            int h = in.nextInt();
            int startRow = in.nextInt();
            int startCol = in.nextInt();
            int n = in.nextInt();
            if (in.hasNextLine()) {
                  in.nextLine();
            }

            Map[] maps = new Map[n];
            for (int i = 0; i < n; i++) {
                  maps[i] = new Map(h, w, startRow, startCol);
                  for (int j = 0; j < h; j++) {
                        String mapRow = in.nextLine();
                        for (int k = 0; k < mapRow.length(); k++) {
                              maps[i].map[j][k] = mapRow.charAt(k);
                        }
                  }
            }

            int minStep = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int i = 0; i < maps.length; i++) {
                  maps[i].walk();
                  if (maps[i].foundTreasure == true && maps[i].step < minStep) {
                        minStep = maps[i].step;
                        minIdx = i;
                  }
            }
            if (minIdx == -1) {
                  System.out.println("TRAP");
            } else {
                  System.out.println(minIdx);
            }

      }
}

class Map {

      char[][] map;
      int pr;
      int pc;
      int step = 0;
      boolean foundTreasure = false;

      Map(int r, int c, int start_r, int start_c) {
            map = new char[r][c];
            pr = start_r;
            pc = start_c;
      }

      void walk() {

            while (true) {
                  if (oneStep() == true) {
                        step++;
                        if (step > map.length * map[0].length) {
                              break;
                        }
                  } else {
                        break;
                  }
            }
      }

      boolean oneStep() {

            if (pr < 0 || pc < 0 || pr >= map.length || pc >= map[0].length) {
                  return false;
            }

            if (map[pr][pc] == '^') {
                  pr--;
                  return true;
            }
            if (map[pr][pc] == 'v') {
                  pr++;
                  return true;
            }
            if (map[pr][pc] == '<') {
                  pc--;
                  return true;
            }
            if (map[pr][pc] == '>') {
                  pc++;
                  return true;
            }
            if (map[pr][pc] == '^') {
                  pr--;
                  return true;
            }
            if (map[pr][pc] == 'T') {
                  foundTreasure = true;
                  return false;
            }
            if (map[pr][pc] == '#') {
                  return false;
            }
            return false;
      }

}
