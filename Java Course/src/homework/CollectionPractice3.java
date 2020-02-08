package homework;

import java.util.ArrayList;

 class Member{
    private String name ;
    Member( String sname ){
        this.name = sname ;
    }
    public String getName(){
        return name ;
    }
}


class CollectionPractice3 {

    public static void main(String[] args) {

        /*
            使用 Array , ArrayList 放置多個內容的練習
         */

        // ------------
        // 1. 放物件:Member
        // ------------
        Member[] arr = new Member[3] ;  // 建立可以放 3 個 Member 的 array
        arr[0] = new Member("John") ;
        arr[1] = new Member("Mary") ;
        arr[2] = new Member("Eric") ;


        // 建立可以放 [多個] Member 的 List
        ArrayList<Member> list = new ArrayList<Member>() ;
        list.add( new Member("John")) ;
        list.add(new Member("Mary")) ;
        list.add(new Member("Eric")) ;

        // 用 for 取出 array 內容，方法 1
        for (int i = 0; i < arr.length; i++) {
            System.out.println(  arr[i].getName() );
        }
        // 用 for 取出 array 內容，方法 2
        for (Member n: arr) {
            System.out.println(  n.getName() );
        }

        // 用 for 取出 ArrayList 內容，方法 1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(  list.get(i).getName() );
        }
        // 用 for 取出 ArrayList 內容，方法 2
        for (Member n: list) {
            System.out.println(  n.getName() );
        }
    }
}
