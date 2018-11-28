/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

/**
 *
 * @author sitian.chen
 */
public class CarLand {
    public static void main(String[] args){
        //car1
        Car deLorean = new Car();
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
        
        //car4
        Car fordSuper = new Car();
        fordSuper.year = 1946;
        fordSuper.makeModel = "Ford Super De Luxe";
        
        //car5
        Car pacKard = new Car();
        pacKard.year = 1948;
        pacKard.makeModel = "Packard Custom Eight Victoria";
        
        //car6
        Car toyoTa = new Car();
        toyoTa.year = 1985;
        toyoTa.makeModel = "Toyota Xtra Cab 4x4";
        
        //send car instance to a helper method to print its member variables
        displayCarStats(toyoTa);
        //test its mehtods
        toyoTa.startEngine();
        toyoTa.accelerate(88);
        toyoTa.decelerate(12);
        //check status again
        displayCarStats(toyoTa);
        toyoTa.stopEngine();
        displayCarStats(toyoTa);
        
        
        
        
        
        
    }//close main method
    
    public static void displayCarStats( Car anyCarObject){
        System.out.println("*****STATS*****");
        System.out.println(anyCarObject.year + " "+ anyCarObject.makeModel);
        System.out.println("Engine running?" + anyCarObject.checkEngineStatus());
        System.out.println("CurrentSpeed " + anyCarObject.getCurrentSpeed());
        System.out.println("***************");
        
    }//close 
    
}//close class
