package apcs.tw;


import java.util.ArrayList;
import java.util.Scanner;

public class J11101_P2_贏家預測 {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            Data[] player = new Data[n] ;
            ArrayList<Data> round = new ArrayList<>() ;
            for (int i = 0; i < n; i++) {
                  player[i] = new Data();
                  player[i].id = i+1;
                  player[i].ap = sc.nextInt() ;                  
            }
            for (int i = 0; i < n; i++) {
                  player[i].rp = sc.nextInt() ;                  
            }
            for (int i = 0; i < n; i++) {
                  int id = sc.nextInt() ;            
                  round.add( player[id-1]) ;
            }
            
            while(round.size()>1){
                  ArrayList<Data> wlist = new ArrayList<>();
                  ArrayList<Data> llist = new ArrayList<>();
                  for (int r = 0; r < round.size()-1; r+=2) {
                        Data d1 = round.get(r) ;
                        Data d2 = round.get(r+1) ;
                        
                        Data winner , loser ;
                        if(d1.beat(d2)){
                              winner = d1 ;
                              loser = d2 ;                              
                        }else{
                              winner = d2 ;
                              loser = d1 ;
                        }
                        wlist.add(winner) ;
                        if( loser.lose<m){
                              llist.add( loser ) ;
                        }                    
                  }
                  if( round.size()%2==1){
                        // put last
                        wlist.add( round.get( round.size()-1)) ;
                  }
                  wlist.addAll(llist);
                  round = wlist ;
                  // debug
//                  String s1="" , s2="" , s3="";
//                  for (Data data : player) {
//                        s1+=data.ap+",";
//                        s2+=data.rp+",";
//                        s3+=data.lose+",";                        
//                  }
//                  System.out.println(wlist);
//                  System.out.println(s1+"   |  "+s2+"  |  "+s3);
            }
            
            System.out.println(round.get(0).id);

      }
}

class Data {

      long ap;
      long rp;
      int lose ;
      int id ;
      
      boolean beat(Data d2){
            if( score()>=d2.score() ){
                  winUpdate(d2) ;
                  d2.loseUpdate();                 
                  d2.lose();
                  return true ;
            }else{
                  d2.winUpdate(this);
                  loseUpdate();
                  lose();
                  return false ;
            }
      }
      
      void winUpdate(Data d2){
            //  ap --> a+cd/(2b)
            long nap = ap + d2.score()/(2*rp) ;
            // rp --> b+cd/(2a)
            long nrp = rp + d2.score()/(2*ap) ;
            
            ap = nap ;
            rp = nrp ;
            
      }
      void loseUpdate(){
            ap = ap+ap/2 ;
            rp = rp+rp/2 ;
      }
      void lose(){
            lose++;
      }
      
      long score(){
            return ap*rp;
      }
      
      public String toString(){
            return ""+id ;
      }
}
