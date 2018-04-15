
package database.example;


import java.sql.*;

public class MainSqlLite
{
  public static void main( String args[] )
  {          
      usingThreads();
      usingThreads();
      usingThreads();
      usingThreads();
      usingThreads();
      usingThreads();
      usingThreads();
      usingThreads();
      usingThreads();
      usingThreads();
      usingThreads();
      usingThreads();
      usingThreads();
      usingThreads();
      
  }
  
  public static void usingThreads(){
      
      Runnable hello = new ThreadSql();
      Thread thread1 = new Thread(hello);                  
      thread1.start();                  
  }
  
}