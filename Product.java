/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject1210;

import java.util.Scanner;
/**
 *
 * @author sitian.chen
 */
public class Product {
    //public variables
    public double price;
    public String number;
    public String name;
    public String size;
    public int amount;
    
    //private variables
    private boolean isProductinstock;
    private int productRemain;
    
    
    public static void displaymachie(){
        System.out.println("   _____________________________");
        System.out.println("  /                            /|");
        System.out.println(" /                            / |");
        System.out.println("/____________________________/  |");
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
    
    public static String input(){
        System.out.println("Enter the number of item ");
        Scanner userInput = new Scanner(System.in);
        String productNum = userInput.next( );
        return productNum;
    }//close method
            
    public boolean checkInstockornot(){
        if( amount >= 0){
            System.out.println("Product instock :)");
            isProductinstock = true;
        }else{
            System.out.println("Sorry,out of stock");
            isProductinstock = false;
        }//close if/else
        return isProductinstock;
    }//close method
    
    
    
    public int getRemainingproduct(){
        return productRemain;
    }//close method
    
    
    
    public void displayprice(String productNum,String name,double price){
        System.out.println("******************************************");
        System.out.println(name);
        System.out.println("Total Price: "+price+" $");
        System.out.println("******************************************");
    }//close method
    
    public double payment(){
        System.out.println("Payment: Credit Card =1 Cash = 2");
        Scanner keyboard = new Scanner(System.in);
        int userPayment = keyboard.nextInt();
        if (userPayment == 1){
            System.out.println("Please insert your credit card");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("Please remove your card");
            return 0;
        }else{
            System.out.println("Please insert 5$ / 10$ / 20$ (5$=5 / 10$=10 / 20$=20)");
            int userCash = keyboard.nextInt();
            return userCash;
        }//close if/else
    }//close method
    
    public double getChange(double cashamount, double price){
        double change = cashamount - price;
        return change;
    }//close method
    
    public static void displayquarter(double change){
        double quarterNum = change/0.25;
        while(quarterNum>0){
        System.out.println("O\b");
        quarterNum = quarterNum-1;
        }//close while
    }//close method
    
    
}//close class
