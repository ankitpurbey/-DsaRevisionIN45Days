package BinaryTree;
/**
 * createTree
 */
public class createTree {

    public class Node{
        int data;
        Node left, right;
        Node(int val){
            data =val;
            left =right =null;
        }
        Node createSampleTree(){
            Node r = new Node(10);
            Node r.left = new Node(7);
            Node r.right = new Node(20);
        }
    }
}