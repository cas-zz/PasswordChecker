/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package3;
import java.util.regex.*;


public class PasswordChecker {
    public static void main(String[]args){
        String password= "MyP@ssword";
        boolean isValid= isPasswordValid(password);
        if(isValid){
            System.out.println("password is valid");
        }else{
            System.out.println("Password is invalid");
        }
    }
    
    public static boolean isPasswordValid(String password){
        
        if (password== null || password.isEmpty()){
            System.out.println("password cannot be empty");
            return false;
        }
        //password length
        if(password.length() < 8 || password.length()>20){
            System.out.println("password must be between 8 to 20 characters");
            return false;
        }
        
        
        if (!Pattern.compile("[a-z]").matcher(password).find()){
            System.out.println("Password must contain at least one lower case");
            return false;
        }
        
          if (!Pattern.compile("[A-Z]").matcher(password).find()){
            System.out.println("Password must contain at least one upper case");
            return false;
        }
            if (!Pattern.compile("[0-9]").matcher(password).find()){
            System.out.println("Password must contain at least one digit");
            return false;
        }
            
            
             if (!Pattern.compile("[!@#$%^&*()-_=+?]").matcher(password).find()){
            System.out.println("Password must contain at least one symbol");
            return false;
        }
          
          
          
        
        //All checked passed, so the passqword is valid
        return true;
        
        
        
    }
    
    
}
