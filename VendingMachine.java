/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject1210;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author sitian.chen
 */
public class VendingMachine {
      public static void main(String[] args){
        Product doricheese = new Product();
        doricheese.name = "Doritos Cheese";
        doricheese.price = 1.75;
        doricheese.size = "1.25oz";
        doricheese.number = "A01";
        doricheese.amount = 10;
        
        Product layclassic = new Product();
        layclassic.name = "Lay's Chip Classic";
        layclassic.price = 1.75;
        layclassic.size = "1.5oz";
        layclassic.number = "A02";
        layclassic.amount = 10 ;
        
        Product smartpop = new Product();
        smartpop.name = "Smartfood Popcorn";
        smartpop.price = 1.5;
        smartpop.size = "2oz";
        smartpop.number = "A03";
        smartpop.amount = 10 ;
        
        Product mmchocolate = new Product();
        mmchocolate.name = "M&M milk chocolate";
        mmchocolate.price = 1.25;
        mmchocolate.size = "1.69oz";
        mmchocolate.number = "B01";
        mmchocolate.amount = 10 ;
        
        Product oreo = new Product();
        oreo.name = "Oreo Cookies Vanilla Cream";
        oreo.price = 2;
        oreo.size = "70g";
        oreo.number = "B02";
        oreo.amount = 10 ;
        
        Product nuts = new Product();
        nuts.name = "Planters Salted nuts";
        nuts.price = 1.5;
        nuts.size = "1.5oz";
        nuts.number = "B03";
        nuts.amount = 10 ;
        
        Product coke = new Product();
        coke.name = "Coca Cola";
        coke.price = 1.75;
        coke.size = "20 fl oz";
        coke.number = "C01";
        coke.amount = 10 ;
        
        Product dietcoke = new Product();
        dietcoke.name = "Dite Coke";
        dietcoke.price = 1.75;
        dietcoke.size = "20 fl oz";
        dietcoke.number = "C02";
        dietcoke.amount = 10 ;
        
        Product sprite = new Product();
        sprite.name = "Sprite";
        sprite.price = 1.75;
        sprite.size = "20 fl oz";
        sprite.number = "C03";
        sprite.amount = 10 ;
        
        Product vitaminzero = new Product();
        vitaminzero.name = "Vitamin Water Zero pineapple coconut";
        vitaminzero.price = 2.25;
        vitaminzero.size = "20 fl oz";
        vitaminzero.number = "D01";
        vitaminzero.amount = 10 ;
        
        Product drpep = new Product();
        drpep.name = "Dr.Peper";
        drpep.price = 1.75;
        drpep.size = "20 fl oz";
        drpep.number = "D02";
        drpep.amount = 10 ;
        
        Product water = new Product();
        water.name = "Dasani Purified Water";
        water.price = 1.75;
        water.size = "12 fl oz";
        water.number = "D03";
        water.amount = 10 ;
    
        
        
        //hashmap
        HashMap<String,Product> productmap = new HashMap<>();
        productmap.put(doricheese.number,doricheese);
        productmap.put(layclassic.number,layclassic);
        productmap.put(smartpop.number,smartpop);
        productmap.put(mmchocolate.number,mmchocolate);
        productmap.put(oreo.number,oreo);
        productmap.put(coke.number,coke);
        productmap.put(dietcoke.number,dietcoke);
        productmap.put(sprite.number,sprite);
        productmap.put(vitaminzero.number,vitaminzero);
        productmap.put(drpep.number,drpep);
        productmap.put(water.number,water);
        
        /**
        Product retrivedproductA01 = productmap.get("A01");
        System.out.println(retrivedproductA01.name);
        System.out.println(retrivedproductA01.price);
        
        Product retrivedproductA02 = productmap.get("A02");
        System.out.println(retrivedproductA02.name);
        System.out.println(retrivedproductA02.price);
        
        Product retrivedproductA03 = productmap.get("A03");
        System.out.println(retrivedproductA03.name);
        System.out.println(retrivedproductA03.price);
        
        */
        Product.displaymachie();
        //Choose your item 
        System.out.println("Enter the number of item ");
        Scanner userInput = new Scanner(System.in);
        String productNum = userInput.next( );
        
        Product retrivedproductX = productmap.get(productNum);
        //Check instock or not
        boolean inStockornot;
        isStockornot = 
        retrivedproductX.checkInstockornot();
        if(retrivedproductX.isProductinstock){
            break;
        }else{
            break;
        }//close mehtod
        
        
        //purchase
        retrivedproductX.displayprice(productNum,retrivedproductX.name,retrivedproductX.price);
        retrivedproductX.payment();
        
        //get your change
        retrivedproductX.getChange(1, retrivedproductX.price);
        Product.displayquarter(1);
        
    }//close main
    
    
    public static void displaychange(){
        
    }//close method
    
}
