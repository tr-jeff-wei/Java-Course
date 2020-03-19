package apcs.history;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class J10806_P4_美麗的彩帶 {


    static int perfectLen;
    static int bandLength;
    static long perfectCount = 0;
    static HashMap<String,Integer> perfectSet = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)) ;

        String[] l1 = buf.readLine().split(" ");
        perfectLen = Integer.parseInt(l1[0]);
        bandLength = Integer.parseInt(l1[1]);
        String[] band = buf.readLine().split(" ");

        for (int i = 0; i < perfectLen; i++) {
            add(band[i]);
        }
        if (perfectSet.size() == perfectLen) {
            perfectCount++;
        }
        for (int i = perfectLen; i < band.length; i++) {
            remove(band[i - perfectLen]);
           add(band[i]);
            if (perfectSet.size() == perfectLen) {
                perfectCount++;
            }
        }
        System.out.println(perfectCount);
    }

    public static void add( String a ){
        if( perfectSet.containsKey(a)){
            perfectSet.put(a,perfectSet.get(a)+1) ;
        }else{
            perfectSet.put(a,1) ;
        }
    }
    public static void remove( String a ){
        if( perfectSet.get(a)<=1){
            perfectSet.remove(a) ;
        }else{
            perfectSet.put(a,perfectSet.get(a)-1) ;
        }
    }
}
