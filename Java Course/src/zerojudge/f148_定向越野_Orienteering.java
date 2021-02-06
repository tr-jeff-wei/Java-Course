package zerojudge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class f148_定向越野_Orienteering {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int w = sc.nextInt();
            int c = sc.nextInt();

            String[] tokens = new String[200];

            for (int rowi = 0; rowi < h; rowi++) {
                  for (int coli = 0; coli < w; coli++) {
                        char s = sc.next().charAt(0);
                        if(s!='0'){
                              tokens[s] = ""+rowi+" "+coli ;
                        }
                  }
            }
            
            ArrayList<String> list = new ArrayList<>();
            
            for (int i = 0; i < tokens.length; i++) {
                  String token = tokens[i];
                  if(tokens!=null){
                        
                  }
            }

      }

}
