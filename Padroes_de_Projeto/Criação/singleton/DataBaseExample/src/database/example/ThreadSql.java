package database.example;


public class ThreadSql implements Runnable
{
   public void run()
   {
      InsertRecords insert = new InsertRecords();
      insert.insertRecords();            
      SelectTable select = new SelectTable();
      select.selectTable();      
      DeleteRecord delete = new DeleteRecord();
      delete.deleteRecord();              
   }
}   
      