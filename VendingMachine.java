/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.HashMap;

/**
 *
 * @author sitian.chen
 */
public class VendingMachine {
    public static void main(String[] args){
        Product coke = new Product();
        coke.name = "coca cola";
        coke.price = 2.75;
        coke.number = "A01";
        
        Product chip = new Product();
        chip.name = "Lays Classic Chip";
        chip.price = 1.99;
        chip.number = "B01";
        
        //hashmap
        HashMap<String,Product> productmap = new HashMap<>();
        productmap.put(coke.number,coke);
        productmap.put(chip.number,chip);
        
        Product retrivedproduct = productmap.get("B01");
        System.out.println(retrivedproduct.name);
        System.out.println(retrivedproduct.price);
        
        Product retrivedproduct2 = productmap.get("A01");
        System.out.println(retrivedproduct2.name);
        System.out.println(retrivedproduct2.price);
    }//close main
    
}//close class
