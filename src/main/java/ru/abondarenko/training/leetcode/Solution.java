package ru.abondarenko.training.leetcode;

public class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));
        ListNode l2 = new ListNode(1);
        System.out.println(printNode(merge(l1, l2)));
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val) {
            return new ListNode(l1.val, merge(l1.next, l2));
        } else {
            return new ListNode(l2.val, merge(l1, l2.next));
        }
    }

    public static String printNode(ListNode l) {
        StringBuilder builder = new StringBuilder("[");
        while (l != null) {
            builder.append(l.val).append(",");
            l = l.next;
        }
        builder.setLength(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
