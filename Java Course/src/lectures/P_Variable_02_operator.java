package lectures;

public class P_Variable_02_operator {

        public static void main(String[] args) {

                System.out.println("------------q00_Math_example------------");
                q00_Math_example();
                System.out.println("------------q00_Math_0------------");
                q00_Math_0();
                System.out.println("------------q00_Math_1------------");
                q00_Math_1();
                System.out.println("------------q00_Math_2------------");
                q00_Math_2();

                System.out.println("------------q01_remainder_0------------");
                q01_remainder_0();
                System.out.println("------------q01_remainder_1------------");
                q01_remainder_1();
                System.out.println("------------q01_remainder_2------------");
                q01_remainder_2();
                System.out.println("------------q01_remainder_3------------");
                q01_remainder_3();
                
                
                
                System.out.println("------------q02_string_0------------");
                q02_string_0();
                System.out.println("------------q02_string_1------------");
                q02_string_1();
                System.out.println("------------q02_string_2------------");
                q02_string_2();

        }

        // 一般運算
        static void q00_Math_example() {

                // 麵包師傅 1 天做 70 個麵包，每個賣 37 元
                // 15 天能賣出多少元？
                int cost = 37;
                int n = 70;
                int days = 15;
                int total = cost * n * days;

                System.out.println("能賣出 " + total);
        }

        static void q00_Math_0() {

                // 福袋有糖果 x 5、鉛筆x20、滑鼠 x 3
                // 要準備 500 個福袋，要花多少錢
                // 糖果 8 元
                // int candy =  ; 
                // 鉛筆 6 元
                // int pencil =  ;
                // 滑鼠 210 元
                // int mouse =  ;               
                // 總價 
                // int total = ?
        }

        static void q00_Math_1() {

                // 注意：答案有小數點
                // 28 公斤的麵粉，要做出 40 個麵包
                // 請問每個麵包可以用多少公斤的麵粉？
        }

        static void q00_Math_2() {

                // 注意：除法運算
                int x1 = 5;
                double x2 = 5;

                double a1 = x1 / 2;
                double a2 = x2 / 2;

                System.out.println(a1);
                System.out.println(a2);

        }

        // 餘數運算
        static void q01_remainder_0() {

                // 餘數計算
                int a = 10 % 2;
                int b = 10 % 3;
                int c = 10 % 4;

                System.out.println("餘數 % 計算 >> ");
                System.out.println("10 % 2" + a);
                System.out.println("10 % 3" + b);
                System.out.println("10 % 4" + c);

        }

        static void q01_remainder_1() {

                // 循環很好用：點點名
                // A、B、C、D、E  五個人
                // 數支數支點名，由 A開始，怎麼用算的？
                int remainder = 0;
                int n = 0;

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

                n = n + 1;
                remainder = n % 5;
                System.out.println("數到 " + n + " 支，是 " + remainder);

        }

        static void q01_remainder_2() {
                // 運用餘數循環規則，進行分組
                // 班上有 14 位同學， 1~20 號
                // 如果運用座號除以 3 的餘數進行分組
                // 請列出各座號的組別
                // 額外問題：請問可以分幾組？每組有多少人？

                int no = 1;
                int group = no % 3;
                System.out.println("座號 " + no + " 是屬於組別 -> " + group);

                no = no + 1;
                group = no % 3;
                System.out.println("座號 " + no + " 是屬於組別 -> " + group);

                no = no + 1;
                group = no % 3;
                System.out.println("座號 " + no + " 是屬於組別 -> " + group);

                // 
        }

        static void q01_remainder_3() {
                // 運用餘數循環規則
                // 假設今天是星期四，往後的 1717 天，會是星期幾？:
                // 可以先列舉近日的規則，觀察，再計算
                //  ex . 往後　1 天 --> 五 ，  2 天 --> 六， 3 天 --> 日 ....
        }

        // 字串串接 - 整數陷阱
        static void q02_string_0() {
                String t1 = "n1";
                String t2 = "n2";
                int n1 = 10;
                int n2 = 20;

                String result1 = t1 + "+" + t2 + " = " + n1 + n2;
                System.out.println(result1);
                String result2 = t1 + "+" + t2 + " = " + (n1 + n2);
                System.out.println(result2);

        }

        static void q02_string_1() {
                // 串接急轉彎：請運用下列變數，完成串接字串
                String n = "u";
                String u = "n";
                String a = "e";
                String e = "a";
                String q = "p";
                String p = "q";
                String b = "d";
                String d = "b";
                String h = "y";
                String y = "h";
                String k = "f";
                String f = "k";
                String o = "c";
                String c = "o";

                // ex. 印出 enhance
                String result = a + u + y + e + u + o + a;
                System.out.println(result);

                // 印出  happy
                result = "";
                System.out.println(result);

                // 印出 book
                result = "";
                System.out.println(result);

                // 印出 fan
                result = "";
                System.out.println(result);

                // 印出 opaque
                result = "";
                System.out.println(result);

        }

        static void q02_string_2() {
                // 是誰吃了巧克力 ?
                String a = "Jeff";
                String b = "Mary";
                String c = "Peter";
                String d = "巧克力";

                b = a;
                a = d;
                c = b;

                System.out.println(d + "吃了" + c);

        }
}
