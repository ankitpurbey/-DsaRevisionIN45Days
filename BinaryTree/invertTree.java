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
        invertTree newNode = new invertTree();
        newNode.add(8);
    }
}

