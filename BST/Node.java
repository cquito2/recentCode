//===========================================================
// Carlos Quito 9.16.2019
// Node class to be used in BTS class
//===========================================================
public class Node
{

      private int data;
      private Node right;
      private Node left;
      
      public Node (int val)
      {
            this.data = val;
      }
      
      public int getData()
      {
            return this.data;
      }
      public Node getRight()
      {  
         return this.right;
      }

      public Node getLeft()
      {     
         return this.left;
      }
      
      public void setLeft(Node lAdd)
      {
         //Node lAdd = new Node (val);

         this.left = lAdd;
            
      }
      public void setRight(Node rAdd)
      {
            //Node rAdd = new Node (val);
            this.right = rAdd;
      }

      


}