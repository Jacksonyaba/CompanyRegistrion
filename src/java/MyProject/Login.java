
package MyProject;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@ManagedBean(name = "link")
@SessionScoped
public class Login implements Serializable{
    
      @Pattern(message="mail address is invalid", 
        regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9]"
                + "(?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")
  @NotNull(message="<%=ivy.cms.co(\"/ch.ivyteam.htmldialog.demo/BeanValidationDemo/notnull\")%>")
    
    private String email;
    private String password;
    
    public String getEmail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void validateEmail(FacesContext context, UIComponent comp,Object value) {
        System.out.println("inside validate method");
        String email = (String) value;
        
        if(email.length()<5){
            ((UIInput) comp).setValid(false);
            FacesMessage message = new FacesMessage(
            "Minimum length of email is 5");
            context.addMessage(comp.getClientId(context), message);
        }
        
     }
    
     public void validatePassword(FacesContext context, UIComponent comp,Object value) {
        System.out.println("inside validate method");
        String password = (String) value;
        
        if(password.length()<4){
            ((UIInput) comp).setValid(false);
            FacesMessage message = new FacesMessage(
            "Minimum length of password is 4");
            context.addMessage(comp.getClientId(context), message);
        }
        
     }
     public String doLogin(){
         if(email==null){
             return"create";
         }
       
       return "HomePage.xhtml";
       
}
  
   }
      
   

