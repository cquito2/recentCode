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
   
   
   public void viewTree(int n)
   {
         if (root == null)
            System.out.println("This tree is empty");
            
          else 
          {
                Node temp = root; 
                     
                    if ( n ==1 )
                    {
                        System.out.println("preOrder");
                        preOrderT(temp);
                        }
                    
                    else if ( n == 2)
                    {
                        System.out.println("Inoder");
                        inOrderT(temp);
                     }
                        
                    else 
                    {
                        System.out.println("PostOrder");
                        postOrderT(temp);
                     }
                        
               
          }
   
   }
   
   
    private void inOrderT( Node print)
   {
            
           if ( print  != null)
           {
                             
            inOrderT(print.getLeft());
            System.out.println(print.getData());
            inOrderT(print.getRight());
            }
               
   
   }
   private void preOrderT(Node print)
   {
      
        if ( print  != null)
           {
            System.out.println(print.getData());                
            preOrderT(print.getLeft());
            preOrderT(print.getRight());
            }
   
   
   }
   
   private void postOrderT(Node print){
   
        
        if ( print  != null)
           {
                  
            postOrderT(print.getLeft());
            
            postOrderT(print.getRight());
            System.out.println(print.getData());
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