package zerojudge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class b051_2_排列最大值 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        while( sc.hasNextInt() ){
            int n = sc.nextInt() ;
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add( sc.next().trim()) ;
            }
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    int n1=0,n2=0;
                    char c1=' ' , c2=' ' ;
                    while(c1==c2){

                        if( n1>=s1.length()){
                            // 比較短的字串（沒有字串和對方比了）
                            // 會假設結束後下一個數是連接對方的數
                            c1=s2.charAt((n1%s1.length()));
                        }else{
                            c1=s1.charAt(n1) ;
                        }
                        if( n2>=s2.length()){
                            c2 = s1.charAt(n2%s2.length());
                        }else{
                            c2=s2.charAt(n2) ;
                        }
                        if(n1>=s1.length()&&n2>=s2.length()){
                            break;
                        }
                        n1++;
                        n2++;
                    }
                    return c2-c1 ;
                }

            });
            for (String s:list) {
                System.out.print(s);
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main3(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        list.add("4");
//        list.add("45");
//        list.add("453");
//        list.add("41");
//        list.add("94");
//        list.add("945");
//        list.add("9453");
//        list.add("941");
        list.add("2523") ;
        //list.add("23") ;
        list.add("25") ;
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int n1=0,n2=0;
                char c1=' ' , c2=' ' ;
                while(c1==c2){

                    if( n1>=s1.length()){
                        // 比較短的字串（沒有字串和對方比了）
                        // 會假設結束後下一個數是跟自己第一個數相同的數
                        // 因為，下一個數不會是［比自己大的數］：因為比自己的的數都排到自己前面，不可能產生在後
                        // 因此下一個數只有可能［比自己小的數］或［和自己一樣大的數］
                        c1=s2.charAt((n1%s1.length()));
                    }else{
                        c1=s1.charAt(n1) ;
                    }
                    if( n2>=s2.length()){
                        c2 = s1.charAt(n2%s2.length());
                    }else{
                        c2=s2.charAt(n2) ;
                    }
                    if(n1>=s1.length()&&n2>=s2.length()){
                        break;
                    }
                    n1++;
                    n2++;
                }
                return c2-c1 ;
            }

        });
        System.out.println(list);

    }
}
