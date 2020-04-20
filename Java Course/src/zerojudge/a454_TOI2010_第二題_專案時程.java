package zerojudge;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author chuan
 */
public class a454_TOI2010_第二題_專案時程 {

    

      public static void main(String[] args) throws IOException {

//            String data = "2\n"
//                    + "2\n"
//                    + "8 1 2\n"
//                    + "2 0\n"
//                    + "5\n"
//                    + "6 2 2 3\n"
//                    + "5 1 4\n"
//                    + "11 1 5\n"
//                    + "4 1 5\n"
//                    + "8 0\n";
//
//            InputStream is = new ByteArrayInputStream(data.getBytes());
//            System.setIn(is);
            ///-----------------------
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            String s = buf.readLine();
            int n = Integer.parseInt(s);
            long[] ans = new long[n];
            for (int testCase = 0; testCase < n; testCase++) {

                  // graph setting
                  int ntask = Integer.parseInt(buf.readLine());
                  int[] taskDays = new int[ntask + 1];
                  int[] accDays = new int[ntask + 1];
                  int[] inCount= new int[ntask + 1] ; // 紀錄有多少會連入 i 節點
                 
                  int[][] nextTasks = new int[ntask + 1][];
                  for (int i = 1; i <= ntask; i++) {
                        String[] tokens = buf.readLine().split(" ");
                        
                        accDays[i]=taskDays[i]= Integer.parseInt(tokens[0]);
                       
                        //
                        int nextN = Integer.parseInt(tokens[1]);
                        int[] child = new int[nextN];
                        for (int j = 0; j < nextN; j++) {
                              int cIndex = Integer.parseInt(tokens[2 + j]);
                              child[j] = cIndex;
                              inCount[cIndex]++;                              
                        }
                        nextTasks[i] = child;
                  }

                                                     
                  // 使用 BFS，不可以使用 DFS --> 重疊的路線會重算（多很多運算量）
                  ArrayList<Integer> walkList = new ArrayList<>();              
                  long max = 0; 
                  for (int i = 1; i < inCount.length; i++) {
                       if( inCount[i]==0){ //  沒有任何  inCount  就是 root
                             walkList.add(i) ;
                       }                        
                  }
                  while (!walkList.isEmpty()) {
                        int here = walkList.remove(0);                      
                        for (int next : nextTasks[here]) { // 走訪後方節點
                              int cost = taskDays[next] + accDays[here];
                              if (cost > accDays[next]) {
                                    accDays[next] = cost;
                                    if (accDays[next] > max) {
                                          max = accDays[next];
                                    }
                              }
                              inCount[next]-- ;
                              if( inCount[next]==0){ // 所有連入都算完才可以往下
                                    walkList.add(next);
                              }
                        }
                  }
                  ans[testCase] = max;

            }
            for (long an : ans) {
                  System.out.println(an);
            }

      }


}
