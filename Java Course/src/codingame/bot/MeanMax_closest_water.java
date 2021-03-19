/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingame.bot;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class MeanMax_closest_water {

      public static void main(String args[]) {
            Scanner in = new Scanner(System.in);

            // game loop
            while (true) {
                  int myScore = in.nextInt();
                  int enemyScore1 = in.nextInt();
                  int enemyScore2 = in.nextInt();
                  int myRage = in.nextInt();
                  int enemyRage1 = in.nextInt();
                  int enemyRage2 = in.nextInt();
                  int unitCount = in.nextInt();

                  ArrayList<Water> ws = new ArrayList<Water>();
                  int mx = 0;
                  int my = 0;

                  for (int i = 0; i < unitCount; i++) {
                        int unitId = in.nextInt();
                        // System.err.println(i+" "+unitId) ;
                        int unitType = in.nextInt();
                        int player = in.nextInt();
                        float mass = in.nextFloat();
                        int radius = in.nextInt();
                        int x = in.nextInt();
                        int y = in.nextInt();
                        int vx = in.nextInt();
                        int vy = in.nextInt();
                        int extra = in.nextInt();
                        int extra2 = in.nextInt();

                        if (unitType == 4 && extra > 1) {
                              Water w = new Water(x, y, extra);
                              ws.add(w);
                        }
                        if (unitId == 0) {
                              mx = x;
                              my = y;
                        }
                  }
                  
                  
                  Water closest = null ;
                  double minDist = -1 ;
                  for (Water w : ws) {                        
                        double d = w.getDist( mx , my) ;
                        if( minDist==-1 || d<minDist ){
                              minDist = d ;
                              closest = w ;
                        }
                  }
                  
                  if( closest == null ){
                        System.out.println("WAIT");
                  }else{
                        System.out.println(closest.x+" "+closest.y+" ??");
                  }
                  
                  

                  
                  System.out.println("WAIT");
                  System.out.println("WAIT");
            }
      }
}

class Water {

      int x;
      int y;
      int water;

      public Water(int x, int y, int water) {
            this.x = x;
            this.y = y;
            this.water = water;
      }

      public double getDist(int ox, int oy) {
            int dx = ox - x;
            int dy = oy - y;
            
            return Math.sqrt( dx*dx+dy*dy) ;

      }

}
