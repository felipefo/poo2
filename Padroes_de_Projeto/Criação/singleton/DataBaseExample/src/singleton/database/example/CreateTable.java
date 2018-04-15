
package singleton.database.example;

import java.sql.Connection;
import java.sql.Statement;


public class CreateTable {

    public void createTable() {
        Connection c = null;
        Statement stmt = null;
        try {
            
            c = DBConnection.getInstance();            

            stmt = c.createStatement();
            String sql = "CREATE TABLE COMPANY "
                    + "(ID INT         NOT NULL,"
                    + " NAME           TEXT    NOT NULL, "
                    + " AGE            INT     NOT NULL, "
                    + " ADDRESS        CHAR(50), "
                    + " SALARY         REAL)";
            stmt.executeUpdate(sql);
            stmt.close();            
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("Table created successfully");
    }
}
