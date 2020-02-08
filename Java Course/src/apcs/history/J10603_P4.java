package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class J10603_P4 {



    public static void main(String[] args) {

        String input = "5 2\n" +
                "5 1 2 8 7\n" ;

        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add( sc.nextInt());
        }
        int[] loc = new int[set.size()] ;
        int i = 0;
        for (Integer num : set) {
            loc[i++] = num ;
        }
        Arrays.sort(loc);
        int max = 1+(loc[loc.length-1] - loc[0])/k;
        int LB = 1 ;
        int HB = max ;
        while(LB<HB){
            int mid = (LB+HB)/2 ;
            if( check( loc , mid , k)){
                HB=mid;
            }else{
                LB=mid+1 ;
            }
        }
        System.out.println(LB);


    }
    static boolean check( int[] loc , int radius , int k ){

            int start = -1 ;
            int end = -1;
            int i=0 ;
            int counter = 0;
            while(i<loc.length){
                if( loc[i] > end) {
                    start = loc[i];
                    end = start + radius;
                    counter++;
                    if (counter > k) {
                        return false;
                    }
                }
                i++;
            }
            if( counter >k ){
                return false ;
            }else{
                return true ;
            }

    }


}
