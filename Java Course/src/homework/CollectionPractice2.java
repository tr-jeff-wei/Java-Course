package homework;

import java.util.ArrayList;

public class CollectionPractice2 {

    public static void main(String[] args) {

        /*
				使用 Array , ArrayList 放置多個內容的練習
		*/

        // ------------
        // 1. 放文字（物件）
        // ------------
        String[] arr = new String[3] ;            // 建立可以放 3 個 String 的 array
        arr[0] = "A" ;
        arr[1] = "B" ;
        arr[2] = "C" ;


        // 建立可以放 [多個] String 的 List
        ArrayList<String> list = new ArrayList<String>() ;
        list.add("A") ;
        list.add("B") ;
        list.add("C") ;

        // 用 for 取出 array 內容，方法 1
        for (int i = 0; i < arr.length; i++) {
            System.out.println(  arr[i] );
        }
        // 用 for 取出 array 內容，方法 2
        for (String n: arr) {
            System.out.println(  n );
        }

        // 用 for 取出 ArrayList 內容，方法 1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(  list.get(i) );
        }
        // 用 for 取出 ArrayList 內容，方法 2
        for (String n: list) {
            System.out.println(  n );
        }
    }
}
