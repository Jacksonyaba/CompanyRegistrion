package MyProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 import java.sql.*;
       
public class DBconnector {
    




// JDBC driver name and database URL

    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";  
          
         

    //  Database credentials
    static final String USER = "Jackson";
    static final String PASS = "yaba";
    Connection con = null;

    public Connection connMethod() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
       // System.out.println("Connecting to a selected database...");
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        if (con != null) {
           System.out.println("Connected to database successfully");
        } else {
           System.out.println("nFailed to connect to Oracle DB");
       }
        return con;
        
    }
   
    public static void main(String []args) throws ClassNotFoundException, SQLException{
       
    DBconnector obj = new DBconnector();
   
  obj.connMethod();
    }
}
    

      
