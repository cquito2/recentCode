public class TestBST
{


   public static void main (String[] args)
   {
   
         BST test = new BST();
            //test.viewTree();
            test.insert(10);
            //test.viewTree();
            test.insert(6);
            test.insert(7);
            test.insert(4);
            test.insert(20);
            test.insert (1);
            test.insert(2);
            test.insert(12);
            test.insert(9);
            test.insert(11);
            test.insert(4);
            test.insert(5);
            test.insert(16);
            //test preOrder =1, inOrder =2, postorder = 3 
            test.viewTree(1);
            test.viewTree(2);
            test.viewTree(3);
           
              
   }



}