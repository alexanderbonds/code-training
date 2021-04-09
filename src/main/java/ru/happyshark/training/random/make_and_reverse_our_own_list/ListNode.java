package ru.happyshark.training.random.make_and_reverse_our_own_list;

public class ListNode {
    ListNode next;
    int val;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{ val = " + this.val + "}";
    }
}
