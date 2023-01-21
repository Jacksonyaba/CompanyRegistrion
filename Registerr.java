package MyProject;


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "registerre")
@SessionScoped

public class Registerr {

    private String companyname;
     private String firstname;
      private String lastname;
       private String email;
        private Double phonenumber;
         private Double numberofemployees;
          private String address;
           private String nationality;
            private String region;
             private String city;
              private String companystructure;
               private String companydescription;

  
         
               
    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
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

    public Double getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Double phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Double getNumberofemployees() {
        return numberofemployees;
    }

    public void setNumberofemployees(Double numberofemployees) {
        this.numberofemployees = numberofemployees;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompanystructure() {
        return companystructure;
    }

    public void setCompanystructure(String companystructure) {
        this.companystructure = companystructure;
    }

    public String getCompanydescription() {
        return companydescription;
    }

    public void setCompanydescription(String companydescription) {
        this.companydescription = companydescription;
    }
               

    public Registerr(){/*(String companyname, String firstname, String lastname, 
        String email, Double phonenumber, Double numberofemployees, String address, 
        String nationality, String region, String city, String companystructure, String companydescription) {
        this.companyname = companyname;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.numberofemployees = numberofemployees;
        this.address = address;
        this.nationality = nationality;
        this.region = region;
        this.city = city;
        this.companystructure = companystructure;
        this.companydescription = companydescription;*/
    }
    public String save(){ //throws SQLException{
        System.out.println("Company Name: "+ companyname);
         System.out.println("First Name: "+ firstname);
          System.out.println("Last Name: "+ lastname);
           System.out.println("Phone Number: "+ phonenumber);
            System.out.println("Email: "+ email);
             System.out.println("Address: "+ address);
              System.out.println("Number Of Employees: "+ numberofemployees);
               System.out.println("Region: "+ region);
                System.out.println("City: "+ city);
                 System.out.println("Nationality: "+ nationality);
                  System.out.println("Company Structure: "+ companystructure);
                   System.out.println("Company Description: "+ companydescription);

    /*      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "Jackson","yaba") ;
              Statement ps = con.createStatement();
              ps.executeUpdate("insert into REGISTRATION values("+ companyname +", "+ firstname +", "+ lastname +", " + " "
                      
               + " "+ phonenumber +"," + " "+ email +", "+ address +","+ numberofemployees +", "+ region +", "+ city +", "
                       
               + " "+ nationality +","+ " "+ companystructure +", " + companydescription +")");
                     
                  con.close();*/
        
                return "DataInserted";
           }           
                   
}            
                   
                   
    

  


