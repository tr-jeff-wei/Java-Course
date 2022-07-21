package zerojudge;

import java.util.Arrays;
import java.util.Scanner;

public class a225_明明愛排列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                  int n = sc.nextInt();
                  Num[] arr = new Num[n] ;
                  for (int i = 0; i < arr.length; i++) {
                    int x = sc.nextInt() ;
                    arr[i] = new Num(x);
                  }
                  Arrays.sort(arr);

                  for (int i = 0; i < arr.length; i++) {
                    if(i==0){
                        System.out.print(arr[i].v);
                    }else{
                        System.out.print(" "+arr[i].v);

                    }
                  }
                  System.out.println();
            }
    }
}

class Num implements Comparable<Num>{
    int v ;

    public Num(int v) {
        this.v = v;
    }

    @Override
    public int compareTo(Num o) {
        // 先比個位數
        int d1 = this.v%10 - o.v%10 ;
        if( d1!=0 ){
            return d1 ;
        }else{
            return  o.v-this.v  ;
        }
    }

    
}
