
package singleton.database.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class InsertRecord {

    public void insertRecords() {

        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DBConnection.getInstance();
                        

            stmt = c.createStatement();
            String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
                    + "VALUES (1, 'Paul', 32, 'California', 20000.00 );";
            stmt.executeUpdate(sql);           
            stmt.close();
            //c.commit();
            
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        
    }
}
