import java.util.Scanner;

public class d049_中華民國萬歲{
    public static void main(String[] args) {
        
        // 建立掃描器
        Scanner s = new Scanner(System.in) ;

        // 利用掃描器，抓一個數字 s.nextInt()
        // 放到 year
        int year = s.nextInt() ;
        int mYear= year -1911 ;

        System.out.println(mYear);
    }

}