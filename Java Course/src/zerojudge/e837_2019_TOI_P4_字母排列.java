package zerojudge;


import java.util.Scanner;

public class e837_2019_TOI_P4_字母排列 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.nextLine();

        int counter = 0 ;
        char pre = 0 ;
        int maxLength=0 ;
        int index = -1 ;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i) ;
            if( counter==0){
                pre=c;
                counter=1 ;
                continue;
            }
            if( pre == c-1 ){
                counter++ ;
            }else{
                if( counter>=maxLength){
                    maxLength=counter ;
                    index = i ;
                }
                counter=1 ;
            }
            pre = c ;
        }
        if( counter>=maxLength){
            maxLength=counter ;
            index = str.length() ;
        }
        System.out.println(maxLength+" "+str.substring(index-maxLength,index));

    }
}
