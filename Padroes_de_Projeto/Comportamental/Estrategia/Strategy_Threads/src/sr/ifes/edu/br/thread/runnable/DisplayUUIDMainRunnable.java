
package sr.ifes.edu.br.thread.runnable;


public class DisplayUUIDMainRunnable
{
   public static void main(String [] args)
   {
      Runnable runUUID1 = new DisplayUUIDRunnable("Thread1");
      Thread thread1 = new Thread(runUUID1);      
      thread1.start();
            
      Runnable runUUID2 = new DisplayUUIDRunnable("Thread2");
      Thread thread2 = new Thread(runUUID2);      
      thread2.start();

      
   }
}