/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.services;

/**
 *
 * @author 733196
 */
public class UserServices {
    
    private String[] userNames = {"adam", "betty"};
    private String password = "password";
    
    public  boolean loging(String userName, String password){
        boolean isValid = false;
        
        for(String user : userNames)
            if(user.equals(userName))
                if(this.password.equals(password))
                isValid = true;
            
        return isValid;
    }
}
