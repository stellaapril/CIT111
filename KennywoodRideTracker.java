/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Random

/**
 *
 * @author sitian.chen
 */
public class KennywoodRideTracker {
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    public static final int THRILL_MINHEIGHT = 7;
    public static final int THEME_MINHEIGHT =6;
    
    public static void rideBlackWidow(int riders, int avgHeight){
        if(avgHeight>=THRILL_MINHEIGHT){
            System.out.println("Riding black widow!");
            totalRiders = totalRiders+1;
            
            
        }
        
        
    }//close method2
    
    public static void rideMerryGoRound(int riders, int avgHeight){
        
    }//close method3
    
    public static void printRideStats(){
        
    }//close method4
    
}
