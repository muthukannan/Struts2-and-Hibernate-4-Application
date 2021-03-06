package entity;
// Generated Nov 28, 2012 4:05:26 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private int idLogin;
     private String username;
     private String password;
     private Date date;
     private String name;
     private String address;
     private String tabId;

    public Login() {
    }

	
    public Login(int idLogin) {
        this.idLogin = idLogin;
    }
    public Login(int idLogin, String username, String password, Date date, String name, String address, String tabId) {
       this.idLogin = idLogin;
       this.username = username;
       this.password = password;
       this.date = date;
       this.name = name;
       this.address = address;
       this.tabId = tabId;
    }
   
    public int getIdLogin() {
        return this.idLogin;
    }
    
    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTabId() {
        return this.tabId;
    }
    
    public void setTabId(String tabId) {
        this.tabId = tabId;
    }




}


