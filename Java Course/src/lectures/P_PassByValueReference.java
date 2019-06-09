package lectures;

import java.util.Arrays;

public class P_PassByValueReference {



    public static void main(String[] args) {

        int a = 5;

        Book b = new Book();
        b.price = 20;

        int c[] = new int[2];
        c[0] = 8;
        c[1] = 9;

        System.out.println("a -> "+5);
        System.out.println("Book.price -> "+b.price);
        System.out.println("c --> "+ Arrays.toString(c));

        doSomething(a , b ,c );

        System.out.println("[after] a -> "+5);
        System.out.println("[after] Book.price -> "+b.price);
        System.out.println("[after] c --> "+ Arrays.toString(c));



    }


    public static void doSomething( int a , Book b , int[] c) {

        a = a*2 ;

        b.price = b.price*2 ;

        c[0] = c[0]*2 ;
        c[1] = c[1]*2 ;


        System.out.println("[doSomething] a -> "+5);
        System.out.println("[doSomething] Book.price -> "+b.price);
        System.out.println("[doSomething] c --> "+ Arrays.toString(c));


    }


}


class Book {
    int price;
}
