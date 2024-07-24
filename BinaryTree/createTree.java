//package BinaryTree;

/**
 * createTree
 */
public class createTree {
    public class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right=null;
        }
    }
    Node root;
     public createTree(){
        root = null;
    }
    void inOrder(Node r){
        if(r!=null){
            inOrder(r.left);
            System.out.print(r.data + " ");
            inOrder(r.right);
        }
    }


    public static void main(String[] args) {
        createTree newNode = new createTree();
        newNode.root = newNode.new Node(1);
        newNode.root.left = newNode.new Node(2);
        newNode.root.right = newNode.new Node(3);
        newNode.root.left.left = newNode.new Node(4);
        newNode.root.left.right = newNode.new Node(5);
        newNode.inOrder(null);
    }

    
}