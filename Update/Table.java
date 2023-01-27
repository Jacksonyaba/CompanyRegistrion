/*package MyProject;

import MyProject.DBconnector;
import MyProject.View;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class Table {
    
      public List <View> view;
      
    public List <View> getdisplayREGISTER() throws ClassNotFoundException{
        
    view = new ArrayList<>();
    
     try{
        
          DBconnector obj = new DBconnector();
          
            Connection con = obj.connMethod();
            
             ResultSet rs = con.createStatement().executeQuery("select * from REGISTER ");
                    
             
                 while (rs.next()) {
             
          
                String cname = rs.getString("CNAME");   
                
                String  fname = rs.getString("FNAME");
               
                String phone = rs.getString("PHONE");
                   
                String  email = rs.getString("EMAIL");
                   
                String address = rs.getString("ADDRESS");
                
                String  city = rs.getString("CITY");
                 
                String  nationality = rs.getString("NATIONALITY");
                 
                view.add(new View(cname,fname,phone,email,address,city,nationality));
            } 
             
          }catch( SQLException e)
      {
   } 
    
       return view;
    }
 }*/
    
   


      
   