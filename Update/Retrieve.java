
package MyProject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped

public class Retrieve {
  
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
   
    private final  String idnumber;
    private final  String firstname;
    private final  String lastname;
    private final  String email;
    private final  String phonenumber;
   
       public Retrieve(String idnumber, String firstname, String lastname,  String email, String phonenumber) 
       {      
 
    this.idnumber = idnumber;
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.phonenumber = phonenumber;
        }
}   
    


    




   
   

    
   


  

    
  
   
    
 
    
    
   
