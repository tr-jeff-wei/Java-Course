package lectures;

public class P_Variable_03_operator_accumulate {

        public static void main(String[] args) {

                System.out.println("------------q00_int_0------------");
                q00_int_0();

                System.out.println("------------q00_int_1------------");
                q00_int_1();

                System.out.println("------------q00_int_2------------");
                q00_int_2();

                System.out.println("------------q00_int_3------------");
                q00_int_3();

                System.out.println("------------q00_int_4------------");
                q00_int_4();

                System.out.println("------------q01_string_0------------");
                q01_string_0();

                System.out.println("------------q01_string_1------------");
                q01_string_1();

                System.out.println("------------q01_string_2------------");
                q01_string_2();
        }

        // 數字累加
        static void q00_int_0() {

                int a = 11;
                int b = 22;
                int c = 33;

                int result = 0;
                result = result + a;
                result = result + b;
                result = result + c;

//                System.out.println("a -> " + a);
//                System.out.println("b -> " + b);
//                System.out.println("c -> " + c);
//                System.out.println("result -> " + result);
        }

        static void q00_int_1() {

                // 思考程式會印出那些結果
                int result = 0;

//                System.out.println(result + 1);  // ?
                result = result + 2;

                int c = result + 3;
//                System.out.println("result -> " + result);  // ?

                result = result + c;
                //System.out.println("result -> " + result); //?
        }

        static void q00_int_2() {

                // 思考程式會印出那些結果
                int result = 3;

                result = result + 1;
                result = result + 2;
                result = result + 3;

                //System.out.println("result -> " + result); // ?
        }

        static void q00_int_3() {

                // 思考程式會印出那些結果
                int result = 3;

                result = result + result;
                result = result + result;
                result = result + result;

                //System.out.println("result -> " + result); // ?
        }

        static void q00_int_4() {

                // 將每一科分數加入 total
                int total = 0;

                // 加入英文
                int english = 90;
                // total = ? 

                // 加入數學
                int math = 89;
                // total = ?

                // 加入自然
                int science = 94;
                // total =?

                System.out.println("總分 -> " + total);

        }

        // 字串累加
        static void q01_string_0() {

                String t1 = "A";
                String t2 = "B";
                String t3 = "C";

                String result = "";

                result = result + t1;
                System.out.println("result -> " + result);

                result = result + t2;
                System.out.println("result -> " + result);

                result = result + t3;
                System.out.println("result -> " + result);
        }

        static void q01_string_1() {

                String tmp = "+==";
                tmp = tmp + tmp;
                tmp = tmp + tmp;
                tmp = tmp + tmp;

                // tmp 最後的結果是什麼？
                // System.out.println("tmp -> "+tmp);
        }

        static void q01_string_2() {

                int n = 1;
                String seq = "";

                seq = n + ",";    //   1,
                n = n + 1;

                seq = seq + n + ","; // 1,2,
                n = n + 1;

                seq = seq + n + ","; // 1,2,3,
                n = n + 1;

                // ....
                // 仿造上面規則完成程式
                // 最後印出『 1,2,3,4,5#5,4,3,2,1』                
                System.out.println(seq);

        }

}
