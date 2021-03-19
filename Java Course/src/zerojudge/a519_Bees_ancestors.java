package zerojudge;

import java.util.Scanner;

public class a519_Bees_ancestors {

      static final int Male = 0;
      static final int Female = 1;
      static long[][] generation ;

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            while(true){
                  int n = sc.nextInt();
                  if( n ==0 ){
                        break ;
                  }
                  generation = new long[81][2];
                  System.out.println(fun(Male,0,n));
            }
      }

      static long fun(int gender, int gen, int target) {
            //---------------------------------------------------------------
//            for (int i = 0; i < gen; i++) {
//                  System.out.print("-");
//            }
//            if (gender == Male) {
//                  System.out.println("g" + gen + "M");
//            } else {
//                  System.out.println("g" + gen + "F");
//            }
            //---------------------------------------------------------------

            // memorized
            if( generation[gen][gender]>0){
                  return generation[gen][gender] ;
            }
            
            if (gen == target) {
                  return 1;
            }

            if (gender == Male) {
                  generation[gen][Male] = fun(Female, gen + 1, target);
                  return generation[gen][Male] ;
            } else {
                  generation[gen][Female] =  fun(Female, gen + 1, target)
                          + fun(Male, gen + 1, target);
                  return  generation[gen][Female] ;
            }

      }
}
