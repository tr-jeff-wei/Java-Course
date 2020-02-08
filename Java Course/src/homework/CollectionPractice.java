package homework;

import java.util.ArrayList;

public class CollectionPractice {

    public static void main(String[] args) {

        /*
				使用 Array , ArrayList 放置多個內容的練習
		*/

        // ------------
        // 1. 放數字
        // ------------
        int[] arr = new int[3] ;            // 建立可以放 3 個 int 的 array
        arr[0] = 5 ;
        arr[1] = 6 ;
        arr[2] = 7 ;

        Integer[] arr2 = new Integer[3] ;   // 建立可以放 3 個 Integer 的 array
        arr2[0] = 5 ;
        arr2[1] = 6 ;
        arr2[2] = 7 ;

        // 建立可以放 [多個] Integer 的 List
        ArrayList<Integer> list = new ArrayList<Integer>() ;
		Integer i1 = new Integer(5) ;
        list.add(i1) ;      // list.add(5) ; 也可以
		//list.add(5);
		
        list.add(new Integer(6)) ;      // list.add(6) ; 也可以
        list.add(new Integer(7)) ;      // list.add(7) ; 也可以

        //ArrayList<int> list = new ArrayList<int>() ; // list 不能放 int，一定要是物件
                                                     // 不可以是 primitive type

        // 用 for 取出 array 內容，方法 1
        for (int i = 0; i < arr.length; i++) {
            System.out.println(  arr[i] );
        }
        // 用 for 取出 array 內容，方法 2
        for (int n: arr) {
            System.out.println(  n );
        }

        // 用 for 取出 ArrayList 內容，方法 1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(  list.get(i) );
        }
        // 用 for 取出 ArrayList 內容，方法 2
        for (int n: list) {
            System.out.println(  n );
        }
    }
}
