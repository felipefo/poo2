package database.example;


public class ThreadSql implements Runnable
{
   public void run()
   {
      
      InsertRecord insert = new InsertRecord();
      for(int i=0;i< 100;i++)
        insert.insertRecords();            
      
     // UpdatetRecord update = new UpdatetRecord();
     // update.updateRecord();      
      SelectTable select = new SelectTable();
      select.selectTable();                  
      DeleteRecord delete = new DeleteRecord();
      delete.deleteRecord();                  
   }
}   
      