

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
    public static Node invert(Node r){
        if(r==null){
            return r;
        }
        Node temp = r.left;
        r.left =r.right;
        r.right = temp;
        invert(r.left);
        invert(r.right);
        return r;
    }
    public static void main(String[] args) {
        invertTree newNode  = new invertTree();
        newNode.root = newNode.new Node(5);
        newNode.root.left = newNode.new Node(2);
        newNode.root.right = newNode.new Node(7);
        invert(null);

    }
}