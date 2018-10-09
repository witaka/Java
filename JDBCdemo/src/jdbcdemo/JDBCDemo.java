/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;
import java.sql.*;

/**
 *
 * @author user
 */
public class JDBCDemo
{
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/jdbcdemo";

    //  Database credentials
    static final String USER = "jdbcdemo";
    static final String PASS = "abc123";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    
    try
    {
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT contact_id, contact_name, contact_email, contact_phone, date_created FROM contacts";
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("contact_id");
         String name = rs.getString("contact_name");
         String email = rs.getString("contact_email");
         String phone = rs.getString("contact_phone");
         Date dtCreated = rs.getDate("date_created");

         //Display values
         System.out.print("Date: " + dtCreated);
         System.out.print(", ID: " + id);
         System.out.print(", Name: " + name);
         System.out.print(", E-mail: " + email);
         System.out.println(", Telephone: " + phone);
      }
      //STEP 6: Clean-up environment
      rs.close();
      stmt.close();
      conn.close();
    }
    catch(SQLException se)
    {
      //Handle errors for JDBC
      se.printStackTrace();
    }
    catch(Exception e)
    {
      //Handle errors for Class.forName
      e.printStackTrace();
    }
    finally
    {
        //finally block used to close resources
        try
        {
            if(stmt!=null)
            {
                stmt.close();
            }
        }
        catch(SQLException se2)
        {
        }// nothing we can do
      
        try
        {
            if(conn!=null)
            {
                conn.close();
            }
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }//end finally try
   }//end try
    
   System.out.println("Goodbye!");
  }
}