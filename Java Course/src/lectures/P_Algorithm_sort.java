package lectures;

import java.util.Arrays;

public class P_Algorithm_sort {

     
     public static void main(String[] args) {
          int[] test = new int[] {2,5,3,6,9,1} ;
          insertionSort(test);
          System.out.println(Arrays.toString(test));
     }
     
     public static void insertionSort(int[] arr) {
          
          for (int i = 1; i < arr.length; i++) {
               int index = i ;
               while( index>0 && arr[index]>arr[index-1]) {
                    swap( arr , index , index-1 ) ;
                    index-- ;
               }
          }
          
     }
     
     public static void selectionSort(int[] arr) {
          
     }
     
     public static void swap( int[] arr , int m , int n) {
          int tmp = arr[m] ;
          arr[m] = arr[n] ;
          arr[n] = tmp ;
     }
}
