package LeetCode_Problems;

import java.util.*;


public class SwappingNodesLinkedList {
    public static void main(String[] args) {
        ListNode root= new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        System.out.println(swapNodes(root, 2));

    }
    public static ListNode swapNodes(ListNode head, int k) {
        int l = length(head);
        int one =k - 1;
        int two = l - k;
        ListNode tail = head;
        ListNode c1 = new ListNode();
        ListNode c2 = new ListNode();
        while(tail != null){
            if(one == 0){
                c1 = tail;
            }
            if(two == 0){
                c2 = tail;
            }
            one--;
            two--;
            tail = tail.next;
        }
        int three = c1.val;
        int four = c2.val;
        c1.val = three;
        c2.val = four;
        return head;
    }
    public static int length(ListNode head){
        ListNode tail = head;
        int size = 1;
        while(tail != null){
            size++;
            tail = tail.next;
        }
        return size;
    }
}
