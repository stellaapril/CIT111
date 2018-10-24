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
public class GeometricShapes4 {
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
        System.out.println("-------------------------------------------------------------------");
        
        //rhombus
        System.out.println("Enter the rhombus first diagonal ");
        double num1Diagonal = userInput.nextDouble();
        
        System.out.println("Enter the rhombus second diagonal");
        double num2Diagonal = userInput.nextDouble();
        
        System.out.println("The volume of a rhombus with diagonal: "+num1Diagonal+" and "+num2Diagonal+" is "+calcVolumeOfRhombus(num1Diagonal,num2Diagonal));
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        
        //triangle
        System.out.println("Enter the triangle sidelength ");
        double userTrianSidelength = userInput.nextDouble();
        
        System.out.println("Enter the triangle height ");
        double userTrianHeight= userInput.nextDouble();
        
        System.out.println("The volume of a triangle with sidelenth: "
                +userTrianSidelength+" and "
                +userTrianHeight
                +" is "
                +calcVolumOfTriangle(userTrianSidelength, userTrianHeight));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        //triangular pyramid 
        System.out.println("Enter the triangular pyramid height");
        double userPyramidHeight = userInput.nextDouble();
        System.out.println("The volume of pyramid with triangle base we just got and height "+userPyramidHeight+" is "+calcVolumeOfPyramid(userTrianSidelength,userTrianSidelength,userPyramidHeight));
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        
    }//main method close
    
    public static double calcVolumeOfCube(double sideLength){
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    }//close cube method
    
    public static double calcVolumnOfCylinder(double radius,double height){
        final double PI=3.1416;
        double cylinderVolume = PI*(radius*radius)*height;
        return cylinderVolume;
    }//close cylinder method
    
    public static double calcVolumeOfRhombus(double diagonal1, double diagonal2){
        double rhombusVolume = (diagonal1*diagonal2)/2;
        return rhombusVolume;
        
    }//close rhombus method
    
    public static double calcVolumOfTriangle(double sideLength,double height){
        double triangleVolume = (sideLength*height)/2;
        return triangleVolume;
    }//close triangle method
    
    public static double calcVolumeOfPyramid(double sideLength, double height1,double height2){
        double base = calcVolumOfTriangle(sideLength, height1);
        double PyramidVolume = (base*height2)/3;
        return PyramidVolume;
    }//close triangular pyramid 
    
}//close class
