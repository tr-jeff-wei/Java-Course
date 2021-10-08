
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class f149_炸彈偵測器_Detector {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int c = sc.nextInt();

            int[][] map = new int[r][c];

            ArrayList<Integer> detectorR = new ArrayList<>();
            ArrayList<Integer> detectorC = new ArrayList<>();

            int totalBombs = 0 ;
            for (int i = 0; i < map.length; i++) {
                  for (int j = 0; j < map[i].length; j++) {
                        map[i][j] = sc.nextInt();
                        if (map[i][j] == 5) {
                              detectorR.add(i);
                              detectorC.add(j);
                        }else if( map[i][j]==1){
                              totalBombs++ ;
                        }
                  }
            }

            int totalFound = 0;
            int totalNotFound = 0;
            for (int i = 0; i < detectorR.size(); i++) {
                  int dr = detectorR.get(i);
                  int dc = detectorC.get(i);

                  int bombs =0 ;
                  boolean cancel =false ;
                  for (int j = -1; j <= 1; j++) {
                        for (int k = -1; k <= 1; k++) {
                              if (j == 0 && k == 0) {
                                    continue;
                              }
                              int v = get( dr+j,dc+k , map) ;
                              if( v==5){
                                    cancel = true ;
                              }else if(v==1){
                                    bombs++;
                                    map[i][j] = 0 ;
                              }
                        }
                  }
                  if(cancel){
                        totalNotFound+=bombs ;
                  }else{
                        totalFound+=bombs;
                  }
                  
            }
            
            System.out.println(totalFound+" "+totalNotFound);

      }

      public static int get(int r, int c, int[][] map) {
            if (r < 0 || c < 0) {
                  return 0;
            }
            if (r >= map.length || c >= map[0].length) {
                  return 0;
            }
            return map[r][c];
      }

}
