package apcs.history;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class J10610_P4_物件堆疊 {

    public static void main(String[] args) throws IOException {

        BufferedReader buf =  new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(buf.readLine().trim());
        Box[] boxes = new Box[n] ;
        StringTokenizer st = new StringTokenizer(buf.readLine()) ;
        for (int i = 0; i < n; i++) {
            boxes[i] = new Box();
            boxes[i].weight = Integer.parseInt(st.nextToken().trim()) ;
        }
        st = new StringTokenizer(buf.readLine()) ;
        for (int i = 0; i < n; i++) {
            boxes[i].quantity = Integer.parseInt(st.nextToken().trim()) ;
        }
        Arrays.sort(boxes, new Comparator<Box>() {
            @Override
            public int compare(Box b1, Box b2) {
                return b2.quantity*b1.weight-b1.quantity*b2.weight ;
            }
        });

        long totalUpperWeight = 0;
        long totalCost = 0 ;
        for (Box box : boxes) {
//            System.out.println(box.weight+" "+box.quantity);
            totalCost+=box.quantity*totalUpperWeight ;
            totalUpperWeight+=box.weight ;
        }
        System.out.println(totalCost);
    }
}
class Box{
    int weight ;
    int quantity ;
}