package LeetCode_Problems;

import java.util.Deque;
import java.util.LinkedList;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class RmoveNodesFromLinkedList {
    public static void main(String[] args) {

    }
    public ListNode removeNodes(ListNode head) {
        ListNode tail = head;
        Deque<Integer> can = new LinkedList<>();
        while(tail != null){
                while(!can.isEmpty() && can.peek() > tail.val ){
                    can.pop();
                }
            tail = tail.next;
                can.push(tail.val);
        }
        ListNode dummyhead = null;
        while(!can.isEmpty()){
            dummyhead = new ListNode(can.pollLast());
            dummyhead = dummyhead.next;
        }
        return dummyhead;
    }
}
