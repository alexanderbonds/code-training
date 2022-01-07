package ru.abondarenko.training.leetcode.meduim.ex_NNNN;

import java.util.Arrays;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MainApp {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 1;
        ListNode originalHead = head;

        if (head == null) {
            return new ListNode[k];
        }

        if (k == 1) {
            return new ListNode[] {head};
        }

        while (head.next != null) {
            size++;
            head = head.next;
        }

        head = originalHead;
        ListNode[] result = new ListNode[k];

        int[] parts = findParts(size, k);
        ListNode nextHead = head;

        for (int i = 0; i < k; i++) {
            result[i] = nextHead;
            int count = 0;
            ListNode last = head;
            while (count != parts[i]) {
                last = head;
                head = head.next;
                count++;
            }
            nextHead = head;
            if (last != null) last.next = null;
        }

        return result;
    }

    public static void main(String[] args) {
        MainApp app = new MainApp();
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);
        ListNode list6 = new ListNode(6);
        ListNode list7 = new ListNode(7);
        ListNode list8 = new ListNode(8);
        ListNode list9 = new ListNode(9);
        ListNode list10 = new ListNode(10);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        list5.next = list6;
        list6.next = list7;
        list7.next = list8;
        list8.next = list9;
        list9.next = list10;
        list10.next = null;

        ListNode size1 = new ListNode(1);
        size1.next = null;

        ListNode empty = null;

        System.out.println(printNodeArray(app.splitListToParts(list1, 3)));
        System.out.println(printNodeArray(app.splitListToParts(size1, 5)));
        System.out.println(printNodeArray(app.splitListToParts(empty, 5)));
    }

    public static String printNode(ListNode node) {
        if (node == null) {
            return "[]";
        }

        StringBuilder str = new StringBuilder("[");
        if (node.next == null) {
            str.append(node.val).append("]");
            return str.toString();
        }

        while (node.next != null) {
            str.append(node.val).append(",");
            node = node.next;
        }
        str.append(node.val);
        str.append("]");
        return str.toString();
    }

    public static String printNodeArray(ListNode[] nodeArr) {
        if (nodeArr.length == 0) {
            return "[]";
        }

        StringBuilder str = new StringBuilder("[");
        for (ListNode node : nodeArr) {
            str.append(printNode(node));
            str.append(",");
        }
        str.setLength(str.length() - 1);
        str.append("]");
        return str.toString();
    }

    public static int[] findParts(int number, int parts) {
        int[] result = new int[parts];
        int biggerParts = number % parts;
        int bigger = 1 + number / parts;
        for (int i = 0; i < biggerParts; i++) {
            result[i] = bigger;
        }
        for (int i = biggerParts; i < parts; i++) {
            result[i] = bigger - 1;
        }
        return result;
    }
}
