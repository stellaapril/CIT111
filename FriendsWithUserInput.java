/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MightWeBeFriends;

//import scanner
import java.util.Scanner;

/**
 *
 * @author cst
 */
public class FriendsWithUserInput {
    public static void main(String[] args){
        System.out.println("********************");
        System.out.println("Might we be friends?");
        System.out.println("********************");
    //container for Q1
    int Q1petquestion;
    // compatability score
    int CompScore = 0;
    
    //crate a scanner object and store
    Scanner userInput = new Scanner(System.in);
    System.out.println("________________________________________________________");
    System.out.println("Q1:Do you like pets? Yes=1 No=2");
    System.out.println("________________________________________________________");
    
    Q1petquestion = userInput.nextInt( );
    //start decision logic
    if(Q1petquestion==1){
        System.out.println("Hey, me too!\n");
        CompScore = CompScore + 10;
        
        System.out.println("________________________________________________________");
        System.out.println("Q1-2:Do you prefer dog or cat? Dog=1 Cat=2");
        System.out.println("________________________________________________________");
        //declare Q2 and create a scanner object
        int Q1dogquestion;
        Q1dogquestion = userInput.nextInt( );
        
        if(Q1dogquestion == 1){
            System.out.println("Great! I'm a dog people,too.\n");
            CompScore = CompScore + 5;
        }else{System.out.println("You might be a cat person!\n");
            CompScore = CompScore - 5;
        }//close Q1-2 if/else
        
    }else{ System.out.println(" :( ");
    }//close Q1 if/else
    System.out.println("________________________________________________________");
    System.out.println("Q2:Do you like to watch movies? Yes=1 No=2");
    System.out.println("________________________________________________________");
    
    int Q2moviequestion;
    Q2moviequestion = userInput.nextInt( );
    
    if(Q2moviequestion == 1){
        System.out.println("Wow!\n");
        CompScore = CompScore + 10;
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("Q2-2: Which type of movie do you prefer? Action, Comedy or Romance?(Choose one and type it)");
        System.out.println("_____________________________________________________________________________________________");
        String Q2typequestion;
        String Action;
        String Comedy;
        String Romance;
        Q2typequestion = userInput.next( );
        
        //response Action
        if(Q2typequestion.equals ("Action")){
            System.out.println("Cool!\n");
            CompScore = CompScore + 5;
        }//close if
        //response Comedy
        if(Q2typequestion.equals("Comedy")){
            System.out.println(":(\n");
            CompScore = CompScore - 5;
        }//close if
        //response Romance
        if(Q2typequestion.equals("Romance")){
            System.out.println("Great! It is my favorite.\n");
            CompScore = CompScore + 10;
        } //close if
        
    }else{System.out.println(" :( ");
    }//close Q2 if/else
    
    System.out.println("________________________________________________________");
    System.out.println("Q3: Do you like travel? Yes=1 No=2");
    System.out.println("________________________________________________________");
    
    //declare Q3
    int Q3travelquestion;
    Q3travelquestion = userInput.nextInt( );
    
    if(Q3travelquestion == 1){
        System.out.println("Great!\n");
        CompScore = CompScore + 10;
        
    }else{System.out.println(":(\n");
    }//closeQ3 if/else
    
    //check of score
    if(CompScore<20){
        System.out.println("**********************************************************************");
        System.out.println(":( According to our compatability score, we probably won't be friends.");
        System.out.println("**********************************************************************");
    }//close if
    
    if(CompScore>=20 && CompScore<40){
        System.out.println("******************************************************");
        System.out.println("Based on our compatability score, we might be friends!");
        System.out.println("******************************************************");
    }// close if  
    
    if(CompScore>=40){
        System.out.println("********************************************************************");
        System.out.println("You get a high score in my decision tree! We might be good friends!:)");
        System.out.println("********************************************************************");
    }//close if
    }//close method
    
}//close class
