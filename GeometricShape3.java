/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2methods;

import java.util.Scanner;

/**
 *
 * @author sitian.chen
 */
public class GeometricShape3 {
      public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        //cube
        System.out.println("Enter the side length of the cube to calculate its volumn: ");
        
        double usersideLength = userInput.nextDouble();
        
        System.out.println("The volume of a cube with side length "+usersideLength+" is "+calcVolumeOfCube(usersideLength));
        System.out.println("---------------------------------------------------------------------------------------------");
        
        //cylinder
        System.out.println("Enter the cylinder radius: ");
        double userRadius = userInput.nextDouble();
        
        System.out.println("Enter the cylinder height: ");
        double userHeight = userInput.nextDouble();
        
        System.out.println("The volume of a cylinder with radius: "+userRadius+
                "\nand height of "+userHeight+" is "+calcVolumnOfCylinder(userRadius,userHeight));
        
        
        
    }//main method close
    
    public static double calcVolumeOfCube(double sideLength){
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    }//close method
    
    public static double calcVolumnOfCylinder(double radius,double height){
        final double PI=3.1416;
        double cylinderVolume = PI*(radius*radius)*height;
        return cylinderVolume;
    }//close method
    
}//close class
