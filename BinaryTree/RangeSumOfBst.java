package BinaryTree;

public class RangeSumOfBst {
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
     public RangeSumOfBst(){
        root = null;
    }
    public static int rangeSumBST(Node root, int high, int low){
        if(root==null){
            return 0;
        }
        int count = 0;
        if((root.data >=low) && (root.data<=high)){
            //return rangeSumBST(root.left, high, low) + root.data;
            count += rangeSumBST(root, high, low);
        }
        if((root.left.data >=low) && (root.left.data<=high)){
           // rangeSumBST(root, high, low)+ root.left.data;
           count+= rangeSumBST(root.left, high, low);
        }
        if((root.right.data >=low) && (root.right.data<=high)){
           //return rangeSumBST(root, high, low)+ root.right.data;
           count+= rangeSumBST(root.right, high, low);
        }
        return count;
    
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(0);
        root.right.right = new Node(18);
        root.left.right.left = new Node(10);
        System.out.println("Sum of nodes with value between 7 and 15 is: " + rangeSumBST(root, 7, 15));
    }
}
