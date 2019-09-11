//================================================================
//Carlos Quito
// testing class for linkedlist
//================================================================
package LinkedList;

public class TestLinkedList
{
   // this specific linkedlist implementation does not account for repeating values
   public static void main(String [] args)
   {
      
        //creates a linkedlist using a constructor that takes arguments
         TLinkedList list = new TLinkedList(4);
         //additonal nodes added
         // values do not have to be in order
         list.addNode(11);
         list.addNode(26);
         list.addNode(3);
         list.addNode(1);
         list.addNode(5);
         list.addNode(8);
         list.addNode(3);
         list.addNode(6);
         list.addNode(3);
         //prints linked list after initial nodes added
         System.out.print("Initial LinkedList: " );
         list.printList();
         //deletes node at middle
         list.delNode(3);
         System.out.print("LinkedList after first deletion: " );
         list.printList();
         //deletes node at start
         list.delNode(4);
         System.out.print("LinkedList after second deletion: " );
         list.printList();
         //delets node at end
         list.delNode(6);
         //prints list after deletions
         System.out.print("LinkedList after third deletion: " );
         list.printList();
         // searchs for values which are not in the linked list
         list.delNode(10);
         list.delNode(-2);
         // the remaining values in the linkedlist are reverse 
         TLinkedList re = list.reverse();
         System.out.print("LinkedList before reversal: ");
         re.printList();
         System.out.print("LinkedList after reversal: ");
         list.printList();
         // deletes repeated values
         re.delRepeated(3);
         System.out.print(" LinkedList after removing repeated values: " );
         list.printList();
             
         // add a method to remove all repeating
       
         
   
   } //end of main

}// end of class