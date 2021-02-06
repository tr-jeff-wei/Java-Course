package zerojudge;

import java.util.ArrayList;
import java.util.Scanner;

public class b523_先別管這個了你聽過安麗嗎 {

      public static void main(String[] args) {
            
            ArrayList<String> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in) ;
            while(sc.hasNext()){
                  String s = sc.nextLine() ;
                  if( list.contains(s)){
                        System.out.println("YES");
                  }else{
                        System.out.println("NO");
                        list.add(s) ;
                  }
            }
            sc.close();
      }
}
