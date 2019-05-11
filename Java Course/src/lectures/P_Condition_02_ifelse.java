package lectures;

public class P_Condition_02_ifelse {

        public static void main(String[] args) {

                System.out.println("Start ---------------");
                System.out.println("[q01] ---------------");
                q01(8);
                q01(10);
                q01(13);
                System.out.println("[q01] ---------------End");
                System.out.println("[q02] ---------------");
                q02(30);
                q02(50);
                q02(70);
                q02(90);
                System.out.println("[q02] ---------------End");

                System.out.println("End ---------------");
        }

        /**
         * 寫出下列條件式 time 是 100m 競賽的時間 用程式分出下列階層 1. 少於 9 秒 --> 印出『突破世界紀錄』 2. 9~11
         * 秒 --> 印出『國家級選手』 3. 11~12秒 --> 印出『表現優良』 4. 超過12秒 --> 印出『水準一般』
         */
        private static void q01(int time) {

                System.out.println("選手秒數：" + time);

                // ....
                System.out.println("突破世界紀錄");
                System.out.println("國家級選手");
                System.out.println("表現優良");
                System.out.println("水準一般");
        }

        /**
         * 運動大會投球趣味競賽 只要投中 50 分以上 ==> 大會頒發『參加獎一份』 少於 50 分 ==> 大會廣播加油『再接再厲』 投中 80
         * 分以上 ==> 大會頒發『高手獎一份』 ==> 嘗試以 30、50、70、 90 分測試程式
         */
        private static void q02(int score) {

                System.out.println("分數：" + score);

                System.out.println("參加獎一份");
                System.out.println("再接再厲");
                System.out.println("高手獎一份");

        }

}
