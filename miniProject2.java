/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2;

import java.util.Scanner;

/**
 *
 * @author cst
 */
public class miniProject2 {
    public static int numStrawicecream = 0;
    public static int numVansmoothie = 0;
    public static int numBubbletea = 0;
    public static int numWaffle = 0;
    public static double totalSales = 0.0; 
    public static final double PRICE_STRAWICECREAM = 2.99;
    public static final double PRICE_VANSMOOTHIE = 3.99; 
    public static final double PRICE_BUBBLETEA = 3.49;
    public static final double PRICE_WAFFLE = 0.99;
    public static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("******************************");
        System.out.println("Welcome to Homemade Ice Cream!");
        System.out.println("******************************");
        System.out.println("What can I get for you today? Strawberry ice cream=1 Vanila smoothie=2 Bubbletea=3 ");
        int userChoice = userInput.nextInt( );
        switch (userChoice) {
            case 1:
                System.out.println("How many strawberry ice cream would you like?");
                int userOrder = userInput.nextInt( );
                orderStrawicecream(userOrder);
                break;
            case 2:
                System.out.println("How many Vanila smoothie would you like?");
                userOrder = userInput.nextInt( );
                orderVansmoothie(userOrder);
                break;
            default:
                System.out.println("How many Bubble tea would you like?");
                userOrder = userInput.nextInt( );
                orderBubbletea(userOrder);
                break;
        }
        
        displayOrderTotals();
        
                
        
    }//close main
    
    public static void orderStrawicecream(int numOrder){
        System.out.println("Strawberry icecream!");
         numStrawicecream= numStrawicecream + numOrder;
         totalSales = totalSales+ numOrder*PRICE_STRAWICECREAM;
         System.out.println("Add a waffle? Y=1 N=2");
         int addWaffle = userInput.nextInt( );
         if (addWaffle == 1){
             System.out.println("How many Waffle would you like?");
             int orderWaffle = userInput.nextInt( );
             numWaffle = numWaffle + orderWaffle;
             totalSales = totalSales+numWaffle*PRICE_WAFFLE;
         }//close if
    }//close orderStrawicecream
    
    public static void orderVansmoothie(int numOrder){
        System.out.println("Vanilla smoothie!");
        numVansmoothie = numVansmoothie + numOrder;
        totalSales = totalSales + numOrder*PRICE_VANSMOOTHIE;
    }//close vansmoothie method
        
    
    public static void orderBubbletea(int numOrder){
        System.out.println("Bubble Tea");
        numBubbletea = numBubbletea + numOrder;
        totalSales = totalSales + numOrder*PRICE_BUBBLETEA;
        
    }//clouse bubbletea method
    
    
    public static void displayOrderTotals(){
        System.out.println("******************ORDER TOTAL****************");
        System.out.println("TOTAL Strawberry icecream: "+ numStrawicecream);
        System.out.println("TOTAL Waffle: "+ numWaffle);
        System.out.println("TOTAL Vanilla smoothie: "+numVansmoothie);
        System.out.println("TOTAL Bubble Tea: "+numBubbletea);
        System.out.println("TOTAL SALES: "+ totalSales);
        System.out.println("*********************************************");
        
    }//close method
    
    
}//close class
