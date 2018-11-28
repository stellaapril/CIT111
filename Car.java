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
public class Car {
    //public variables
    public int year;
    public String makeModel;
    
    //private variables
    private boolean isEngineRunning = false;
    private double speed;
    
    //method
    public void startEngine(){
        isEngineRunning = true;
        System.out.println("..crank..crank..Car start!");
    }//close startEngine method
    
    public void stopEngine(){
         isEngineRunning = false;
         System.out.println("Car stop!");
         System.out.println("value is engine running"+ isEngineRunning);
        
    }//close method
    
    //return mehtod
    public boolean checkEngineStatus(){
        if (isEngineRunning == true ){
            System.out.println("Engine is running");
        }else{
            System.out.println("Engine is not running");
        }//close if/else
        
        return isEngineRunning;
    }//close method
    
    public double getCurrentSpeed(){
     
        return speed;
    }//close method
    
    public double accelerate(int mphIncrease){
        speed = speed + mphIncrease;
        return speed;
    }//close method
    
    public double decelerate(int mphDecrease){
        speed = speed - mphDecrease;
        return speed;
    }//close method
    
}//close class
