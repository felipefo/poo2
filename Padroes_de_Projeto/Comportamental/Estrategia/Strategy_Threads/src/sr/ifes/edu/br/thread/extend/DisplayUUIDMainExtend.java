
package sr.ifes.edu.br.thread.extend;

import sr.ifes.edu.br.thread.extend.DisplayUUIDMainExtend;

public class DisplayUUIDMainExtend {
   public static void main(String args[]) {
     Thread thread1 = new DisplayUUIDExtend("Thread1");
     thread1.start();
     Thread thread2 = new DisplayUUIDExtend("Thread2");
     thread2.start();     
   }   
}

