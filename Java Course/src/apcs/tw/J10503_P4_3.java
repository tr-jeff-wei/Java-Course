package apcs.tw;
//實作概念：
//        建構關聯樹（每個節點紀錄下一層的關聯節點與父節點）。使用 DFS 進行節點走訪。
//        因為 DFS 的特性，在走訪過程，可以由葉節點，往回累計由葉節點回推的深度。
//
//        在每個節點 i 紀錄該節點向下延伸最長的兩段長度和 D(i) = top1Length(i)+top2Length(i)。
//
//        該題答案要找的答案，就是所有節點中最大的長度和   max( D(i) )
//
//        1. 本題一開始使用函式遞迴實作 DFS ，在測資4 ，因為呼叫太多層會引發 StackOverflowError 問題。
//        解法：使用 Stack 堆疊 + 迴圈實作 DFS，不用遞迴函示實作。
//        2. 測資 4 ，使用 Scanner 讀取資料會遇到 TLE 問題。
//        解法：在讀取資料改用 BufferedReader 會快很多。



import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class J10503_P4_3 {

    static int finalMax;

    public static void main(String[] args) throws IOException {
//        String input = "8\n" +
//                "0 1\n" +
//                "0 2\n" +
//                "0 3\n" +
//                "7 0\n" +
//                "1 4\n" +
//                "1 5\n" +
//                "3 6\n" +
//                "4\n" +
//                //  String input =
//                "0 1\n" +
//                "0 2\n" +
//                "2 3\n";
//
//
//        InputStream is = new ByteArrayInputStream(input.getBytes());
//        System.setIn(is);


        //Scanner sc = new Scanner(System.in);

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        while (s!=null && s.length()>0) {
            finalMax = 0;
            int inputNum = Integer.parseInt(s);

            // 先建立每位成員的資料
            Member[] members = new Member[inputNum];
            for (int i = 0; i < inputNum; i++) {
                members[i] = new Member();
                members[i].id = i;
            }

            // 讀取資料，建立每位人員的關聯
            for (int i = 0; i < inputNum - 1; i++) {
                String[] tokens = buf.readLine().split(" ");
                int parentId = Integer.parseInt(tokens[0]);
                int childId = Integer.parseInt(tokens[1]);
                members[childId].parent = members[parentId];
                members[parentId].children.add(members[childId]);
            }

            // 尋找最上層祖先：沒有上層的那一位
            Member top = null;
            for (Member member : members) {
                if (member.parent == null) {
                    top = member;
                    break;
                }
            }

            getMaxDepth( top);
            if (top.getSum() > finalMax) {
                finalMax = top.getSum();
            }

            System.out.println(finalMax);


            s= buf.readLine();
        }

    }

    public static void getMaxDepth(Member now) {

        Stack<Member> stack = new Stack<>();
        stack.add(now);

        while (stack.size() > 0) {
            now = stack.peek();

            if (now.children.isEmpty()) {
                Member m = stack.pop();
                Member p = m.parent ;
                if( p!= null){
                    int d = m.generation[0]+1 ;
                    if (d > p.generation[0]) { // 比最大的大
                        // 把最大的推到第二
                        p.generation[1] = p.generation[0];
                        // 紀錄最大
                        p.generation[0] = d;
                        int s = p.getSum();
                        if (s > finalMax) {
                            finalMax = s;
//                            System.out.println("["+m.id+"] finalMax => " + finalMax);
                        }
                    } else if (d > p.generation[1]) {
                        p.generation[1] = d;
                        int s = p.getSum();
                        if (s > finalMax) {
                            finalMax = s;
//                            System.out.println("["+m.id+"] finalMax => " + finalMax);
                        }
                    }
                }

            }else{
                stack.add( now.children.remove(0));
            }
        }





    }

}

class Member {
    int id;
    Member parent;
    ArrayList<Member> children = new ArrayList<>();
    int[] generation = new int[2];

    public int getSum() {
        return generation[0] + generation[1];
    }
}