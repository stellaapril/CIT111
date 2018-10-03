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
public class RetirewithBreak2 {

    public static void main(String[] args) {
        System.out.println("Hello!Welcome to check your retirement status!\n");
        //Scanner
        Scanner userInput = new Scanner(System.in);
        
        boolean continueLooping = true;
        
        while (continueLooping) {
            System.out.println("Plase enter your age: \n");
            int userAge = userInput.nextInt();
            if (userAge > 65.5) {
                System.out.println("Wahho!You can retire!\n");
                
            } else {
                if (userAge < 0) {
                    System.out.println("Thanks for checking your retirement status\n");
                    continueLooping = false;
                }else{
                    System.out.println("Sorry,you are too youg!Keep working!\n");
                    
                }
            }
        
        
        }//close inner if/else
    }//close method

}//close class

