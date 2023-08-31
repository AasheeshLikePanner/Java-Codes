package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Partiotionlist {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        head.next = new ListNode(4);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(2);
        System.out.println(partition(head,0));

    }
    public static ListNode partition(ListNode head, int x) {
        ListNode DummyHead = new ListNode(1);
        ListNode res =DummyHead;
        ListNode temp = head;
        while (temp != null){
            if(head.val < x){
                DummyHead.next = new ListNode(head.val);
                DummyHead = DummyHead.next;
            }
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (head.val >= x) {
                DummyHead.next = new ListNode(head.val);
                DummyHead = DummyHead.next;
            }
            temp = temp.next;
        }
            return res.next;
    }
}
