/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author sitian.chen
 */
public class AgentFactory {
    private static int id = 1000;
    public static Agent genAgent(){
        
        Random r = new Random();
        Agent agent = new Agent();
        agent.setID(id++);
        agent.setStealth(r.nextDouble());
        return agent;
    }//close method
    
    public static void main(String[] args){
        Country c1 = new Country();
        c1.name="USA";
        c1.risk=0.2;
        Country c2 = new Country();
        c2.name="UK";
        c2.risk=0.1;
        Country c3 = new Country();
        c3.name="Iran";
        c3.risk=0.88;
        
        Map<String,Double> map = new HashMap<>();
        map.put(c1.name,c1.risk);
        map.put(c2.name, c2.risk);
        map.put(c3.name, c3.risk);
        
        System.out.println(genAgent().getID());
        System.out.println(genAgent().getID());
        System.out.println(genAgent().getID());
        System.out.println(genAgent().getStealth());

        
        
    }//close main
}
