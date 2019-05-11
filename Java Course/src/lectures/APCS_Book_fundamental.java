package lectures;


public class APCS_Book_fundamental {

        public static void main(String[] args) {
                //q04() ;
                //q05() ;
                //q05_1();
                q06(7);
        }

        static void q04() {

                int num1 = 9;
                int num2 = 5;
                if (num1 > num2) {

                        System.out.println((num1 + num2) % num2);

                } else {

                        System.out.println((num1 - num2) % num2);

                }

        }

        /**
         *
         * x = x + 3 ;
         * x+=3 ;
         *
         * x = x -5 ; x -= 5 ;
         *
         * x = x * 2 ;
         * x *= 2 ;
         *
         * x = x/3 ; x /= 3 ;
         *
         */
        static void q05() {

                int count = 5;
                for (int i = 3; i < 7; i = i + 2) {

                        count += i;

                }

                System.out.println(count);

        }

        static void q05_1() {

                int count = 6;
                int count2 = 1;

                for (; count > 0; count -= 2) {
                        count += count2;
                }

                System.out.println(count);

        }

        // initValue = ?   ==>    value->1
        static void q06(int initValue) {

                int value = initValue;
                if (value > 10) {
                        if (value > 15) {
                                value = 0;
                        } else {
                                value = 1;
                        }
                }
                System.out.println("value = " + value);

        }

}
