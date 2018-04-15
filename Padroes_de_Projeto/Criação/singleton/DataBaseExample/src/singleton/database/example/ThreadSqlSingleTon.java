package singleton.database.example;


public class ThreadSqlSingleTon implements Runnable
{
   public void run()
   {
      InsertRecord insert = new InsertRecord();
      for(int i=0;i< 100;i++)
        insert.insertRecords();                       
      database.example.SelectTable select = new database.example.SelectTable();
      select.selectTable();                  
      database.example.DeleteRecord delete = new database.example.DeleteRecord();
      delete.deleteRecord();                           
   }
}   
      