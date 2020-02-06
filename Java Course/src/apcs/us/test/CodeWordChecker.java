package apcs.us.test;

// 2018_Q3
public class CodeWordChecker {

    private int min ;
    private int max ;
    private String notAllowed ;

    public CodeWordChecker(String notAllowed){
        this.min = 6 ;
        this.max = 20 ;
        this.notAllowed = notAllowed ;
    }

    public CodeWordChecker(int min , int max , String notAllowed ){
        this.min = min ;
        this.max = max ;
        this.notAllowed = notAllowed ;
    }

    boolean isValid(String str){
        if( str.length() > max || str.length() < min || str.indexOf(notAllowed) != -1 ){
            return false ;
        }
        return true ;
    }

    public static void main(String[] args) {
        CodeWordChecker cwc = new CodeWordChecker(5,8,"$") ;
        System.out.println();
    }

}
