import java.util.Scanner;
public class d050_妳那裡現在幾點了 {

    public static void main(String[] args) {

        // 建立掃描器
        Scanner s = new Scanner(System.in);

        // 利用掃描器，抓一個數字 s.nextInt()
        // 放到 time
        int time = s.nextInt();
        int us = time-15;
        if( us < 0){
            us = us +24 ;
        }

        System.out.println(us);
    }
    
}
