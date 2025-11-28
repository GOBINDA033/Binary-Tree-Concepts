 class Node {
    int data;
    Node left;
    Node right;
    //this is a constructor
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
    //main method
    public class Main1{
        public static void main(String args[]){
            Node root=new Node(10);
            root.left=new Node(20);
            root.right=new Node(30);
            root.left.left=new Node(40);
            root.left.right=new Node(50);
            root.right.left=new Node(60);
            root.right.right=new Node(70);
            System.out.println(root.data);
            System.out.println(root.left.data);
            System.out.println(root.right.data);
            System.out.println(root.left.left.data);
            System.out.println(root.left.right.data);
            System.out.println(root.right.left.data);
            System.out.println(root.right.right.data);
        }

    
}
