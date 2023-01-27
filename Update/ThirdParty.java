
package MyProject;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="thirdparty")
@SessionScoped
public class ThirdParty {

    private String idnumber;
     private String firstname;
      private String lastname;
        private String email;
          private String phonenumber;
  
   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

  

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
  
     
            public void save() throws ClassNotFoundException {
        try {
           DBconnector obj =new DBconnector();
         Connection con = obj.connMethod();
        PreparedStatement stmt= con.prepareStatement("Insert into THIRDPARTY(IDNUMBER,FIRSTNAME,LASTNAME,EMAIL,PHONENUMBER) "
                              + "values (?,?,?,?,?)"); 
         stmt.setString(5,idnumber); 
         stmt.setString(1,firstname);  
         stmt.setString(2,lastname);  
         stmt.setString(4,email); 
         stmt.setString(3,phonenumber); 
        
        
        stmt.executeUpdate();  
            System.out.println("Data Inserted Successfully");
        }
        catch (SQLException e) {
        }
    }
    
}  
 
   