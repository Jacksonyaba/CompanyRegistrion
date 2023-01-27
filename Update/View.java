/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package MyProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;




@ManagedBean(name = "view")

public class View {

     public List <Registerr> staffList;
    public List <Registerr> getdisplayRegistration() throws ClassNotFoundException{
    staffList = new ArrayList<>();
    
    
      
    try{
        
          DBconnector obj = new DBconnector();
            Connection con = obj.connMethod();
             ResultSet rs = con.createStatement().executeQuery("select * from REGISTER ");
                 while (rs.next()) {
             
               String cname = rs.getString("CNAME");
               String fname = rs.getString("FNAME");  
               String phone = rs.getString("PHONE");
               String email = rs.getString("EMAIL");
                String address = rs.getString("ADDRESS");
               String city = rs.getString("CITY");
                String nationality = rs.getString("NATIONALITY");

                  
              staffList.add(new Registerr(cname,fname,phone,email,city,address,nationality));
            } 
             
    }catch( SQLException e)
    {
       }
     return staffList;
    }
}
  