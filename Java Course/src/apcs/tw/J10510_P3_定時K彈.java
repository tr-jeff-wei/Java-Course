package apcs.tw;

import java.util.ArrayList;
import java.util.Scanner;

public class J10510_P3_定時K彈 {


//    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

//        String input = "5 2 4\n";
//       // input = "8 3 6\n";
//
//        InputStream is = new ByteArrayInputStream(input.getBytes());
//        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int start = 0;
        int target = -1;
        int last = -1;
        for (int i = 0; i < K; i++) {
            target = (start + M - 1) % list.size();
            last = list.remove(target);
            start = target % list.size();
        }


        System.out.println(list.get(start));


    }

}
