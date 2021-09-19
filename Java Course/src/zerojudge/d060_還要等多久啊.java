import java.util.Scanner;

public class d060_還要等多久啊 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;
        int m = sc.nextInt();

        if( m<25 ){
            // <25
            System.out.println(25-m);
        }else if( m>25){
            // >25
            System.out.println(60 + 25 - m);
        }else{ 
            // == 25           
            System.out.println(0);
        }
    }
}
