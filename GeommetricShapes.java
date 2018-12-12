/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2methods;

/**
 *
 * @author sitian.chen
 */
public class GeommetricShapes {
    public static void main(String[] args){
        double returenedVolume = calcVolumeOfCube(50.0);
        System.out.println("The volum of cube with side length 50"+ returenedVolume);
       
        //guts
    }//close main
    
    public static double calcVolumeOfCube(double sideLength){
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    }//close method
    
}//close class
