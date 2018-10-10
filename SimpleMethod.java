/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2methods;

import java.math.BigInteger;

/**
 *
 * @author sitian.chen
 */
public class SimpleMethod {
    public static void main(String[] args){
        System.out.println("This code is inside method:main");
        
        printStatment();
        System.out.println("...back in mian");
                
    }
    
    public static void printStatment(){
        System.out.println("********INSIDE printStatment********");
        System.out.println("Steatement:Where There's a Will, There's a Way");
        System.out.println("**********************************************");
    }
    
    public static void generateBigNumber(){
        Random r = new Random();
        BigInteger bigInt = new BigInteger(100,r);
        
    }
    
}
