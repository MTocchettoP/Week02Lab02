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
    
    private static String userName = "admin";
    private static String password = "password";
    
    public static boolean loging(String userName, String password){
        boolean isValid = false;
        
        if(UserServices.userName.equals(userName))
            if(UserServices.password.equals(password))
                isValid = true;
        return isValid;
    }
}
