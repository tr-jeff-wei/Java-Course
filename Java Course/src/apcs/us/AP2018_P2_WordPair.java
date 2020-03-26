/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.us;

import java.util.ArrayList;

/**
 *
 * @author chuan
 */
class WordPair {
      private String first ;
      private String second ;

      public WordPair(String first, String second) {
            this.first = first;
            this.second = second;
      }

      public String getFirst() {
            return first;
      }

      public String getSecond() {
            return second;
      }
      
      
}


class WordPairList{
      private ArrayList<WordPair> allPairs ;

      public WordPairList(String[] words) {
            // (a)
      }
      public int numMatches(){
            // (b)
            return 0 ;
      }
      
}