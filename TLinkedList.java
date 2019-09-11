//================================================================
//Carlos Quito
// LinkedList class implemenetation
//=================================================================
package LinkedList;

public class TLinkedList
{

      Node head,tail; 
      // default constructor
      public TLinkedList()
      {};
      
      //constructor with arguments
      public TLinkedList(int n)
      {
      
            head = new Node (n);
            tail = head;      
      }    
       
    // this method adds a nodes to the linked list 
     public Node addNode( int data)
     {
          Node temp;
          Node add = new Node(data);
    
          if ( head == null)
           {
            head = add;  
            tail = add;                     
           } 
          else
          {
             temp = head;
             while( temp.next!= null)
             {
                 
                   temp = temp.next; 
              }
               
                temp.next = add;
                tail = add;
                         
              }  
               
          return head;         
        } // end of add
          
         
         
          //this method deletes at the begining, middle, and end of a linkedlist
          // additionally it prints if the value is found or not 
          public void delNode(int del)
          {
               
               
               if( del == head.getNode())
               {
                  Node temp = head;
                  System.out.println("Node Deleted at position = 1 value = " + del);
                  
                  temp = temp.next;
                  head = temp;
                  
               }
               else
               {
                     Node temp = head;  
                     int count = 1;
                     boolean notfound = false;
                    
                     while ( temp.next != null)
                     {
                          count++;
                          if (temp.next.data == del)
                           {
                              notfound = true;
                              break; 
                            }  
                          temp= temp.next;
                          
                                                                    
                     }
                     
                     if ( notfound == false)
                        System.out.println("value = " + del + " is not in list");
                        
                     else
                     {                      
                         System.out.println("Node deleted at positions = " + count + " with value = "+ temp.next.data);
                         Node cur = temp.next.next;
                         temp.next = cur;
                     }   
                     
               
               }
               
                
          }
          
          // delete repeated values 
          public void delRepeated(int n )
          {
               Node temp = head;
               
               while( temp != null)
               {
                        if (temp.data == n)
                           delNode(n);
                       
                      temp = temp.next;                           
                                 
               }
          
          }
          
          
          // method prints list
          public void printList()
          {
               Node temp = head; 
               while (temp != null)
               {
                  System.out.print(temp.data + " ");
                  temp = temp.next;
               }
               System.out.println();
               
           }
           
           // this method returns a reversed linkedlist
           public TLinkedList reverse()
           {
               TLinkedList reversed= new TLinkedList();
               
               Node curr = head;
               Node rev=null;
               while ( curr != null)
               {
                  Node temp = new Node(curr.data);
                   
                  
                   if(rev == null)
                     rev = temp;
                     
                   else
                   {
                        temp.next = rev;
                        rev = temp;
                   }                  
                   
                   curr=curr.next;
                                    
               }//end while
               reversed.head = rev;
               return reversed;
                            
           
           }
          
          
                 

}//end of class 

