package LinkedList;

/**
 * reverse
 */
public class reverse {

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    // function for reverse the ll( beat 100% on leetcode)
    public  static Node reversell(Node head){
        if(head==null){
            return head;

        }
        Node prev = null;
        Node curr  = head;
        while(curr!=null){
            Node next = curr.next;
             curr = prev;
             prev = curr;
             curr = next;

        }
        return prev;
    }
    public static void main(String[] args) {
        
    }
}
