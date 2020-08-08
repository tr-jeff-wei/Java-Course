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
public class AP2017_P3_Phrase {

      public static void main(String[] args) {
            Phrase test = new Phrase("isoisooooisooo");
            System.out.println(test.findNthOccurrence("is", 1));
            System.out.println(test.findNthOccurrence("is", 2));
            System.out.println(test.findNthOccurrence("is", 3));

            Phrase p1 = new Phrase("A cat ate late.");
            p1.replaceNthOccurrence("at", 1, "rane");
            System.out.println(p1);

            p1 = new Phrase("A cat ate late.");
            p1.replaceNthOccurrence("at", 6, "xx");
            System.out.println(p1);

            p1 = new Phrase("A cat ate late.");
            p1.replaceNthOccurrence("at", 2, "xx");
            System.out.println(p1);

            p1 = new Phrase("aaaa");
            p1.replaceNthOccurrence("aa", 1, "xx");
            System.out.println(p1);

            p1 = new Phrase("aaaa");
            p1.replaceNthOccurrence("aa", 2, "bbb");
            System.out.println(p1);

            ///---------------(b)
            p1 = new Phrase("A cat ate late.");
            System.out.println(p1.findLastOccurrence("at"));
            System.out.println(p1.findLastOccurrence("cat"));
            System.out.println(p1.findLastOccurrence("bat"));

      }
}

class Phrase {

      private String currentPhrase;

      public Phrase(String p) {
            this.currentPhrase = p;
      }

      public int findNthOccurrence(String str, int n) {

            int s = 0;
            int idx = -1;
            for (int i = 0; i < n; i++) {

                  idx = currentPhrase.indexOf(str, s);
                  if (idx < 0) {
                        return -1;
                  }
                  s = idx + 1;
            }

            return idx;
      }

      public void replaceNthOccurrence(String str, int n, String str2) {

      }

      public int findLastOccurrence(String str) {
            return -1;
      }

      public String toString() {
            return currentPhrase;
      }

}
