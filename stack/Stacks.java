//================================================================
//Carlos Quito
// unbounded interface of stacks implementation
//interface class obtained from Object Oriented Data Structures 3e
//=================================================================

public class Stacks<T> implements UnboundedStackInterface<T>
{
     protected NodeG <T> top;
    
      public  void pop() throws StackUnderflowException{
         // Throws StcckUnderflowException if this stack is empty. 
         //otherwise removes top element from this stack. 
         if( !isEmpty())
         {
              top = top.getNext();
           }
         else
            throw new StackUnderflowException("You cannot use POP() when stack is empty");
      }
     public T top() throws StackUnderflowException{ 
         //II Throws StackUnderflowException if this stack is empty,
         // II otherwise returns top element from this stack
         if ( !isEmpty())
         {
               return top.getNode();
         
         }
         else
         {
            throw new StackUnderflowException(" There is nothing to view stack is empty");
         }
         
        }         
     public boolean isEmpty() 
      {
         //II Returns true if this stack is empty. otherwi se returns f alse 
         
         if ( top == null )
            return true;
          else
            return false;
             
      }
      
      public void push(T element)
      {
                              
         NodeG <T> nodeAdd = new NodeG<T>(element); 
         nodeAdd.setNext(top);
         top = nodeAdd;
         
      }
}