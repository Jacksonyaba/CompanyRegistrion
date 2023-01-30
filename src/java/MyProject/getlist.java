package MyProject;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;


@ManagedBean


public class getlist {

   
    public ArrayList<Retrieve>List;
    public ArrayList<Retrieve>ThirdParty() throws ClassNotFoundException{
    List = new ArrayList<>();
    
    
      
    try{
        
          DBconnector obj = new DBconnector();
            Connection con = obj.connMethod();
             ResultSet result = con.createStatement().executeQuery("select * from THIRDPARTY ");
                 while (result.next()) {
               
             
               String fname = result.getString("FIRSTNAME");  
               String lname = result.getString("LASTNAME");
               String eemail = result.getString("EMAIL");
               String phone = result.getString("PHONENUMBER");
                String id= result.getString("IDNUMBER");
              List.add(new Retrieve(id,fname,lname,eemail,phone));
            } 
             
    }catch( SQLException e)
    {
       }
     return List;
    }
}
   
         
    
              
                
                
                