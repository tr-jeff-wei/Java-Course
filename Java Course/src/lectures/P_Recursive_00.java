package lectures;

public class P_Recursive_00 {

        public static void main(String[] args) {
//                rc01();
//                rc02() ;
//                rc03();
//                   rc04() ;
                rc05();
        }

        /**
         * 加總
         */
        public static void rc01() {

                int[] arr = new int[]{4, 2, 5, 8, 1};
                int total = addAll(arr, 0, 0);
                System.out.println("[rc01] total -> " + total);
        }

        public static int addAll(int[] target, int index, int total) {

                // 加入現在的
                total = total + target[index];

                // 看看是否還有下一個可以加
                if (index + 1 < target.length) {
                        // 有 -> 往下加
                        return addAll(target, index + 1, total);
                } else {
                        // 沒有 -> 把現在結果放回去
                        return total;
                }
        }

        /**
         * 找目標
         */
        public static void rc02() {

                int[] arr = new int[]{4, 2, 5, 8, 1};
                int target = 7;
                int result = findTarget(arr, 0, target);
                System.out.println("[rc02] " + target + "  ?   ==>  結果：" + result);

                target = 5;
                result = findTarget(arr, 0, target);
                System.out.println("[rc02] " + target + "  ?   ==>  結果：" + result);

        }

        public static int findTarget(int[] testArray, int index, int target) {

                // 檢查現在的
                if (testArray[index] == target) {
                        return index;
                } else {
                        // 現在的不是，如果還有下一個，找下一個
                        if (index + 1 < testArray.length) {
                                return findTarget(testArray, index + 1, target);
                        } else {
                                // 沒有下一個，回覆"沒有"狀態  -1
                                return -1;
                        }

                }

        }

        /**
         * 傻人找錢法
         */
        public static void rc03() {
                int number = 1234;
                System.out.println("Number is " + number);
                coins(number);
        }

        public static void coins(int total) {

                if (total >= 1000) {
                        System.out.println("1000        x 1 ");
                        coins(total - 1000);
                } else if (total >= 100) {
                        System.out.println(" 100        x 1 ");
                        coins(total - 100);
                } else if (total >= 10) {
                        System.out.println("  10        x 1 ");
                        coins(total - 10);
                } else if (total >= 5) {
                        System.out.println("   5        x 1 ");
                        coins(total - 5);
                } else if (total >= 1) {
                        System.out.println("   1        x 1 ");
                        coins(total - 1);
                }

        }

        /**
         * 9x9 乘法表
         */
        public static void rc04() {

                showTable(2, 1);
        }

        public static void showTable(int n1, int n2) {

                System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));

                if (n2 < 9) {
                        showTable(n1, n2 + 1);
                } else {

                        if (n1 < 9) {
                                showTable(n1 + 1, 1);
                        } else {
                                // n1 --> 10  , n2 --> 9
                                return;
                        }

                }
        }

        /**
         * 曉華有 4 種玩具：以 ABCD 代表 每天都可以選一種玩（重複沒關係） 請問經過 3 天 曉華這三天所有不同的玩法
         */
        public static void rc05() {
                play("");
        }

        public static void play(String history) {

                if (history.length() < 3) {
                        play(history + "A");
                        play(history + "B");
                        play(history + "C");
                        play(history + "D");

                }
                if (history.length() == 3) {
                        System.out.println("play -> " + history);
                }
        }

}
