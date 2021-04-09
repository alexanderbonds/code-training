package ru.happyshark.training.random.make_and_reverse_our_own_list;

/**
 *
 * Есть ListNode некоторый и есть у него какое-то значение
 * int val. Я хочу реализовать метод reverseListNode(ListNode head),
 * который возвращает ListNode. Мы хотим развернуть, т.е
 * если на вход я получил:
 * 1 -> 2 -> 3 -> null
 * то на выход я должен получить:
 * 3 -> 2 -> 1 -> null
 *

 public class ListNode {
 ListNode next;
 int val;
 }

 public ListNode reverseListNode(ListNode head) {
 return null;
 }

 * */

/**
 *  Решение:
 */

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;
        ListNode result = reverseListNode(listNode1);
        System.out.println(result);

    }

    public static ListNode reverseListNode(ListNode head) {
        if (head == null) return null;

        ListNode current = head;
        ListNode previous = null;
        ListNode nextNode = null;

        while (current.next != null) {
            // 1 -> 2
            // 1 <- 2 <- 3

            nextNode = current.next;
            //1.next = null
            current.next = previous;

            //p=1
            previous = current;

            //1.next = 2
            current = current.next;

        }
        return current;
    }
}
