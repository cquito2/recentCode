//================================================================
//Carlos Quito
// unbounded interface implementation of stacks. 
//interface class obtained from Object Oriented Data Structures 3e
//this is the tester class
//=================================================================

import java.util.Scanner;

public class RevStrings
{
      public static void main ( String [] args)
      {
      
                   
          Stacks<String> stack = new Stacks<String>(); 
          String rev = "white";
          System.out.println( "The string to reverse is: " + rev);
          //pushes chars into stack
          for ( int i = 0; i < rev.length(); i++)
          {
               stack.push(rev.charAt(i)+"");
               
          }
          //pops items from stack and prints data 
          System.out.print("Reverse string is: " );         
          while ( !stack.isEmpty())
          {
               System.out.print( stack.top() +"");
               stack.pop();
          
          }   
          System.out.println();
          //checks for exception handling on pop
          stack.pop();  
          // checks for exception handling for Top
          stack.top();    
                   
      }



}