
package sr.ifes.edu.br.thread.extend;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisplayUUIDExtend extends Thread{  
   private String threadName;
   public DisplayUUIDExtend(String threadName)
   {
      this.threadName = threadName;
   }
   public void run()
   {
      int i =0;
      while(i<10)
      {
          try {
              Thread.sleep(400);
          } catch (InterruptedException ex) {
              Logger.getLogger(DisplayUUIDExtend.class.getName()).log(Level.SEVERE, null, ex);
          }
         i++;
         System.out.println(UUID.randomUUID() + "-" +threadName);
      }
   }
   
   
}
    
