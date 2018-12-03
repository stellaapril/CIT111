/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author sitian.chen
 */
public class Product {
    //public variables
    public double price;
    public String number;
    public String name;
    
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
    
}//close class
