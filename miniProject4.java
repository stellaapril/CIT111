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
public class miniProject4 {
    public static int numStrawicecream = 0;
    public static int numVansmoothie = 0;
    public static int numBubbletea = 0;
    public static int numWaffle = 0;
    public static int ordericecream = 0;
    public static int ordersmoothie = 0;
    public static int ordertea = 0;
    public static double totalSales = 0.0; 
    public static final double PRICE_STRAWICECREAM = 2.99;
    public static final double PRICE_VANSMOOTHIE = 3.99; 
    public static final double PRICE_BUBBLETEA = 3.49;
    public static final double PRICE_WAFFLE = 0.99;
    public static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("*********************************");
        System.out.println("Welcome to CC Homemade Ice Cream!");
        System.out.println("*********************************\n");
        System.out.println("What can I get for you today?\n");
        System.out.println("---------------------------------------------");
        System.out.println("How many strawberry ice cream would you like?");
        ordericecream = userInput.nextInt( );
        orderStrawicecream(ordericecream);
        System.out.println("---------------------------------------------");
        System.out.println("\nHow many Vanila smoothie would you like?");
        ordersmoothie = userInput.nextInt( );
        orderVansmoothie(ordersmoothie);
        System.out.println("---------------------------------------------");
        System.out.println("\nHow many Bubble tea would you like?");
        ordertea = userInput.nextInt( );
        orderBubbletea(ordertea);
        System.out.println("---------------------------------------------");
        
        displayOrderTotals();
        
    }//close main
    
    public static void orderStrawicecream(int numOrder){
         if(ordericecream>0){
             numStrawicecream= numStrawicecream + numOrder;
             totalSales = totalSales+ numOrder*PRICE_STRAWICECREAM;
             System.out.println("Add a waffle for icecream? Y=1 N=2");
             int addWaffle = userInput.nextInt( );
             if (addWaffle == 1){
                 System.out.println("How many Waffle?");
                 int orderWaffle = userInput.nextInt( );
                 numWaffle = numWaffle + orderWaffle;
                 totalSales = totalSales+numWaffle*PRICE_WAFFLE;
             }//close inner if
             System.out.println("\n"+ordericecream + " Strawberry icecream with "+numWaffle+" Waffle");
        }//close if
    }//close orderStrawicecream
 

    public static void orderVansmoothie(int numOrder){
        if(ordersmoothie>0){
            System.out.println("\n"+ordersmoothie + " Vanilla smoothie!");
            numVansmoothie = numVansmoothie + numOrder;
            totalSales = totalSales + numOrder*PRICE_VANSMOOTHIE;
        }//close if
    }//close vansmoothie method
        
    
    public static void orderBubbletea(int numOrder){
        if(ordertea>0){
            numBubbletea = numBubbletea + numOrder;
            totalSales = totalSales + numOrder*PRICE_BUBBLETEA;
            System.out.println("Green Tea or Black Tea? Green=1 Black=2");
            int teaType = userInput.nextInt( );
            if(teaType==1){
                System.out.println("\n"+ordertea+" Green tea Bubble Tea!");
            }else{
                System.out.println("\n"+ordertea+"Black tea Bubble Tea!");
            }//close inner if/else
        }//close if
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
