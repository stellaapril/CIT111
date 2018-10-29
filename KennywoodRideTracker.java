/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Random;
        /**
         *
         * @author sitian.chen
         */

public class KennywoodRideTracker {

    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    public static final int THRILL_MINHEIGHT = 7;
    public static final int THEME_MINHEIGHT = 6;
    
    public static void main(String[] args){
        printRideStats();
    }

    public static void rideBlackWidow(int riders, int avgHeight) {
        if (avgHeight >= THRILL_MINHEIGHT) {
            System.out.println("Riding black widow!");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
        } else {
            System.out.println(riders + "risers turned away asd : too short!\n");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;

        }//close if/else
    }//close method



    public static void rideMerryGoRound(int riders, int avgHeight){
        if(avgHeight>=THEME_MINHEIGHT){
            System.out.println("Riding MerryGoRound!");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
        }else{
            System.out.println(riders + "risers turned away asd : too short!\n");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }//close if/else
    }//close method3
    
    public static void printRideStats(){
        System.out.println("Total riders: "+totalRiders);
        System.out.println("Total Failed Ride Attempts: "+totalFailedRideAttempts);
        System.out.println("Total sick riders: "+totalSickRiders);
        
    }//close method4
    
}//class close
