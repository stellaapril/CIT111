/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2inheritance;
class Student{
    String name;
    int StudID;
    String gender;
    int age;
}//close student

class ElemStudent extends Student{
    String allergies;
    int emergencyContactPhone;
        
}//close ElemStudent

class HighschoolStudent extends Student{
    int phonenumber;
    double GPA;
    
}//close HighschoolStudent

class CollegeStudent extends Student{
    String major;
}//close class
/**
 *
 * @author sitian.chen
 */
public class ParentalPractice {
    public static void main(String[] args){
        
        Student stud = new Student();
        ElemStudent elemStud = new ElemStudent();
        elemStud.name ="Crusoe";
        elemStud.allergies="email,homework,peanut,math";
        elemStud.emergencyContactPhone = 1234561111;
        // I can store a subclass in a variable typed
        //to the superclass!Handy because I can write
        //code that operates on the superclass before
        //the subclass has even been written
        stud = elemStud;
        ElemStudent anotherElemStudVar;
        //type casting the student object to elemstudent 
        anotherElemStudVar = (ElemStudent)stud;
        //demonstrate to your neighbor that you can use instance of 
        //correctly and carry out a typecast see section 11
        
        HighschoolStudent highStud = new HighschoolStudent();
        highStud.name = "Julia";
        highStud.GPA = 3.89;
        highStud.phonenumber = 8888888;
        
        CollegeStudent collegestud = new CollegeStudent();
        
    }//close main
    
}
