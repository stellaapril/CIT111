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
public class FriendsWithUserInput {
    public static void main(String[] args){
        System.out.println("Might we be friends?");
        //container for storing user input.No initial value given.
        int RESPONSE_HIKING;
        int RESPONSE_PHOTOGRAPHY;
        int compScore = 0;
        
        //Scanner
        Scanner keyboardReader = new Scanner(System.in);

        
        System.out.println("Q1/1:Do you like hiking? (0=no,1=yes)");
        
        RESPONSE_HIKING= keyboardReader.nextInt();
        
        if(RESPONSE_HIKING==1){
            compScore = compScore + 10;
            System.out.println("Great!");
            System.out.println("Your compatability score is:"+ compScore);
        }else{
            System.out.println("...you must like it if you tired!");
        }//end if/else blocks
        
        System.out.println("Q2/2:Do you like photograpy?(0=no,1=yes)");
            RESPONSE_PHOTOGRAPHY = keyboardReader.nextInt();
            
            if(RESPONSE_PHOTOGRAPHY == 1){
            compScore = compScore + 10;
            System.out.println("Great!");
            System.out.println("Your compatability score is:"+ compScore);
        } else {
            System.out.println("...you must like it if you tired!");
        }//end if/else blocks
            
            
            
            
            
        if(compScore > 10) {
            System.out.println("We Might Be Friends!");
        } else{ 
            System.out.println("We Probably Won't Be Friends.");
        }

        
        
        
        
        
            
                    
                    
        }
        
        
}
