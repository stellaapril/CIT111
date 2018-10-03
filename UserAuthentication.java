/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructure;
import java.util.Scanner;
/**
 *
 * @author sitian.chen
 */
public class UserAuthentication {
     public static void main(String[] args){
         System.out.println("Enter your password followed by enter: ");
         Scanner userInput = new Scanner(System.in);
         
         final String correctPassword = "Hello123";
         int limitchance = 3;
         int attemps = 0;
         String userPassword;
         
         while(attemps<limitchance){
             userPassword = userInput.next( );
             if(userPassword.equals(correctPassword)){
             System.out.println("Authentication Successful!");
             //stoplooping
             break;
             }else{
             System.out.println("Failure.Try it again!Enter your password followed by enter:");
             attemps=attemps+1;
             if(attemps>=limitchance){
             System.out.println("Failure to authenticate");
             }//close if/else
             
         }//close if/else
        
        }//close while     
     }//close method
    
}//close class
