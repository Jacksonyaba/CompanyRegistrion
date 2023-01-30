
package MyProject;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "insertion")
@SessionScoped

    public class Insertion implements Serializable {
    
     private String cname;
     private String fname;
      private String email;
        private String phone;
         private String address;
           private String city;
           private String nationality;
           private String companytype;

    public String getCompanytype() {
        return companytype;
    }

    public void setCompanytype(String companytype) {
        this.companytype = companytype;
    }
           
           
      

    public Insertion() {
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
       public void insert() throws ClassNotFoundException {
        try {
           DBconnector obj =new DBconnector();
             Connection con = obj.connMethod();
        PreparedStatement stmt= con.prepareStatement("Insert into REGISTER(CNAME,FNAME,PHONE,EMAIL,ADDRESS,CITY,NATIONALITY,COMPANYTYPE) "
                         + "values (?,?,?,?,?,?,?)");     
        stmt.setString(1,cname);  
        stmt.setString(2,fname);  
        stmt.setString(3,phone);  
        stmt.setString(4,email); 
        stmt.setString(5,address); 
        stmt.setString(6,city); 
        stmt.setString(7,nationality); 
        stmt.setString(8,companytype); 
        stmt.executeUpdate();  
            System.out.println("Data Inserted Successfully");
        }
        catch (SQLException e) {
        }
    }
   
             
     
     

    








  

      

   

    
    
   }