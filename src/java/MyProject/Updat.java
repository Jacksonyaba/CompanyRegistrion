package MyProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Updat {
    
      private String idnumber;
     private String firstname;
      private String lastname;
        private String email;
     private String phonenumber;

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
          public void Updatee() throws ClassNotFoundException {
        try {
           DBconnector obj =new DBconnector();
         Connection con = obj.connMethod();
        PreparedStatement stmt= con.prepareStatement("Insert into THIRDPARTY(IDNUMBER,FIRSTNAME,LASTNAME,EMAIL,PHONENUMBER) "
                              + "values (?,?,?,?,?)"); 
         stmt.setString(1,idnumber); 
         stmt.setString(2,firstname);  
         stmt.setString(3,lastname);  
         stmt.setString(4,email); 
         stmt.setString(5,phonenumber); 
        
        
        stmt.executeUpdate();  
            System.out.println("Data UpDated Successfully");
        }
        catch (SQLException e) {
        }
    }
    
}  
        

