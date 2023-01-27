package MyProject;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;


@ManagedBean


public class getlist {
      public List <Retrieve> staffList;
    public List <Retrieve> getdisplayThirdParty() throws ClassNotFoundException{
    staffList = new ArrayList<>();
    
    
      
    try{
        
          DBconnector obj = new DBconnector();
            Connection con = obj.connMethod();
             ResultSet rs = con.createStatement().executeQuery("select * from THIRDPARTY ");
                 while (rs.next()) {
               
               String idnumber = rs.getString("IDNUMBER");
               String firstname = rs.getString("FIRSTNAME");  
               String lastname = rs.getString("LASTNAME");
               String email = rs.getString("EMAIL");
               String phonenumber = rs.getString("PHONENUMBER");
                  
              staffList.add(new Retrieve(idnumber,firstname,lastname,email,phonenumber));
            } 
             
    }catch( SQLException e)
    {
       }
     return staffList;
    }
}
   
         
    
              
                
                
                