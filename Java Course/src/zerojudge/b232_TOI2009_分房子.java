package zerojudge;

/**
 *
 * @author chuan
 */
public class b232_TOI2009_分房子 {
      
      static int count = 0 ;

      public static void main(String[] args) {
            int n = 5 ;
            for (int i = n ; i>0 ; i--) {
                
                  split(n, i, 0);
            }
            
      }

      public static void split(int total, int cut, int level) {

            int remainder = total - cut;

            for (int i = 0; i < level; i++) {
                  System.out.print("=====");
            }
            System.out.println(" # " + total + " -" + cut);

            if (remainder == 0) {
                  count++;
                  System.out.println("------------------------>> "+count);
                  return;
            }
            int m = Math.min(cut, remainder) ;
            for (int i = m; i >= 1; i--) {
                  split(remainder, i, level + 1);
            }
      }
}
