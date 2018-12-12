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
public class GeometricShapes2 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the side length of the cube to calculate its volumn: ");
        
        double usersideLength = userInput.nextDouble();
        
        System.out.println("The volume of a cube with side length "+usersideLength+" is "+calcVolumeOfCube(usersideLength));
        
        
    }//main method close
    
    public static double calcVolumeOfCube(double sideLength){
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    }//close method
    
}
