package apcs.history;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class J10503_P4 {


    public static void main(String[] args) {
//        String input = "8\n" +
//                "0 1\n" +
//                "0 2\n" +
//                "0 3\n" +
//                "7 0\n" +
//                "1 4\n" +
//                "1 5\n" +
//                "3 6\n";
        String input ="4\n"+
                "0 1\n"+
                "0 2\n"+
                "2 3\n" ;


        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt() ;

        // 先建立每位成員的資料
        Member[] members = new Member[inputNum] ;
        for (int i = 0; i < inputNum; i++) {
            members[i] = new Member() ;
            members[i].id = i ;
        }

        // 讀取資料，建立每位人員的關聯
        for (int i = 0; i < inputNum-1; i++) {
            int parentId = sc.nextInt() ;
            int childId  = sc.nextInt() ;
            members[childId].parent = members[parentId] ;
            members[parentId].children.add( members[childId] ) ;
        }

        // 尋找最上層祖先：沒有上層的那一位
        Member top = null ;
        for (Member member : members) {
            if( member.parent==null){
                top = member ;
                break ;
            }
        }
        top.generation=1 ;

        // 從最上層往下走
        int maxGeneration = top.generation ;
        ArrayList<Member> findNext = new ArrayList<>() ;
        findNext.add(top) ;
        while( findNext.isEmpty()==false ){
            Member m = findNext.remove(0) ;
            // 將人員的後代加入待找清單
            for (Member child : m.children) {
                child.generation = m.generation+1 ;
                findNext.add( child ) ;
                if( child.generation > maxGeneration){
                    maxGeneration = child.generation ;
                }
            }
        }

        System.out.println(maxGeneration);
        //System.out.println("Generation : "+maxGeneration);
    }

}

class Member{

    int id ;
    Member parent ;
    ArrayList<Member> children = new ArrayList<>() ;
    int generation ;

}