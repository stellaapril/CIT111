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
public class Donut {
    private int percRemaining = 100;
    public String name;
    public int dounutId;
    
    public void simulateEating(int percentEaten){
        System.out.println("Taking a bite of donut! ");
        
        percRemaining = percRemaining - percentEaten;
    }//close method
    
    public int getPercRemaining(){
        return percRemaining;
    }//close method
    
}//close class
