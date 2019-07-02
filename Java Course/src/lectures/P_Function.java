package lectures;

import java.util.Scanner;

public class P_Function {



    public static void main2(String[] args) {


        System.out.println("==================");
        System.out.println("    遊戲開始    ");
        System.out.println("==================");


        Scanner input = new Scanner(System.in) ;
        int luckyNumber = (int)(Math.random()*10) ;
        int guess = 0 ;


        System.out.println("請猜猜幸運數字是？");
        guess = input.nextInt();
        if( guess == luckyNumber ){
            System.out.println("恭喜你答對了！！");
            System.exit(0);
        }else if( guess > luckyNumber ){
            System.out.println("數字要小一點");
        }else if( guess < luckyNumber ){
            System.out.println("數字要大一點");
        }


        System.out.println("請猜猜幸運數字是？");
        guess = input.nextInt();
        if( guess == luckyNumber ){
            System.out.println("恭喜你答對了！！");
            System.exit(0);
        }else if( guess > luckyNumber ){
            System.out.println("數字要小一點");
        }else if( guess < luckyNumber ){
            System.out.println("數字要大一點");
        }


        System.out.println("請猜猜幸運數字是？");
        guess = input.nextInt();
        if( guess == luckyNumber ){
            System.out.println("恭喜你答對了！！");
            System.exit(0);
        }else if( guess > luckyNumber ){
            System.out.println("數字要小一點");
        }else if( guess < luckyNumber ){
            System.out.println("數字要大一點");
        }


        System.out.println("==================");
        System.out.println("    遊戲結束    ");
        System.out.println("==================");

    }


    public static void main(String[] args) {
        System.out.println("==================");
        System.out.println("    遊戲開始    ");
        System.out.println("==================");

        int luckyNumber = (int)(Math.random()*10) ;

        guessNum(luckyNumber);

        guessNum(luckyNumber);

        guessNum(luckyNumber);

        System.out.println("==================");
        System.out.println("    遊戲結束    ");
        System.out.println("==================");
    }

    public static void guessNum(int luckyNumber){
        Scanner input = new Scanner(System.in) ;
        System.out.println("請猜猜幸運數字是？");
        int guess = input.nextInt();
        if( guess == luckyNumber ){
            System.out.println("恭喜你答對了！！");
            System.exit(0);
        }else if( guess > luckyNumber ){
            System.out.println("數字要小一點");
        }else if( guess < luckyNumber ){
            System.out.println("數字要大一點");
        }
    }


}
