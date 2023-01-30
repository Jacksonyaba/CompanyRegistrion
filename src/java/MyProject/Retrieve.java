
package MyProject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped

public class Retrieve {
  private   String idnumber;
    private  String firstname;
    private   String lastname;
    private   String email;
    private   String phonenumber;

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
   
    public String getIdnumber() {
        return idnumber;
    }
  
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
  
    public String getPhonenumber() {
        return phonenumber;
    }
   
    
       public Retrieve(String idnumber, String firstname, String lastname,  String email, String phonenumber) 
       { 
           this.idnumber = idnumber;
           this.firstname = firstname;
           this.lastname = lastname;
           this.email = email;
           this.phonenumber = phonenumber;
           
           
           
     }
   
}   
    


    




   
   

    
   


  

    
  
   
    
 
    
    
   
