
package codingame.clash;
import java.util.*;
//
//As Logan's 4 year-old daughter is new to maths, she has trouble understanding sums when they are given in a string with numbers in an arbitrary order, such as 3+5+2.
//Therefore, her father will help her to understand sums by arranging the numbers of each string sum in ascending order, such as 2+3+5.
//
//Your job is to help Logan arrange the numbers in ascending order and print the sum in a form that his daughter can understand.
class ReverseEquation {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String sum = in.next();

        String[] ss =sum.split(sum);
        Arrays.sort(ss) ;
        String result =ss[0] ;
        for(int i=1 ; i<ss.length ; i++){
            result+=("+"+ss[i]) ;
        }


        System.out.println(result);
    }
}

// test case
// 3+5+2 ==> 2+3+5