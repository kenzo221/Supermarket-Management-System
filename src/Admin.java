
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fnuke
 */
public class Admin{
    
     private String user;
    private String password;
    public String name;
     public String id;
     public String address;
     public String phonenumber;

     public Admin() 
     {
          String user="";
        String password="";
        String name="";
        String id="";
        String address="";
      String phonenumber="";
     }
     public Admin(String user,String password) {
         this.user = user;
         this.password=password;
     }
      
    public String checkInfo(){
      String d = "admins.txt";
        return d;
    }
    public String checkInfo(String filepath)
    {
        return filepath;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    
    
   
}
