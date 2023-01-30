package MyProject;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;


@ManagedBean


public class getlists {

   
    public ArrayList<Registerr>List;
    public ArrayList<Registerr>getInsertion() throws ClassNotFoundException{
    List = new ArrayList<>();
    
    
      
    try{
        
          DBconnector obj = new DBconnector();
            Connection con = obj.connMethod();
             ResultSet result = con.createStatement().executeQuery("select * from REGISTER ");
                 while (result.next()) {
               
             
               String ccname = result.getString("CNAME");  
               String ffname = result.getString("FNAME");
               String eemail = result.getString("PHONE");
               String phonee = result.getString("EMAIL");
               String addres= result.getString("ADDRESS");
               String ccity= result.getString("CITY");
               String nationalityy = result.getString("NATIONALITY");
               String companytyp= result.getString("COMPANYTYPE");
               
                   List.add(new Registerr(ccname,ffname,ccity,eemail,phonee,
                    addres,nationalityy,companytyp));
                  
            
            } 
             
    }catch( SQLException e)
    {
       }
     return List;
    }
   
}  

   