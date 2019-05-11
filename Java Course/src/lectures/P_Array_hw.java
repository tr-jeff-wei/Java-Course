package lectures;

import java.util.Arrays;

public class P_Array_hw {

        public static void main(String[] args) {
                q01() ;
        }

        public static void q01() {

                int[] arr1 = new int[5];
                arr1[0] = 45;
                arr1[1] = 54;
                arr1[2] = 23;
                arr1[3] = 15;
                arr1[4] = 35;

                for (int i = 0; i < arr1.length - 3; i++) {
                        int min = arr1[i + 1];
                        int minIdx = i+1 ;
                        for (int j = i + 1; j < arr1.length; j++) {
                                if (arr1[j] < min) {
                                        min = arr1[j];
                                        minIdx = j ;
                                }
                        }
                        if (min < arr1[i]) {
                                int tmp = arr1[i] ;
                                arr1[i]= arr1[minIdx] ;
                                arr1[minIdx] = tmp ;
                        }
                }
                
                System.out.println(Arrays.toString( arr1));

        }

}
