//===========================================================
// Carlos Quito 9.16.2019
// Node class to be used in BTS class
//===========================================================


// class should implement insert, delete, and traverse inorder, preorder, postoder
// this class should also ensure that that the tree is balanced when removing a node.



public class BST
{

   Node root;
   
   public void insert( int  val)
   {
    
    
      if (root == null)
      {
         System.out.println( val + " is your root");
         root = new Node(val);
        
      }
      else
      {
         Node temp = root;
         toInsert(temp,val);
         
       }                       
   }
   
   
   public void viewTree()
   {
         if (root == null)
            System.out.println("This tree is empty");
            
          else 
          {
               if ( root.getLeft() != null)
                  System.out.println( root.getData() + " " + root.getLeft().getData());
               
          }
   
   }
   
   
   // assume tree is not empty
   private Node toInsert(Node tr, int val)
   {
       
       if ( tr.getLeft() == null &&  val < tr.getData())
       {
           Node l = new Node (val);
           tr.setLeft(l);
           System.out.println( val + " is added at left");

          return tr;         
       }
        if(tr.getRight() == null && val > tr.getData())
       {
                        Node r = new Node (val);
            tr.setRight(r);
            System.out.println( val + " is added at Right");
            return tr;
       }
       
       if ( tr.getData() > val)
       {
         System.out.println(" this is a call to Left side: " + tr.getData());

         return toInsert(tr.getLeft(), val);
         }
       else if ( tr.getData()< val)
       {
         System.out.println(" this is a call to Right side: " + tr.getData());
         
         return toInsert(tr.getRight(), val);
         
       }
       return tr;
            

       
       
       
       
           
   }
   
   
   
     
}