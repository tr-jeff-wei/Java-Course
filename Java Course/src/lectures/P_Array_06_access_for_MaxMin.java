package lectures;

public class P_Array_06_access_for_MaxMin {

        public static void main(String[] args) {

                findItemMax();
                findItemMin();
                findItemRange();
        }

        public static void findItemMax() {
                int[] scores = new int[15];
                scores[0] = 32;
                scores[1] = 72;
                scores[2] = 54;
                scores[3] = 34;
                scores[4] = 45;
                scores[5] = 54;
                scores[6] = 34;
                scores[7] = 26;
                scores[8] = 54;
                scores[9] = 23;
                scores[10] = 21;
                scores[11] = 46;
                scores[12] = 92;
                scores[13] = 23;
                scores[14] = 65;

                // 用 for 檢查每一個元素找到最大值，把最大值印出來
                int max = 1000000; // 這裡要改喔！     

                System.out.println("max->" + max);

        }

        public static void findItemMin() {
                int[] scores = new int[15];
                scores[0] = 32;
                scores[1] = 72;
                scores[2] = 54;
                scores[3] = 34;
                scores[4] = 45;
                scores[5] = 54;
                scores[6] = 34;
                scores[7] = 26;
                scores[8] = 54;
                scores[9] = 23;
                scores[10] = 21;
                scores[11] = 46;
                scores[12] = 92;
                scores[13] = 23;
                scores[14] = 65;

                // 用 for 檢查每一個元素找到最小值，把最小值印出來
                int min = 0; // 這裡要改喔！     

                System.out.println("min->" + min);
        }

        public static void findItemRange() {

                int[] scores = new int[15];
                scores[0] = 32;
                scores[1] = 92;
                scores[2] = 54;
                scores[3] = 34;
                scores[4] = 95;
                scores[5] = 14;
                scores[6] = 34;
                scores[7] = 26;
                scores[8] = 54;
                scores[9] = 23;
                scores[10] = 11;
                scores[11] = 46;
                scores[12] = 92;
                scores[13] = 23;
                scores[14] = 65;

                // 用 for 檢查每一個元素找到最大值、與最小值
                // 然後算出最大與最小的差距，印出來
                int range = 0;

                System.out.println("range->" + range);

        }

}
