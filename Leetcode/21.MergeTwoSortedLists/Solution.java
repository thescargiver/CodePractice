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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // dummyNode -> [result of the merge]
        // dummy node
        final ListNode res = new ListNode(-99);
        ListNode resItr = res;

        ListNode itr1 = list1;
        ListNode itr2 = list2;

        while (itr1 != null && itr2 != null) {
            if (itr1.val < itr2.val) {
                resItr.next = itr1;
                itr1 = itr1.next;
            } else {
                resItr.next = itr2;
                itr2 = itr2.next;
            }
            resItr = resItr.next;
        }

        // eiter itr1 or itr2 is null
        if (itr1 != null) {
            resItr.next = itr1;
        } else {
            resItr.next = itr2;
        }

        return res.next;
    }
}


//  Provided this class to satisfy compiler
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
