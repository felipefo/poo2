package sr.ifes.edu.br.thread.runnable;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DisplayUUIDRunnable implements Runnable
{
    String threadName;
    public DisplayUUIDRunnable(String threadName)
   {
      this.threadName = threadName;
   }    
   public void run()
   {
      int i =0;
      while(i<10)//cada execucao vai imprimir 10 vezes o uuid
      {
          try {
              Thread.sleep(400);
          } catch (InterruptedException ex) {
              Logger.getLogger(DisplayUUIDRunnable.class.getName()).log(Level.SEVERE, null, ex);
          }
         i++;
         System.out.println(UUID.randomUUID() + "-" +threadName);
      }
   }
}   
      