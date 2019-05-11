package lectures;

/**
 *
 * @author chuan
 */
public class A1_DataType {
        
        static void Q1_condition(){
                
                // 填空測驗
                int a1 = 17;
                double a2 = 65.5;
                String a3 = "Jeff";
                boolean a4 = true;
                
                if ( a1 > 18  ){
                        String result = a3 + " 是成年人了！" ;
                        System.out.println( result );
                }else{
                        String result = a3 + " 尚未成年" ;
                        System.out.println( result );
                }
                
                int sum = a1 + 1911 ;
                System.out.println(" sum = " +  sum  );
                
                if(   a4   ){
                        String t = a3 + " is a good boy." ;
                        System.out.println(  t  );
                }
                
        }
        
}
