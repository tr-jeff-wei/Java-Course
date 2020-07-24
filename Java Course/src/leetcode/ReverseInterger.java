package leetcode;

public class ReverseInterger {

   
    public int reverse(int x) {
        //int x = 1534236469;
        int digit;
        long reversed = 0;

        while(x != 0) {
            digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        
        if (reversed >= Math.pow(-2, 31) && reversed <= Math.pow(2, 31)){
            return (int)reversed ;
        } else {
            return 0 ;
        }
        
        
    
}
}

