package lectures;

// 陣列練習題目

public class P_Array {

        public static void main(String[] args) {

                System.out.println("Start ---------------");
                System.out.println("[q01] ---------------");
                q01();
                System.out.println("[q02] ---------------");
                q02();
                System.out.println("[q03] ---------------");
                q03();
                System.out.println("[q04] ---------------");
                q04();
        }

        
        // number
        // 將題目 5 個數字放進陣列，用陣列取出 x[?] 
        // 印出第 2、5 個數字
        static void q01() {
                // 題目：12 , 23 , 34 , 45 , 56
        
//                int[] x = new int[?] ;
                
//                System.out.println( x[?] );
        }
        
        
        // number 
        // 將下列陣列中的數字用 for 全部加起來
        // 放進 total 印出來
        static void q02() {

                int[] x = new int[5];
                x[0] = 75;
                x[1] = 100;
                x[2] = 85;
                x[3] = 100;
                x[4] = 95;

                int total = 0;

//                for(){      
//
//                }    
//
//                System.out.println("總共是：" ?);
        }

        // text
        // 將下列陣列中文字接起來，放進 sentence
        // 印出［今天天氣很好］
        static void q03() {

                String sentence = "";
                String[] word = new String[10];
                word[0] = "今";
                word[1] = "金";
                word[2] = "氣";
                word[3] = "天";
                word[4] = "好";
                word[5] = "狠";
                word[6] = "很";
                word[7] = "！";
                word[8] = "汽";
                word[9] = "棒";

                // sentence = word[0]+..... ;
                
                System.out.println(sentence);
        }
        
        
        // 正反順序印出
        // 回文句：
        // 1. 馬下花香聞
        // 2. 天上龍捲風
        // 3. 上海自來水
        // 4. 清水高山上
        static void q04(){
                String[] w = new String[5] ;
                w[0] = "上" ;
                w[1] = "海" ;
                w[2] = "自" ;
                w[3] = "來" ;
                w[4] = "水" ;
                
//  順著印                
//                for(){
//                        System.out.println("");
//                }
              
  
//  反著印                
//                for(){
//                        System.out.println("");
//                }
              
        }
        

       
        
        // 找出最大值
        static void qq2(){
                
        }
}
