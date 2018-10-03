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
        int userAge = userInput.nextInt();
        boolean continueLooping = true;
        while (continueLooping) {
            System.out.println("Plase enter your age: \n");
            if (userAge > 65.5) {
                System.out.println("Wahho!You can retire!\n");
            } else {
                if (userAge < 0) {
                    System.out.println("Sorry,you are too youg!Keep working!\n");
                    
                }else{
                    System.out.println("Sorry,you are too youg!Keep working!\n");
                    continueLooping = false;
                }
            }
        
        
        }//close inner if/else
    }//close method

}//close class

