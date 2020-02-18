package zerojudge;


import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class e841_2 {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nBox = sc.nextInt();
        int nM = sc.nextInt();

        long[] box  = new long[nBox+ 2];
        ArrayList<Integer>[] multi = new ArrayList[nBox + 2];
        ArrayList<Integer>[] div   = new ArrayList[nBox + 2];

        for (int i = 1; i < multi.length; i++) {
            multi[i] = new ArrayList<>();
            div[i] = new ArrayList<>();
        }

        for (int i = 0; i < nM; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();

            if (r == 1){
                box[p]  += s ;
                box[q+1]-= s ;
            } else if (r == 2){
                multi[p].add(s)  ;
                div[q+1].add(s)  ;
            }
        }

        long[] times  = new long[nBox+ 1];

        ArrayList<Integer> totalList = new ArrayList<Integer>() ;
        for (int i = 1; i < times.length; i++) {
            totalList.addAll( multi[i] ) ;
            totalList.removeAll(div[i]) ;
            long total = 1 ;
            for (Integer integer : totalList) {
                total*=integer ;
            }
            times[i] = total ;
        }


        long max = 0;
        int maxIdx = -1;
        long base = 0 ;
        for (int i = 1; i <= nBox; i++) {
            base += box[i] ;
            long sum = base*times[i] ;
            if (sum > max) {
                max = sum;
                maxIdx = i;
            }
        }

        System.out.println(maxIdx + " " + max);


    }

}
