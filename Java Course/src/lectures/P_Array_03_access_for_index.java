package lectures;

public class P_Array_03_access_for_index {

        public static void main(String[] args) {

                showArray();

        }

        public static void showArray() {

                String[] target = new String[5];
                target[0] = "A";
                target[1] = "B";
                target[2] = "C";
                target[3] = "D";
                target[4] = "E";

                // 1. 使用 for 把 target 陣列的每一個元素
                //    用 System.out.print() 從頭到尾依序印出內容 ABCDE 
                System.out.println();  // 換行

                // 2. 使用 for 把 target 陣列的每一個元素
                //    用 System.out.print() 從尾到頭反向印出內容 EDCBA          
        }
}
