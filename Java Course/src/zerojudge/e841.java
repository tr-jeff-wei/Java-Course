package zerojudge;


import java.util.Scanner;

public class e841 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nBox = sc.nextInt();
        int nM = sc.nextInt();

        long[] box  = new long[nBox+ 2];
        long[] multi = new long[nBox + 2];
        long[] div   = new long[nBox + 2];

        for (int i = 0; i < multi.length; i++) {
            multi[i] = 1;
            div[i] = 1;
        }

        for (int i = 0; i < nM; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            long s = sc.nextLong();

            if (r == 1){
                box[p]  += s ;
                box[q+1]-= s ;
            } else if (r == 2){
                multi[p] *= s ;
                div[q+1] *= s ;
            }
        }

        long max = -1;
        int maxIdx = -1;
        long times = 1 ;
        long base = 0 ;
        for (int i = 1; i <= nBox; i++) {
            base += box[i] ;
            if( times < div[i] ){
                times*= multi[i];
                times/= div[i] ;
            }else{
                times/= div[i] ;
                times*= multi[i];
            }

            long sum = base*times ;
            if (sum > max) {
                max = sum;
                maxIdx = i;
            }
        }

        System.out.println(maxIdx + " " + max);


    }

}
