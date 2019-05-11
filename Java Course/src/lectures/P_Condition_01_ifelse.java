package lectures;

public class P_Condition_01_ifelse {

        static void if_0() {

                boolean 還有體力 = true;
                boolean 大障礙 = false;

                if (還有體力) {
                        System.out.println("衝 3 秒");
                }

                System.out.println("休 5 秒");

                if (大障礙) {
                        System.out.println("減速");
                } else {
                        System.out.println("加速");
                }

                // ［問題］會出現哪些訊息？
                // ［問題］繪出流程圖
        }

        static void if_1() {

                boolean 不餓 = false;
                boolean 吃麵包 = true;
                boolean 有錢 = true;
                boolean 吃漢堡 = true;

                if (不餓) {
                        System.out.println("先睡覺");
                } else if (吃麵包) {
                        System.out.println("選麵包");
                        if (有錢) {
                                System.out.println("買麵包");
                        }
                } else if (吃漢堡) {
                        System.out.println("喜歡麥當當");
                } else {
                        System.out.println("找不到吃的");
                }

                // ［問題］會出現哪些訊息？
                // ［問題］繪出流程圖
        }

        static void if_2() {

                boolean 發現寶藏 = false;
                boolean 有敵人 = true;

                if (發現寶藏) {

                        if (有敵人) {
                                System.out.println("停止行動");
                        } else {
                                System.out.println("取寶藏");
                        }

                } else {

                        System.out.println("繼續找");

                }

                // ［問題］會出現哪些訊息？
                // ［問題］繪出流程圖
        }

        static void if_3() {

                // 寫出下列邏輯
                // 如果「被攻擊」，要馬上進行「防守」
                // 當沒有「被攻擊」時，可以「前進」。同時如果發現『有敵人』進行「攻擊」
                boolean 有敵人 = true; // false 
                boolean 被攻擊 = true; // false                  

                System.out.println("攻擊");
                System.out.println("防守");
                System.out.println("前進");
        }

        static void if_4() {

                // 如果「綠燈」要「前進」
                // 否則要「停車」                
                // 如果在「前進」的時候看到「危險」要「緊急煞車」
                boolean 綠燈 = true;
                boolean 危險 = false;

                System.out.println("前進");
                System.out.println("停車");
                System.out.println("緊急煞車");

        }
        
        static void if_5(){
                
                // 如果「肚子不餓」就「不吃東西」
                // 如果「有商店」 就看如果「有餅乾」就「買牛奶和餅乾」，
                // 否則就看「有炸雞」就「買炸雞和汽水」
                // （炸雞、餅乾在商店裡）
                // 如果沒有商店，就「先回家」
                
                boolean 肚子餓 = false ;
                boolean 有商店 = true ;
                boolean 有餅乾 = true ;
                boolean 有炸雞 = true ;
                
                
                System.out.println("不吃東西");
                System.out.println("買牛奶和餅乾");
                System.out.println("買炸雞和汽水");
                System.out.println("先回家");
                
                
        }
}
