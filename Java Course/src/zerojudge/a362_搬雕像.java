package zerojudge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a362_搬雕像 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        ArrayList<Obj> objs = new ArrayList<>() ;
        for (int i = 0; i < n; i++) {
            Obj o1 = new Obj();
            o1.h = sc.nextInt() ;
            o1.w = sc.nextInt() ;
            o1.sn = i ;
            objs.add(o1) ;
        }
        Collections.sort(objs);

        int dist = 0 ;
        for (int i = 0; i < objs.size(); i++) {
            int move = Math.abs(  objs.get(i).sn - i ) ;
            dist = dist + move ;
        }
        System.out.println(dist);
    }
}

class Obj implements Comparable<Obj>{
    int h ;
    int w ;
    int sn ;

    @Override
    public int compareTo(Obj o) {
        if( h!=o.h){
            return h-o.h ;
        }else{
            return w-o.w ;
        }
    }
}