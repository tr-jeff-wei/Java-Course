package zerojudge;

import java.util.Scanner;

public class a010_因數分解 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            StringBuilder sb = new StringBuilder();
            int ori = sc.nextInt();
            int n = ori ;
            int maxN = n/2+1 ;
            for (int i = 2; i < maxN; i++) {
                if( i>n){
                    break ;
                }

                int c= 0 ;
                while ( n%i==0){
                    c++;
                    n/=i;
                }

                if( c==0){
                    continue;
                }
                if(sb.length()>0){
                      sb.append(" * ");
                }
                if( c==1){
                    sb.append(i) ;
                }else{
                    sb.append(i+"^"+c) ;
                }
            }
            if( sb.length()==0){
                System.out.println(ori);
            }else{
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
}
