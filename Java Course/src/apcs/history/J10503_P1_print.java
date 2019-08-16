package apcs.history;

import java.util.Arrays;
import java.util.Scanner;

public class J10503_P1_print {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int[] data = new int[n] ;
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        Arrays.sort(data);
        
        int max =-1 ;
        int min =-1 ;
        for (int i = 0; i < data.length; i++) {
            if( data[i]>=60){
                // 及格
                if( min==-1 || data[i]<min ){
                    min = data[i] ;
                }
            }else{
                // 不及格
                if( max==-1 || data[i]>max ){
                    max = data[i] ;
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            if(i==0){
                System.out.print(data[i]);
            }else{
                System.out.print(" "+data[i]);
            }
        }

        System.out.println();

        if( max == -1){
            System.out.println("best case");
        }else{
            System.out.println(max);
        }
        if( min == -1){
            System.out.println("worst case");
        }else{
            System.out.println(min);
        }

    }
}
