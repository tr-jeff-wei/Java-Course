package zerojudge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class b051_2_排列最大值 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        while( sc.hasNextInt() ){
            int n = sc.nextInt() ;
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add( sc.next().trim()) ;
            }
            Collections.sort(list);
            for (int i = list.size()-1; i >=0 ; i--) {
                System.out.print(list.get(i));
            }
            System.out.println();
        }
        sc.close();
    }
}
