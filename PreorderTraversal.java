class Node{
    int data;
    Node left;
    Node right;
    //Now i will create a constructor
    Node(int data)
    {
this.data=data;
this.left=right=null;
    }

}
public class PreorderTraversal
{
    //now  i will create a main method 
    public static void main(String args [])
    {
Node root=new Node(10);
root.left=new Node(20);
root.right=new Node(30);
root.right.left=new Node(40);
root.right.left.left=new Node(60);
root.right.right=new Node(50);
System.out.println("Print the all possible value in preorder traversal");
 System.out.println(root.data);
     System.out.println(root.left.data);
     System.out.println(root.right.data);
     System.out.println(root.right.left.data);
     System.out.println(root.right.left.left.data);
     System.out.println(root.right.right.data);

    }
}