/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chuan
 */
public class Candies_1431 {

}

class Solution431 {

      public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> list = new ArrayList<>();
            int max = 0;
            for (int i = 0; i < candies.length; i++) {
                  if( candies[i]>max){
                        max = candies[i] ;
                  }
            }
            for (int i = 0; i < candies.length; i++) {
                  int candy = candies[i]+extraCandies;
                  if( candy>=max){
                        list.add(Boolean.TRUE) ;
                  }else{
                        list.add(Boolean.FALSE) ;
                  }                  
            }
            return list ;            
      }
}
