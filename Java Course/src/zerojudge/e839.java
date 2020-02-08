package zerojudge;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class e839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, ArrayList<String>> menu = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().trim().split(" ");
            ArrayList<String> list = menu.get(tokens[1]);
            if (list == null) {
                list = new ArrayList<>();
                menu.put(tokens[1], list);
            }
            list.add(tokens[0]);
        }
        String target = sc.nextLine().trim();
        ArrayList<String> result = menu.get(target);
        if (result == null) {
            System.out.println("No");
        } else {
            Collections.sort(result);
            for (String s : result) {
                System.out.println(s);
            }
        }
    }

}
