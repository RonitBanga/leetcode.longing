// 2487. Remove Nodes From Linked List

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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        // ListNode temp = head.next;
        // stack.push(head);
        ListNode temp = head;
        while(temp!=null) {
            int val = temp.val;
            while(!stack.isEmpty() && val>stack.peek().val) {
                stack.pop();
            }
            stack.push(temp);
            temp = temp.next;
        }

        ListNode soln = stack.pop();
        while(!stack.isEmpty()) {
            ListNode tempo = stack.peek();
            stack.pop();
            tempo.next = soln;
            soln = tempo;
        }
        return soln;
    }
}