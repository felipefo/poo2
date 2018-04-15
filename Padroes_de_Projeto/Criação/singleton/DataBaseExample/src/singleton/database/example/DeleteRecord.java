
package singleton.database.example;


import java.sql.*;

public class DeleteRecord {

    public void deleteRecord() {
        Connection c = null;
        Statement stmt = null;

        try {
           
            c = DBConnection.getInstance();
                       

            stmt = c.createStatement();
            String sql = "DELETE from COMPANY where ID=1;";
            stmt.executeUpdate(sql);
            //c.commit();

            ResultSet rs = stmt.executeQuery("SELECT * FROM COMPANY;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                float salary = rs.getFloat("salary");
                System.out.println("ID = " + id);
                System.out.println("NAME = " + name);
                System.out.println("AGE = " + age);
                System.out.println("ADDRESS = " + address);
                System.out.println("SALARY = " + salary);
                System.out.println();
            }
            rs.close();
            stmt.close();
            
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }       
    }
}
