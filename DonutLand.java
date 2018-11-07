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
public class DonutLand {
    public static void main(String[] args){
        Donut firstDonut = new Donut();
        firstDonut.name = "Stella";
        firstDonut.dounutId = 100;
        System.out.println("Check FirstDonut %: "+firstDonut.getPercRemaining() );
        firstDonut.simulateEating(20);
        System.out.println("Check FirstDonut %: "+firstDonut.getPercRemaining());
        
    }//close method
    
    
    
}
