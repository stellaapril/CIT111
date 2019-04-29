/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author sitian.chen
 */
public class ClassAttendee implements OverrideMe{
    @Override
    public void goToClass(String s){
        
    }//close method
    
    @Override
    public void participateInClass(String s){
        System.out.println("i'm in class");
    }//close method

    @Override
    public void departInClass(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void flingRubberBandsInClass(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
