package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class J10503_P1 {

    public static void main(String[] args) {


        String input ="";

//        input = "10\n" +
//                "0 11 22 33 55 66 77 99 88 44\n";
        input = "1\n" +
                "66\n";
//        input = "1\n"+
//                "13\n";

        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);


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
