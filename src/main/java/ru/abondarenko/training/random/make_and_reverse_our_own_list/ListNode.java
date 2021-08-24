package ru.abondarenko.training.random.make_and_reverse_our_own_list;

public class ListNode {
    private ListNode next;
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        return "ListNode{val = " + this.val + "}";
    }
}
