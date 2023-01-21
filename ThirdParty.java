
package MyProject;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="thirdparty")
@SessionScoped
public class ThirdParty //implements Serializable{
{
    //private static final long serialVersionUID = -7250065889869767422L;
    private String firstname;
    private String lastname;
   // private Character companyreferencecode;
    private Character idnumber;
    private String email;

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

  

    public Character getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(Character idnumber) {
        this.idnumber = idnumber;
    }

    public Double getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Double phonenumber) {
        this.phonenumber = phonenumber;
    }
    private Double phonenumber;
}
 
  
   