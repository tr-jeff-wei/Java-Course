package apcs.us;

import java.util.ArrayList;
import java.util.List;

public class AP2016_P2_LogMessage {

      public static void main(String[] args) {
            String msg = "CLIENT3: security alert - repeated login failures";
            LogMessage lmsg = new LogMessage(msg);
            System.out.println(msg);
            System.out.println(lmsg.containsWord("disk"));

            msg = "Webserver: disk offline";
            lmsg = new LogMessage(msg);
            System.out.println(msg);
            System.out.println(lmsg.containsWord("disk"));

            msg = "Server1: file not found";
            lmsg = new LogMessage(msg);
            System.out.println(msg);
            System.out.println(lmsg.containsWord("disk"));

            msg = "Server2: read error on disk DSK1";
            lmsg = new LogMessage(msg);
            System.out.println(msg);
            System.out.println(lmsg.containsWord("disk"));

            msg = "Server1: write error on disk DSK2";
            lmsg = new LogMessage(msg);
            System.out.println(msg);
            System.out.println(lmsg.containsWord("disk"));

            msg = "Webserver: error on /dev/disk";
            lmsg = new LogMessage(msg);
            System.out.println(msg);
            System.out.println(lmsg.containsWord("disk"));
      }
}

class LogMessage{
      
      private String machineId ;
      private String description ;
      
      public LogMessage(String message ){
            // (a)
      }
      public boolean containsWord(String keyword ){
            // (b)
            
            return false ;
      }
      
      public String getMachineId(){
            return machineId ;
      }
      
      public String getDescription(){
            return description ;
      }
}


class SystemLog{

    List<LogMessage> messageList ;

    public List<LogMessage> removeMessages(String keyword ){
        // (c)
        return null ;
    }
    
    public static void main(String[] args){
        SystemLog sl = new SystemLog() ;
        sl.messageList = new ArrayList<LogMessage>();
        
        String msg = "CLIENT3: security alert - repeated login failures" ;
        LogMessage lmsg = new LogMessage(msg) ;
        sl.messageList.add(lmsg) ;

        msg = "Webserver: disk offline" ;
        lmsg = new LogMessage(msg) ;
        sl.messageList.add(lmsg) ;

        msg = "Server1: file not found" ;
        lmsg = new LogMessage(msg) ;
        sl.messageList.add(lmsg) ;

        msg = "Server2: read error on disk DSK1" ;
        lmsg = new LogMessage(msg) ;
        sl.messageList.add(lmsg) ;

        msg = "Server1: write error on disk DSK2" ;
        lmsg = new LogMessage(msg) ;
        sl.messageList.add(lmsg) ;

        msg = "Webserver: error on /dev/disk" ;
        lmsg = new LogMessage(msg) ;
        sl.messageList.add(lmsg) ;
    }

}