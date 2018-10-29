/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

/**
 *
 * @author sitian.chen
 */
public class miniProject {
    public static int numStrawicecream = 0;
    public static int numVansmoothie = 0;
    public static int numBubbletea = 0;
    public static double totalSales = 0.0; 
    public static final double PRICE_STRAWICECREAM = 2.99;
    public static final double PRICE_VANSMOOTHIE = 3.99; 
    public static final double PRICE_BUBBLETEA = 3.49;
    
    
    public static void main(String[] args){
        
    }//close main
    
    public static void orderStrawicecream(int numOrder){
        System.out.println("Strawberry icecream!");
         numStrawicecream= numStrawicecream + numOrder;
         totalSales = totalSales+ numOrder*PRICE_STRAWICECREAM;
         
        
        
    }//close orderStrawicecream
    
    public static void orderVansmoothie(int numOrder){
        System.out.println("Vanilla smoothie!");
        numVansmoothie = numVansmoothie + numOrder;
        
        
    }//close method
    
    public static void displayOrderTotals(){
        System.out.println("******ORDER TOTAL******");
        System.out.println("TOTAL Strawberry icecream: "+ numStrawicecream);
        System.out.println("TOTAL Vanilla smoothie: "+numVansmoothie);
        
    }//close method
    
            
}//close class


 