
/**
 * Write a description of class lesson1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//  Hello there 465464565465 cope


// Hey, this is preston.

/*
   This is me demontrating that you can create seperate branches off of the master 
   file, this is primarily used by teams working on github without communication.
   
   From the seperate branches that anyone can create. The Creator of the project 
   is the one to authorize any commits to the master file. They can also revert to older commits
   
   */

import java.util.Scanner;

public class MyClass{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter some number");
            int user_input_number = scan.nextInt();
            System.out.print("The entered value is " );
            System.out.println(user_input_number );
            
        if (user_input_number < 18)   
            System.out.println("Check the id, they may be too young.");
        else if (user_input_number > 18) 
            System.out.println("I see you you can vote.");
        else
            System.out.println("Wow, 18?  Not a chance I would want to be that young again.");
            
            
        System.out.println("What are you doing this weekend?");
        
            
        
        
        Scanner scan2 = new Scanner(System.in);
            String user_input_number2 = scan2.nextLine();
            if (user_input_number2.toLowerCase().contains("hunt"))
                System.out.println("Not season!");
            System.out.print("Are you really ");
            System.out.print(user_input_number2 + "?");
            //teacher(scan3);
       // }
           
        //public static void teacher(String scan3) {     
        System.out.println("Who is your favorite teacher?");
        Scanner scan3 = new Scanner(System.in);
        String favTeacher = scan3.nextLine();
        favTeacher = favTeacher.toLowerCase();
        if (favTeacher.toLowerCase() != "andreasen" ){
            System.out.println("Are you sure?  Maybe you spelled his name wrong.");
           // teacher (text); 
       
        }
        System.out.println("Your my favorite too!");
    }
          
    
    }

    


