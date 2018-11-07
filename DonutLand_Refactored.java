/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object1;

/**
 *
 * @author sitian.chen
 */
public class DonutLand_Refactored {
    public static void main(String[] args){
        
        final int firstBiteSize = 12;
        
        Donut firstDonut = new Donut();
        firstDonut.name = "Stella";
        
        Donut secondDonut = new Donut();
        secondDonut.name = "Ted";
        
        Donut thirdDonut = new Donut();
        thirdDonut.name = "Robin";
        
        printDivider();
        printObjectData(firstDonut);
        
        printDivider();
        printObjectData(secondDonut);
        
        
        
        System.out.println("When first created, "+firstDonut.name+"'s\n"
                +"percent remaining is " + firstDonut.getPercRemaining());
        
        printDivider();
        
        System.out.println("Calling simulateEating and passin in\n" +
                "a bite size of " + firstBiteSize);
        
        printDivider();
        
        firstDonut.simulateEating(firstBiteSize);
        
        System.out.println("After being eaten, "+ firstDonut.name + "'s\n"
                + "percent remaining is "+ firstDonut.getPercRemaining());
        
    }//close method
    public static void printObjectData(Donut d){
        System.out.println("Name: "+ d.name);
        System.out.println("PercRemaining: "+ d.getPercRemaining());
        System.out.println("In printObjectData, received donut: " + d.name);
        
    }//close method
    
    public static void  printDivider(){
        System.out.println("................STATS.................");
    }
    
}
