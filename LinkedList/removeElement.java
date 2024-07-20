package LinkedList;

public class removeElement {
    
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

    public class Node{
        int data;
        Node next;
        public Node(int val){
            this.data =val;
            this.next = null;
        }
    public Node removeElements(Node head, int val) {
        if(head==null){
            return head;
        }
        while( head!=null && head.val==val){
            head = head.next;
        }

        Node curr = head;
        Node prev = null;

        while(curr!=null){
            if(curr.val == val){
                curr = curr.next;
                prev.next = curr;
            }
            else{
                prev =curr;
                curr = curr.next;
            }
        }
    
        return head;
        
    }
    public static void main(String[] args) {
        
    }
}
}

