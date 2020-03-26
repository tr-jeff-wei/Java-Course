/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.us;

/**
 *
 * @author chuan
 */
class FrogSimulation {
      
      private int goalDistance ;
      private int maxHops ;
      
      public FrogSimulation(int dist , int numHops ){
            this.goalDistance = dist ;
            this.maxHops = numHops ;
      }
      private int hopDistance(){
            return (int)(Math.random()*10-3) ;
      }
      public boolean simulate(){
            
            // (a)
            return false ;
      }
      public double runSimulation(int num ){
            // (b)
            return 0.0 ;
      }
}
