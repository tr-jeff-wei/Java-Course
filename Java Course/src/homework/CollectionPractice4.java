package homework;

import java.util.ArrayList;

public class CollectionPractice4 {
    public static void main(String[] args) {

        // 1. 使用 for 找出陣列 data 中
        //   a. 最大值
        //   b. 最小值
        //   c. 全部加起來的總數
        int[] data = new int[]{3, 1, -5, 6, 4, 7 , -2 } ;

        // 2. 使用 for 計算 list 中，可以被 7 整除的個數
        //   （答案應為 3）
        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(7) ;
        list.add(17) ;
        list.add(49) ;
        list.add(77) ;
        list.add(67) ;
        list.add(97) ;

        // 3. 應用 for 依照下面單價計算訂單 orders 種價
        // drink：$25
        // meat：$80
        // sala：$45
        ArrayList<String> orders = new ArrayList<>() ;
        orders.add("drink") ;
        orders.add("meat") ;
        orders.add("meat") ;
        orders.add("sala") ;
        orders.add("meat") ;
        orders.add("sala") ;


    }
}
