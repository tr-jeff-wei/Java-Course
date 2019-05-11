package lectures;

public class P_Array_05_access_for_SUM {

        public static void main(String[] args) {
                concatString();
                sumItems();
        }

        public static void concatString() {

                String[] target = new String[15];
                target[0] = "A";
                target[1] = "B";
                target[2] = "C";
                target[3] = "D";
                target[4] = "E";
                target[5] = "0000";
                target[6] = "UU";
                target[7] = "^____^";
                target[8] = "UU";
                target[9] = "0000";
                target[10] = "E";
                target[11] = "D";
                target[12] = "C";
                target[13] = "B";
                target[14] = "A";

                String result = "";

                // 1. 使用 for 簡便取法把 target 陣列的每一個元素取出
                //    用 result 變數將全部元素內容按順序串接起來  
                System.out.println(result);
        }

        public static void sumItems() {
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

                int total = 0;
                // 2. 使用 for 簡便取法把 scores 陣列的每一個元素取出
                //    用 total 變數將全部元素加起來          

                System.out.println(total);

        }

}
