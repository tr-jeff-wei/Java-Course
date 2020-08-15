/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.us;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chuan
 */
public class AP2016_P4_StringFormatter {

      public static void main(String[] args) {

            ArrayList<String> wordList = new ArrayList<>();
            wordList.add("AP");
            wordList.add("COMP");
            wordList.add("SCI");
            wordList.add("ROCKS");
            System.out.println(StringFormatter.format(wordList, 20));
            wordList = new ArrayList<>();
            wordList.add("GREEN");
            wordList.add("EGGS");
            wordList.add("AND");
            wordList.add("HAM");
            System.out.println(StringFormatter.format(wordList, 20));
            wordList = new ArrayList<>();
            wordList.add("BEACH");
            wordList.add("BALL");
            System.out.println(StringFormatter.format(wordList, 20));

      }

}

class StringFormatter {

      public static int totalLetters(List<String> wordList) {
            return 0;

      }

      public static int basicGapWidth(List<String> wordList, int formattedLen) {
            return 0;
      }

      public static int leftoverSpaces(List<String> wordList, int formattedLen) {
            return 0;
      }

      public static String format(List<String> wordList, int formattedLen) {
            return null;
      }
}
