import java.util.Arrays;
import java.util.Scanner;

class P3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 建立鏡子陣列
        Mirror[] ms = new Mirror[n + 1];
        Mirror[] ms2 = new Mirror[n + 1];

        // 把出發點，當第一面鏡子
        Mirror m0 = new Mirror();
        m0.x = 0;
        m0.y = 0;
        m0.index = 0;
        m0.dir = '\\';

        // 把鏡子放到 2 個陣列中：ms(位置不動) , ms2（用來排）
        ms[0] = m0;
        ms2[0] = m0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int t = sc.nextInt();

            // create a Mirror
            Mirror m = new Mirror();
            m.x = x;
            m.y = y;
            m.index = i;
            if (t == 1) {
                m.dir = '\\'; // \\-->\
            } else {
                m.dir = '/';
            }

            // 把鏡子放到 2 個陣列中：ms(位置不動) , ms2（用來排）
            ms[i] = m;
            ms2[i] = m;
        }

        // 排序1 + 找左右鄰居
        Arrays.sort(ms2);
        // 紀錄左右鄰居
        // 1. 兩個兩個找
        // 2. 比較兩個是否在同一層
        // 3. 互相紀錄
        for (int i = 0; i < ms2.length - 1; i++) {
            // 每次點兩位
            if (ms2[i].y == ms2[i + 1].y) { // 判斷是否同層
                ms2[i].right = ms2[i + 1].index; // 我的後面是［右鄰居］
                ms2[i + 1].left = ms2[i].index; // 他的前面是［左鄰居］
            }
        }

        // 排序2 + 找上下鄰居
        // 先修改排序的方式
        for (Mirror m : ms2) {
            m.sortType = 0;
        }
        Arrays.sort(ms2);
        // 紀錄上下鄰居
        // 1. 兩個兩個找
        // 2. 比較兩個是否在同一直排
        // 3. 互相紀錄
        for (int i = 0; i < ms2.length - 1; i++) {
            // 每次點兩位
            if (ms2[i].x == ms2[i + 1].x) { // 在同一棟
                ms2[i].up = ms2[i + 1].index; // 我的後面是［上鄰居］
                ms2[i + 1].down = ms2[i].index; // 他的前面是［下鄰居］
            }
        }

        // 開始計算走的次數
        Data data = new Data();
        data.from = "U" ;
        int nextMirror = 0;
        while( true){
            nextMirror = ms[ nextMirror ].next(ms, data );
            if( nextMirror==-1){
                break ;
            }
        }


        //int count = ms[0].next(ms, "U", 0);
        System.out.println(data.count - 1);

    }
}

class Mirror implements Comparable<Mirror> {

    int index; // 陣列的第幾個

    int x;
    int y;

    int up = -1;
    int down = -1;
    int right = -1;
    int left = -1;

    int sortType = 1;

    char dir = ' '; //  '/', \--> '\\'

    public String getInfo() {
        return index + " (" + x + "," + y + ")";
    }

    public void show(Mirror[] ms) {
        System.out.println(getInfo());
        if (up != -1) {
            System.out.println("  上--> " + ms[up].getInfo());
        }
        if (down != -1) {
            System.out.println("  下--> " + ms[down].getInfo());
        }
        if (right != -1) {
            System.out.println("  右--> " + ms[right].getInfo());
        }
        if (left != -1) {
            System.out.println("  左--> " + ms[left].getInfo());
        }
    }

    // 排序規則
    public int compareTo(Mirror o) {
        if (sortType == 1) {
            if (this.y != o.y) {
                return this.y - o.y;
            } else {
                return this.x - o.x;
            }
        } else {
            if (this.x != o.x) {
                return this.x - o.x;
            } else {
                return this.y - o.y;
            }
        }
    }

    public int next(Mirror[] ms, Data d) {
        d.count++;
        if (dir == '\\') {
            switch (d.from) {
                case "U":
                    d.from = "L";
                    return right ;
                    
                case "D":
                    d.from = "R" ;
                    return left ;
                    
                case "L":
                    d.from = "U" ;
                    return down ;
                case "R":
                    d.from = "D" ;
                    return up ;
            }

        } else {
            switch (d.from) {
                case "U":                   
                    d.from = "R" ;
                    return left ;
                case "D":
                    d.from = "L" ;
                    return right ;
                case "L":
                    d.from = "D" ;
                    return up ;
                case "R":
                    d.from = "U" ;
                    return down ;
            }
        }
        return -1;
    }    

    public int next(Mirror[] ms, String from, int count) {
        count++;
        if (dir == '\\') {
            switch (from) {
                case "U":
                    if (right > -1)
                        return ms[right].next(ms, "L", count);
                    break;
                case "D":
                    if (left > -1)
                        return ms[left].next(ms, "R", count);
                    break;
                case "L":
                    if (down > -1)
                        return ms[down].next(ms, "U", count);
                    break;
                case "R":
                    if (up > -1)
                        return ms[up].next(ms, "D", count);
                    break;
            }

        } else {
            switch (from) {
                case "U":
                    if (left != -1)
                        return ms[left].next(ms, "R", count);
                    break;
                case "D":
                    if (right != -1)
                        return ms[right].next(ms, "L", count);
                    break;
                case "L":
                    if (up != -1)
                        return ms[up].next(ms, "D", count);
                    break;
                case "R":
                    if (down != -1)
                        return ms[down].next(ms, "U", count);
                    break;
            }
        }
        return count;
    }

}

class Data{
    int count =0 ;
    String from ="" ;
}