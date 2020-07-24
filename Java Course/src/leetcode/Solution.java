package leetcode;




import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {

      public static void main(String[] args) {
           String s =  arrangeWords("Keep calm and code on") ;
            System.out.println(s);
      }
      
      
      public static String arrangeWords(String text) {

            String[] tokens = text.split(" ");
            List<Token> list = new ArrayList<Token>();
            for (int i = 0; i < tokens.length; i++) {                  
                  list.add(  new Token( tokens[i] , i) ) ;
            }
            Collections.sort(list);
            
            StringBuilder sb = new StringBuilder();
            for (Token token : list) {
                  if(sb.length()==0){
                        sb.append(token.s.substring(0,1).toUpperCase()).append(token.s.substring(1)) ;
                  }else{
                        sb.append(token.s.toLowerCase());
                  }
                  sb.append(" ") ;
            }
            
            return sb.toString().trim() ;
      }
}
class Token implements Comparable<Token>{
      String s ;
      int idx ;
      
      Token(String is , int i ){
            s = is ;
            idx = i ;
      }

      @Override
      public int compareTo(Token o) {
           if( this.s.length()==o.s.length()){
                 return this.idx - o.idx ;
           }else{
                 return this.s.length()-o.s.length() ;
           }
      }
      
      public String toString(){
            return s+" >>" +idx ;
      }
      
}