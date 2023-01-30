
package MyProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "update")
@SessionScoped
public class Update {
     private String cname;
          private String fname;
           private String address;
            private String email;
             private String phone;
             private String city;
             private  String nationality;
              private String companytype;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getCompanytype() {
        return companytype;
    }

    public void setCompanytype(String companytype) {
        this.companytype = companytype;
    }
               public void PerformUpdate() throws ClassNotFoundException {
        try {
           DBconnector obj =new DBconnector();
             Connection con = obj.connMethod();
     
     String edit= "update REGISTER set FNAME='"+fname+"',CNAME='"+cname+"',"
                    + "PHONE='"+phone+"',EMAIL='"+email+"',ADDRESS='"+address+"',CITY='"+city+"',NATIONALITY='"+nationality+"'"
             + " where COMPANYTYPE='"+companytype+"'";
          Statement stmt=null;
       stmt = con.createStatement();
       stmt.executeQuery(edit);
            
                 System.err.println("success");
    } catch (ClassNotFoundException | SQLException e) {
        
    }
       
     
    
}
}
      

         
         
            
           