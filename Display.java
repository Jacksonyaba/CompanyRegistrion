/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name="obj")
@SessionScoped


public class Display {
    private String companyname;
     private String firstname;
      private String lastname;
        private double phonenumber;
         private String email;
          private String address;
           private double numberofemployees;
            private String region; 
             private String city;
              private String companystructure;
               private String companydescription;
                private String nationality;
                

    public Display() {
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

   
    public double getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(double phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getNumberofemployees() {
        return numberofemployees;
    }

    public void setNumberofemployees(double numberofemployees) {
        this.numberofemployees = numberofemployees;
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
    
  
       public boolean save(){  
int result = 0;  
try{  
Class.forName("com.mysql.jdbc.Driver");     

Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/Company","root","Jackson");  

PreparedStatement statement = con.prepareStatement("insert into user(companyname, firstname, lastname, email, phonenumber,address, numberofemployees,"
        + "city, region, nationality, companystructure, companydescription) values(?,?)");  

 statement.setString(1, this.getCompanyname());  
 
 statement.setString(2, this.getEmail());  
 
  statement.setString(3, this.getFirstname());  
  
   statement.setString(4, this.getLastname());  
   
    statement.setDouble(5, this.getPhonenumber());  
    
     statement.setString(6, this.getAddress());  
     
      statement.setDouble(7, this.getNumberofemployees());  
      
       statement.setString(8, this.getCity());  
       
        statement.setString(9, this.getRegion());  
        
         statement.setString(10, this.getNationality());  
         
          statement.setString(11, this.getCompanystructure());  
          
           statement.setString(12, this.getCompanydescription());  
 
        result =  statement.executeUpdate();  

     }catch(Exception e){  
    
                           System.out.println(e);  
} 

             if(result == 1){  
                return true;  
       }
             else return false;  
}  
  
  public String submit(){  
      
      
         if(this.save()){  
             
                return "inserted.xhtml";  
   }
         else return "register.xhtml";  
         
   } 
  
}  
    
    
  
