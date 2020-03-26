package apcs.tw;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author chuan
 */
class J10806_P3_e288_CP {

        public static void main(String[] args) throws IOException {

//                String  input = "3 4\n"
//                        + "ABzBc\n"
//                        + "cGb\n"
//                        + "bbG\n"
//                        + "zBAz\n";
//                InputStream is = new ByteArrayInputStream(input.getBytes());
//                System.setIn(is);
                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                String[] tokens = buf.readLine().split(" ");
                int n = Integer.parseInt(tokens[1]);
                long wholeGroup = 0l;
                HashMap<Long,Integer> group = new HashMap<>();
                for (int i = 0; i < n; i++) {
                        String s = buf.readLine().trim();
                        long myGroup = 0l;
                        //System.out.println("====" + s);
                        for (int si = 0; si < s.length(); si++) {
                                char c = s.charAt(si);
                                int ci = c - 'A';
                                long pi = 1l << ci;
                                ////System.out.println(c + " -->" + ci);
                                myGroup = myGroup | pi;
                                wholeGroup = wholeGroup | pi;
                                //System.out.println(Long.toBinaryString(myGroup));
                        }
                        Integer size = group.get(myGroup) ;
                        if( size==null){
                                group.put(myGroup, 1) ;
                        }else{
                                group.put(myGroup, size+1) ;
                        }
                }
                //System.out.println("====");
                //System.out.println(Long.toBinaryString(wholeGroup));
                //System.out.println("====");
               
                int pairCount = 0 ;
                for (Long long1 : group.keySet()) {
                        Long another = long1^wholeGroup ;
                        Integer a = group.get( long1) ;
                        Integer b = group.get( another ) ;
                        if( a!=null && b!=null){
                                pairCount+=a*b;
                        }
                        group.put(long1,null);
                        if( b!=null)
                        group.put(another,null) ;
//                        if(group.isEmpty()){
//                                break ;
//                        }
                }

                System.out.println(pairCount);

        }

}
