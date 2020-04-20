/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.tw;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class J10810_P1_王牌投手 {
      
      public static void main(String[] args) {
            
            String data = "2\n" +
"3 5000 3000 5000 2000 1000 500 400 300 100 400\n" +
"6 200 1000 200 105 500 999 300 200 190 200\n" ;
            
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            
            Scanner sc = new Scanner(System.in) ;
            int n = sc.nextInt();
            sc.nextLine();
            int total = 0 ;
            int firstCount = 0 ;
            for (int i = 0; i < n; i++) {
                  String[] tokens = sc.nextLine().split(" ");
                  int k = Integer.parseInt(tokens[0]) ;
                  int prize = Integer.parseInt(tokens[k]) ;
                  total+=prize;
                  boolean first = true ;
                  for (int j = 1; j < tokens.length; j++) {
                        if( j==k ){
                              continue ;
                        }
                        String token = tokens[j];
                        if( Integer.parseInt(token)>prize){
                              first=false ;
                              break ;
                        }
                  }
                  if( first){
                        firstCount++ ;
                  }
            }
            System.out.println(total);
            System.out.println(firstCount);
            
      }      
}
