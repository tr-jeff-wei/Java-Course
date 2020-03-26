package apcs.tw;

import java.util.ArrayList;
import java.util.Scanner;

public class J10510_P2_最大和 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        int size = sc.nextInt();
        ArrayList<Integer> maxList = new ArrayList<>();
        int total =0 ;
        for (int i = 0; i < group; i++) {
            int max = -1 ;
            for (int j = 0; j < size; j++) {
                int n = sc.nextInt() ;
                if( n>max) {
                    max = n;
                }
            }
            maxList.add(max) ;
            total+= max ;
        }
        System.out.println(total);
        StringBuilder sb = new StringBuilder() ;
        for (int n:  maxList) {
            if( total%n==0){
                if(sb.length()==0){
                    sb.append(n) ;
                }else{
                    sb.append(" "+n) ;
                }
            }
        }
        if( sb.length()==0){
            System.out.println(-1);
        }else{
            System.out.println(sb.toString());
        }
    }
}
