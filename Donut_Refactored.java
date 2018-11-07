/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object1;

/**
 *
 * @author sitian.chen
 */
public class Donut_Refactored {
    private int percRemaining = 100;
    public String name;
    
    
    public void simulateEating(int percentEaten){
        System.out.println("Inside simulateEating method ");
        percRemaining = percRemaining - percentEaten;
    }//close method
    
    public int getPercRemaining(){
        System.out.println("Inside getPercRemaing method");
        return percRemaining;
    }//close method
    
}//close class
