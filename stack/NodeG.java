
public class NodeG<T>
{
     private T data;
     private NodeG <T> next;
      
   public NodeG()
   {}; 

   public NodeG(T element){
         //set instance variable
         // next can be left alone as it should be null 
         this.data = element; 
         next = null;
   }
   public void setNode(T element)
   {
      this.data = element;
   }
   public void setNext(NodeG<T> link)
   {
         this.next = link;
   }
    
   public T getNode()
   {
      return this.data;
   }
   public NodeG<T> getNext()
   {
      return this.next;
   }
   
   
}