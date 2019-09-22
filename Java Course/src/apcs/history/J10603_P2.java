package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class J10603_P2 {

    public static void main(String[] args) {

        String input = "10\n4 7 2 9 6 0 8 1 5 3\n"; // 答案 4
        input = "3\n0 2 1\n"; // 答案2

        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int[] friends = new int[n] ;
        for (int i = 0; i < n; i++) {
            friends[i] = sc.nextInt() ;
        }

        int groups = 0 ;
        for (int i = 0; i <friends.length ; i++) {
            int myFriend = friends[i] ;
            if( myFriend == -1 ){
                continue;
            }

            friends[i]=-1 ;  // -1 當作已經找過的記號
            while( myFriend!=i && myFriend != -1){
                int nextFriend = friends[myFriend] ;
                friends[myFriend] = -1 ;
                myFriend = nextFriend ;
            }
            groups=groups+1 ;
        }

        System.out.println(groups);
    }


}
