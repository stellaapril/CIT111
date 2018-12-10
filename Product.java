/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT111Final;

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
    
    //private variables
    private boolean isProductinstock;
    private int productRemain;
    
    
    //method
    public double getPrice(String number){
        
        return price;
    }//close getPrice method
    
    public String choseProduct(String number){
        
        return name;
    }//close mehtod
    
    public boolean checkInstockornot(){
        if(productRemain >= 30){
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
    
    public static void displayprice(String productNum,String name,double price){
        System.out.println("******************************************");
        System.out.println(productNum+" : "+name);
        System.out.println("Total Price: "+price+" $");
        System.out.println("You can use Credit Card or 5$/10$/20$ cash");
        System.out.println("******************************************");
    }//close method
    
}//close class
