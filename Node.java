//================================================================
//Carlos Quito 
// basic implementation of a integer Node class
//================================================================
package LinkedList;

public class Node
{
      int data;
      Node next;
      
   public Node()
   {}; 

   public Node(int toSet){
         //set instance variable
         // next can be left alone as it should be null 
         this.data = toSet; 
   }

    
   public int getNode()
   {
      return this.data;
   }
   

}