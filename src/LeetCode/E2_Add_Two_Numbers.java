package LeetCode;

public class E2_Add_Two_Numbers {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode vL1 = l1;
            ListNode vL2 = l2;
            int carry = 0;
            int value = 0;
            ListNode lNode = null, sNode = null;
            ListNode node;

            while(vL1 != null || vL2 != null) {
                value = carry;
                if (vL1 != null) value += vL1.val;
                if (vL2 != null) value += vL2.val;

                if (value > 9) {
                    value -= 10;
                    carry = 1;
                } else {
                    carry = 0;
                }

                node = new ListNode(value);

                if (lNode != null) {
                    lNode.next = node;
                }

                if (sNode == null) {
                    sNode = node;
                }

                if (vL1 != null) vL1 = vL1.next;
                if (vL2 != null) vL2 = vL2.next;
                lNode = node;
            }

            if(carry != 0) {
                lNode.next = new ListNode(carry);
            }

            return sNode;
        }
    }
}
