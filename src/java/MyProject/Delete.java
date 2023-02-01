
package MyProject;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped

public class Delete {
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
            public void PerformDelete() throws ClassNotFoundException {
        try {
           DBconnector obj =new DBconnector();
             Connection con = obj.connMethod();
     
     String delete= "delete REGISTER set FNAME='"+fname+"',COMPANYTYPE='"+companytype+"',"
                    + "PHONE='"+phone+"',EMAIL='"+email+"',ADDRESS='"+address+"',CITY='"+city+"',NATIONALITY='"+nationality+"'"
             + " where CNAME='"+cname+"'";
          Statement stmt=null;
       stmt = con.createStatement();
       stmt.executeQuery(delete);
            
                 System.err.println("Data deleted successfully");
    } catch (ClassNotFoundException | SQLException e) {
        
    }
       
     
    
}
}          

