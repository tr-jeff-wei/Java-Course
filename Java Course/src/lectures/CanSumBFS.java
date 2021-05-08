package lectures;


import java.util.ArrayList;
import java.util.HashMap;

public class CanSumBFS {

      static HashMap<Integer, ArrayList<Integer>> memory = new HashMap<>();
      static boolean[] visited = new boolean[1000];
      static ArrayList<Integer> answer = null ;

      public static void main(String[] args) {

            int target = 124;
            int[] els = {2, 5};

            // first element
            memory.put(target, new ArrayList<Integer>());
            visited[target] = true;
            
            loop(els) ;
            System.out.println(answer);
            
           
      }
      public static void loop(int[] els){
             while (true) {
                  HashMap<Integer, ArrayList<Integer>> tmp = new HashMap<>();

                  for (Integer num : memory.keySet()) {

                        for (int subtract : els) {
                              int n = num - subtract;
                              
                              if (n<0 || visited[n]) {
                                    continue;
                              }
                              visited[n]= true; 
                              
                              ArrayList<Integer> nList = new ArrayList<>(memory.get(num));
                              nList.add(subtract);
                              tmp.put(n, nList);
                              if (n == 0) {
                                    memory = tmp;
                                    answer = nList ;
                                    return;
                              }
                        }
                  }                  
                  memory = tmp;

            }

      }

}
