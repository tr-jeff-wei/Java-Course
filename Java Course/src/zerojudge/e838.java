package zerojudge;


import java.util.Scanner;

public class e838 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        sc.nextLine();
        boolean[] col = new boolean[n];
        boolean[] row = new boolean[n];
        for (int ri = 0; ri < n; ri++) {
            String s  = sc.nextLine();
            for (int ci = 0; ci < n; ci++) {
                char c =s.charAt(ci) ;
                if( c=='*'){
                    col[ci]=true;
                    row[ri]=true ;
                }
            }
        }

        for (int ri = 0; ri < n; ri++) {
            for (int ci = 0; ci < n; ci++) {
                if( row[ri] || col[ci]){
                    System.out.print("*");
                }else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }



    }
}
