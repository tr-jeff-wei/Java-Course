package lectures;

import java.util.Arrays;


public class P_ {

        public static void q5() {

                int[] x = new int[14];

                for (int i = 0; i < x.length; i++) {
                        x[i] = i + 1;
                }

                for (int i = 0; i < x.length; i++) {
                        if (x[i] % 5 == 0) {
                                x[i] = x[i] - x[i];
                        }
                        if (x[i] % 3 == 0) {
                                x[i] = 333;
                        }
                }
                
                System.out.println(Arrays.toString(x));

        }

        public static void q6() {

                int[] x = new int[14];

                for (int i = 0; i < x.length; i++) {
                        x[i] = i + 1;
                }

                for (int i = 0; i < x.length; i++) {
                        if (x[i] % 2 == 0) {
                                x[i] = 0;
                        }
                        if (x[i] % 3 == 0) {
                                x[i] = x[i] + 600;
                        }
                }
                
                   
                System.out.println(Arrays.toString(x));

        }

        public static void main(String[] args) {
                q6();
        }
}
