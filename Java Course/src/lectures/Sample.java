package lectures;

public class Sample {
     
     int[] x ;
     String[][] x2 ;
     String name ;
     
     // constructor
     public Sample() {
          x = new int[2] ;
          x[0] = 5 ;
          x[1] = 7 ;
          
          x2 = new String[2][3] ;   
          x2[0][0] = "A0" ;
          x2[0][1] = "A1" ;
          x2[0][2] = "A2" ;
          x2[1][0] = "B0" ;
          x2[2][1] = "B1" ;
          x2[3][2] = "B2" ;
          
     }
     
     // constructor
     public Sample( int[] i , String[][] i2 ) {
          x = i ;
          x2 = i2 ;
     }
     
     // methods
     public int[] getX() {
          return x ;
     }
     public String[][] getX2(){
          return x2 ;
     }
     
     
     public void setName( String text ) {
          name = text ;
     }
    
     public static void main(String[] args) {
    
          Sample sample = new Sample() ;
          sample.setName("Cool Sample");
          
     }

}
