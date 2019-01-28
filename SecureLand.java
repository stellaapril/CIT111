/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Passwordstrengthmachine;

/**
 *
 * @author sitian.chen
 */
public class SecureLand {
    public static void main(String[] args){
        StrengthChecker SC = new StrengthChecker();
        
        String[] req = new String[2];
        
        SC.SetRequiredChara(req);
        SC.Setlength(8, 50);
        
    }//close main
    
}//close class
