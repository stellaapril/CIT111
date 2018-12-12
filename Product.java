/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT111Final3;

import java.util.Scanner;

/**
 *
 * @author cst
 */
public class Product {
    
      //public variables
    public double price;
    public String number;
    public String name;
    public String size;
    public int amount;
    public String item;
    
    //private variables
    private boolean isProductinstock;
    private boolean useCard;
    private int productRemain;
    
    
    public static void displaymachie(){
        System.out.println("   _____________________________");
        System.out.println("  /                            /|");
        System.out.println(" /                            / |");
        System.out.println("/____________________________/  |");
        System.out.println("|     VENDING MACHINE       |   |");
        System.out.println("|___________________________|   |");
        System.out.println("|  A01  |   A02  |  A03 |   |   |");
        System.out.println("|_______________________|   |   |");
        System.out.println("|  B01  |   B02  |  B03 |   |   |");
        System.out.println("|_______________________|---|   |");
        System.out.println("|  C01  |   C02  |  C03 | | |   |");
        System.out.println("|_______________________| | |   |");
        System.out.println("|  D01  |   D02  |  D03 |---|   |");
        System.out.println("|_______________________|   |   |");
        System.out.println("|                       |   |  /");
        System.out.println("|_______________________|   | / ");
        System.out.println("|_______________________|___|/ ");
        System.out.println("                                ");
        
    }//close method
    
    public static void displayProductdetail(){
        System.out.println("                             ");
        System.out.println("_____________________________"); 
        System.out.println("|  A01   |   A02   |  A03   |");
        System.out.println("|Doritos |  Chip   |Popcorn |");
        System.out.println("|________|_________|________|");
        System.out.println("|  B01   |   B02   |  B03   |");
        System.out.println("|  m&m   |  OREO   |  Nuts  |");
        System.out.println("|________|_________|________|");
        System.out.println("|  C01   |   C02   |  C03   |");
        System.out.println("|  Coke  |Diet Coke| Sprite |");
        System.out.println("|________|_________|________|");
        System.out.println("|  D01   |   D02   |  D03   |");
        System.out.println("|VitaZero| Dr.Peper|  Water |");
        System.out.println("|________|_________|________|");
        System.out.println("                             ");
        
    }//close method
    
    //check instock or not method       
    public boolean checkInstockornot(){
        if(amount > 0){
            isProductinstock = true;
        }else{
            isProductinstock = false;
        }//close if/else
        return isProductinstock;
    }//close method
    
    //display product price method
    public void displayprice(int amount,String name,double price,String size){
        System.out.println("                                          ");
        System.out.println("-------------------------------------------");
        System.out.println(name);
        System.out.println("Size:"+ size);
        System.out.println("Total Price: "+price+"$");
        System.out.println("Instock: "+ amount);
        System.out.println("-------------------------------------------");
        
    }//close method
    double finalprice;
    public void totalprice(int number, double price){
       
        finalprice = number*price;
        System.out.println("Your total price is"+finalprice); 
        
        
    }//close method
    
    public double getfinalprice(){
        return finalprice;
    }
    
    
    public int itemnum;
    public void itemNum(){
        System.out.println("How many items do you like to purchase?");
        Scanner userInput1 = new Scanner(System.in);
        itemnum = userInput1.nextInt();
        System.out.println("\n-------------------------------------------");
    }//close method
    
    
    public int getNum(){
        
        return itemnum;
    }//close method
    
    //choose payment method
    public boolean payment(){
        
        
        System.out.println("Payment:  Credit Card =1    Cash = 2");
        Scanner keyboard = new Scanner(System.in);
        int userPayment = keyboard.nextInt();
        if (userPayment == 1){
            System.out.println("Please insert your credit card");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("Please remove your card");
            System.out.println("-------------------------------------------\n");
            System.out.println("Would you like to print your receipt? Y=1 N=2");
            int userreceipt = keyboard.nextInt();
            if(userreceipt == 1){
                
                cardReceipt();
            }else{
                System.out.println("Thank you!");
            }//close inner if/else
            useCard = true;
        }else{
            System.out.println("Please insert 5$ / 10$ / 20$ \n"
                    + "(5$=5 / 10$=10 / 20$=20)");
            int userCash = keyboard.nextInt();
            System.out.println("-------------------------------------------\n");
            if(userCash >= getfinalprice()){
                System.out.println("Would you like to print your receipt? Y=1 N=2");
                int userreceipt = keyboard.nextInt();
                if(userreceipt ==1){
                    
                    cashReceipt(userCash,getChange(userCash, getfinalprice()));
                 
                }else{
                     System.out.println("Thank you!");
                    }//close inner if/else
                displayquarter(getChange(userCash, price));
                
            }else{
                System.out.println("Sorry. Insert cash is not enough to purchase.");
                System.out.println("-------------------------------------------\n");
            }
            //get your change
            
            useCard = false;
        }//close if/else
        
        return useCard;
    }//close method
    
    //change method
    public double getChange(double cashamount, double finalprice){
        double change = cashamount - finalprice;
        
        return change;
    }//close method
    
    
    //display quarter meethod
    public static void displayquarter(double change){
        double quarterNum = change/0.25;
        System.out.println("\n-------------------------------------------");
        System.out.println("Here are your change: "+ quarterNum +" quarters ");
        while(quarterNum>0){
            System.out.print(" o ");
            quarterNum = quarterNum-1;
        }//close while
        System.out.println("\n-------------------------------------------");
        System.out.println("                                       ");
    }//close method
    
    //receipt method
    public void cardReceipt(){
        System.out.println("                                       ");
        System.out.println("                                       ");
        System.out.println("******************RECEIPT******************");
        System.out.println("PAYMENT: CARD# ************0414");
        System.out.println("                                           ");
        System.out.println("                                           ");
        System.out.println("DATE:                             12/12/2018");
        System.out.println(name+"    @"+getNum()+"    "+price+"$");
        System.out.println("TOTAL:    "+finalprice+"$");
        System.out.println("                                           ");
        System.out.println("                                           ");
        System.out.println("                                           ");
        System.out.println("                                           ");
        System.out.println("               Customer Copy               ");
        System.out.println("*******************************************");
    }//close mehtod
    
    public void cashReceipt(double usercash,double totalChange ){
        System.out.println("                                       ");
        System.out.println("                                       ");
        System.out.println("******************RECEIPT******************");
        System.out.println("DATE:                             12/12/2018");
        System.out.println("PAYMENT: CASH");
        System.out.println("                                           ");
        System.out.println("                                           ");
        System.out.println(name +"@"+getNum()+"   "+price+"$");
        System.out.println("TOTAL:     "+finalprice+"$");
        System.out.println("PAY:       "+usercash+"$");
        System.out.println("CHANGE:    "+totalChange+"$");
        System.out.println("                                           ");
        System.out.println("                                           ");
        System.out.println("                                           ");
        System.out.println("                                           ");
        System.out.println("               Customer Copy               ");
        System.out.println("*******************************************");
    }//close method
    
}
