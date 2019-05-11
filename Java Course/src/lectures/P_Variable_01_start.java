package lectures;

public class P_Variable_01_start {

        public static void main(String[] args) {

                System.out.println("-------------q00_assign_example-------------");
                q00_assign_example();
                System.out.println("-------------q00_assign-------------");
                q00_assign();

                System.out.println("-------------q01_overwrite_0-------------");
                q01_overwrite_0();
                System.out.println("-------------q01_overwrite_1-------------");
                q01_overwrite_1();

                System.out.println("-------------q02_exchange_0-------------");
                q02_exchange_0();
                System.out.println("-------------q02_exchange_1-------------");
                q02_exchange_1();
                System.out.println("-------------q02_exchange_2-------------");
                q02_exchange_2();
        }

        // 建立變數
        static void q00_assign_example() {

                String myName = "Frank";
                double javaScore = 75.7;
                int classes = 5;

                System.out.println(myName + "在" + classes + " 堂 java 課獲得總分 " + javaScore);
        }

        static void q00_assign() {

                // =====紀錄J eff 的學校成績 =====
                // 設定變數  name 存 Jeff
                // 設定變數［math］ 存 99.77
                // 設定變數［java］ 存  99.99
                // 設定變數［english］ 存  95.5
                // [印出] Jeff : math -> 99.77
                // [印出] Jeff : java -> 99.99
                // [印出] Jeff : english -> 95.5
        }

        // 變數複寫
        static void q01_overwrite_0() {

                int a = 2;
                int b = 3;
                int c = a;
                b = c;
                a = b;

                // a、b、c 各為多少
                System.out.println("a =" + a);
                System.out.println("b = " + b);
                System.out.println("c =" + c);

        }

        static void q01_overwrite_1() {

                String s1 = "A";
                String s2 = "B";
                String s3 = "C";

                s3 = s2;
                s2 = s1;
                s1 = s3;

                // s1、s2、s3 各為多少
                System.out.println("s1 =" + s1);
                System.out.println("s2 = " + s2);
                System.out.println("s3 =" + s3);

        }

        // 交換數字
        static void q02_exchange_0() {

                int jeff = 500;
                int john = 9999;

                int temp = 0;

                System.out.println("Jeff -> " + jeff);
                System.out.println("John -> " + john);

                // 執行交換（ jeff -> temp ,  john -> jeff  ,  temp -> john）
                //----------------------------------------------------------
                System.out.println("Jeff -> " + jeff);
                System.out.println("John -> " + john);
        }

        static void q02_exchange_1() {

                String top1 = "Jeff";
                String top2 = "Mary";
                String top3 = "Annie";
                String top4 = "Frank";
                String temp = "";

                // 運用 temp，交換名次。Jeff 到最後一名，其他按照順序往前升一名
                System.out.println("top 1 ->" + top1);

                System.out.println("top 2 ->" + top2);
                System.out.println("top 3 ->" + top3);
                System.out.println("top 4 ->" + top4);

        }

        static void q02_exchange_2() {

                String top1 = "Jeff";
                String top2 = "Mary";
                String top3 = "Annie";
                String top4 = "Frank";
                String temp = "";

                // 運用 temp，交換名次。
                // 把排名顛倒， Frank -> Annie -> Mary -> Jeff
                System.out.println("top 1 ->" + top1);

                System.out.println("top 2 ->" + top2);
                System.out.println("top 3 ->" + top3);
                System.out.println("top 4 ->" + top4);

        }

}
