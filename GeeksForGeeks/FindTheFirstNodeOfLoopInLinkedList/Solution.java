class Node {
    int data;
    Node next;
    
    Node(int x) {
        data = x;
        next = null;
    }
}


class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        //code here
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        
        if (fast == null || fast.next == null) {
            return -1; // as we didn't got a loop
        }
        
        
        // if we are here which means we got a loop
        
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow.data;
    }
}
