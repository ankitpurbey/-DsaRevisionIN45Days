package BinaryTree;

public class invertTree {
    public class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data =data;
            this.left =null;
            this.right=null;
        }
    }
    public Node root;
     public invertTree(){
        root = null;
    }
    public static Node invert(Node root){
        if(root==null){
            return root;
        }
        Node temp = root.left;
        root.left =root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }

    public static void main(String[] args) {
        invertTree bt = new invertTree();
        bt.root = new Node(4);
        bt.root.left = new Node(2);
        bt.root.right = new Node(7);
        bt.root.left.left = new Node(1);
        bt.root.left.right = new Node(3);
        bt.root.right.right = new Node(6);
    }
}

