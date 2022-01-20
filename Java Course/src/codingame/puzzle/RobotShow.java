package codingame.puzzle;

import java.util.*;
import java.io.*;
import java.math.*;

class RobotShow {

      public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int L = in.nextInt();
            int N = in.nextInt();

            ArrayList<Robot> list = new ArrayList<>();
            ArrayList<Robot> list2 = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                  int b = in.nextInt();
                  Robot r = new Robot();
                  r.position = b;
                  list.add(r);

                  Robot r2 = new Robot();
                  r2.position = b;
                  list2.add(r2);
            }

            // sort robot
            Collections.sort(list);
            Collections.sort(list2);

            int d = -1;
            for (int i = 0; i < list.size(); i++) {
                  Robot r = list.get(i);
                  r.direction = d;
                  d = d * -1;

                  Robot r2 = list2.get(i);
                  r2.direction = d ;

            }

            int e1 = run(L, list);
            int e2 = run(L, list2);
            if (e1 > e2) {
                  System.out.println(e1);
            } else {
                  System.out.println(e2);
            }

      }

      static int run(int L, ArrayList<Robot> list) {
            int stepsCount = 0;
            while (true) {

                  for (int i = 0; i < list.size(); i++) {
                        Robot r = list.get(i);
                        r.move();
                  }
                  Collections.sort(list);
                  // check bump
                  for (int i = 0; i < list.size() - 1; i++) {
                        Robot r1 = list.get(i);
                        Robot r2 = list.get(i + 1);
                        if (r1.position == r2.position) {
                              r1.reverse();
                              r2.reverse();
                        }
                  }

                  // leave ?
                  for (int i = 0; i < list.size(); i++) {
                        Robot r = list.get(i);
                        if (r.position < 0 || r.position > L) {
                              r.leave();
                        }
                  }

                  // all robot leave
                  boolean allLeave = true;
                  for (int i = 0; i < list.size(); i++) {
                        Robot r = list.get(i);
                        if (r.onRoad) {
                              allLeave = false;
                        }
                  }
                  if (allLeave) {
                        break;
                  }
                  stepsCount++;

                  // =======================
                  //print(L,stepsCount,list) ;
            }

            //System.out.println(stepsCount);
            return stepsCount;
      }

      static void print(int L, int stepsCount, ArrayList<Robot> list) {
            // print road
            for (int i = 0; i <= L; i++) {
                  System.out.print(i % 10);
            }
            System.out.println("");
            for (int i = 0; i <= L; i++) {
                  System.out.print("=");
            }
            System.out.println("  >> step:" + stepsCount);
            stepsCount++;

            for (Robot robot : list) {
                  for (int i = 0; i < robot.position; i++) {
                        System.out.print(" ");
                  }
                  if (robot.direction == 1) {
                        System.out.println(">");
                  } else {
                        System.out.println("<");
                  }

            }
            System.out.println("\n\n\n");
      }
}

class Robot implements Comparable<Robot> {

      int position; // 5
      int direction; // -1
      boolean onRoad = true;

      void move() {
            position = position + direction;
      }

      void reverse() {
            direction = direction * -1;
      }

      void leave() {
            onRoad = false;
      }

      @Override
      public int compareTo(Robot o) {
            return this.position - o.position;
      }

}
