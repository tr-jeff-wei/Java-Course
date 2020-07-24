package zerojudge;

import java.util.Arrays;
import java.util.Scanner;

public class b231_TOI2009_第三題_書 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Book[] books = new Book[n];
            for (int i = 0; i < n; i++) {
                  books[i] = new Book();
                  books[i].printTime = sc.nextInt() ;
                  books[i].colTime = sc.nextInt() ;
            }
            
            int totalPrint = 0 ;
            int maxTime = 0 ;
            
            Arrays.sort(books);
            for (Book book : books) {
                  //book.show();
                  totalPrint = totalPrint + book.printTime ;
                  
                  int totalTime = totalPrint+book.colTime ;
                  if( totalTime > maxTime){
                        maxTime = totalTime ;
                  }     
            }
            
            System.out.println(maxTime);
      }
}

class Book implements Comparable<Book> {

      int printTime;
      int colTime;

      @Override
      public int compareTo(Book o) {
            return o.colTime - this.colTime;
      }
      public void show(){
            System.out.println("pt:"+printTime+"  ct:"+colTime);
      }
}
