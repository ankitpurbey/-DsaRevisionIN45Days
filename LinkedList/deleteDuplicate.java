package LinkedList;

public class deleteDuplicate {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data =data;
            this.next = null;
        }

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
class Solution {
    public Node deleteDuplicates(Node head) {
        if(head==null || head.next ==null){
            return head;
        }
        Node current =head;
        if(head!=null){
        while( current !=null && current.next != null){
            if(current.data ==current.next.data){
                current.next =current.next.next;
            }
            else{
            current = current.next;
            }
        }
        }
        return head;
    }
}
        public static void main(String[] args) {
            
        }
    }
}
