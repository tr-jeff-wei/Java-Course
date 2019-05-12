package homework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 使用分隔字串切割文字
 * 
 * @author chuan
 *
 */
public class am_apcs_test_string {


     public static void main(String[] args) {

          String test = "ABCD##EF##HIJ##KLMN";
          String del = "#";
          String[] arr = split( test,del);
          System.out.println(Arrays.toString(arr));

     }


     public static String[] split(String text, String delimiter) {
          ArrayList<String> arrList = new ArrayList<String>();
          int index = text.indexOf(delimiter);
          int wordIndex = 0;
          while (index != -1) {
               arrList.add(text.substring(wordIndex,index));
               wordIndex = index + delimiter.length();
               index = text.indexOf(delimiter, index + delimiter.length());
          }
          String[] arr = new String[arrList.size()];
          for (int i = 0; i < arrList.size(); i++)
               arr[i] = arrList.get(i);
          return arr;
     }
}
