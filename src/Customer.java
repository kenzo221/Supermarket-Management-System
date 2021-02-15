/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fnuke
 */
public class Customer extends Admin {
 
     public String dob;

     public Customer()
     {
         super();
     }

     public Customer(String username,String pass)
     {
         super(username,pass);
     }
     
     @Override
       public String checkInfo(){
        String d = "customers.txt";
        return d;
    }
     
    
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

   
     
}
