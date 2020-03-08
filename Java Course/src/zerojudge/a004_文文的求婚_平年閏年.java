package zerojudge;

import java.util.Scanner;

public class a004_文文的求婚_平年閏年 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while( sc.hasNextInt()){
            int n = sc.nextInt() ;
            if( n%4==0){
                if( n%100==0){
                    if(n%400==0){
                        System.out.println("閏年");
                    }else{
                        System.out.println("平年");
                    }

                }else{
                    System.out.println("閏年");
                }

            }else{
                System.out.println("平年");
            }
        }
        sc.close();
    }
}
