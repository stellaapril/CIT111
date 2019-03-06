/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.*;
/**
 *
 * @author sitian.chen
 */
public class Linklist {
    
    public static void main(String[] args){
        
        LinkedList<String> planetList = new LinkedList<>();
        planetList.add("Earth");
        planetList.add("Mars");
        planetList.add("Jupiter");
        planetList.add("Venus");
        planetList.add("Uranus");
        planetList.add("Sun");
        planetList.add("Mercury");
        planetList.add("Pluto");
        planetList.add("Neptune");
        planetList.add("Saturn");
        
        String shelff2 = planetList.get(2);
        planetList.remove("Mars");
        planetList.add(2, "Mars");
        System.out.println(planetList);
        
        Iterator<String> iter = planetList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().toUpperCase());
        }//close while
        
        System.out.println( "Pop elements: "+planetList.pop());
    }//close method
}//close class

