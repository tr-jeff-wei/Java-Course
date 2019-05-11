package lectures;

public class P_Condition_Flow {

        public static void main(String[] args) {

                order_01("A");
                order_01("B");
        }

        static void order_01(String order) {

                String m1 = "漢堡";
                String m2 = "三明治";
                String d1 = "紅茶";
                String d2 = "咖啡";
                String d3 = "牛奶";

                String meal = "";

                // 如果
                // order -> A :  meal -> 漢堡 , 紅茶
                if (order.equals("A")) {
                        meal = m1 + " , " + d1;
                }

                // order -> B : meal -> 三明治 , 咖啡
                // order -> C : meal -> 漢堡 , 三明治 , 咖啡 , 紅茶
                // order -> D : meal -> 咖啡 , 牛奶
                System.out.println(order + "餐 => " + meal);

        }

        static void order_01_switch(String order) {

                String m1 = "漢堡";
                String m2 = "三明治";
                String d1 = "紅茶";
                String d2 = "咖啡";
                String d3 = "牛奶";

                String meal = "";

                // 使用 Switch Case 進行
                // order -> A :  meal -> 漢堡 , 紅茶
                // order -> B : meal -> 三明治 , 咖啡
                // order -> C : meal -> 漢堡 , 三明治 , 咖啡 , 紅茶
                // order -> D : meal -> 咖啡 , 牛奶
                
                
                System.out.println(order + "餐 => " + meal);

        }

}
