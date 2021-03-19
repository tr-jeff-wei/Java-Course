package codingame.puzzle;


import java.util.*;

class GraffitiFence {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int N = in.nextInt();

        ArrayList<Fence> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int st = in.nextInt();
            int ed = in.nextInt();
            list.add(new Fence(st, ed));

        }
        int preEnd = 0;
        Collections.sort(list) ;
        for (int i = 0; i < list.size(); i++) {
            Fence f = list.get(i) ;
            if (f.s > preEnd) {
                System.out.println(preEnd + " " + f.s);
            }
            if( f.e>preEnd)
                preEnd = f.e;
        }
        if (L != preEnd) {
            System.out.println(preEnd + " " + L);
        }

    }
}

class Fence implements Comparable<Fence> {
    int s;
    int e;

    public Fence(int ms, int me) {
        s = ms;
        e = me;
    }

    @Override
    public int compareTo(Fence o) {
        if (s == o.s) {
            return e - o.e;
        }
        return s - o.s;
    }
}