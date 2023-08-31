package Contest;


public class DoubleANumberLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(9);
        System.out.println(doubleIt(head));
    }
    public static ListNode doubleIt(ListNode head) {
        ListNode rev = reverseList(head);
        ListNode next = rev.next;
        ListNode prev = null;
        int car = 0;
        while(rev != null){
            if(rev.val * 2 >= 10){
                rev.val = ((rev.val * 2) % 10) + car;
                car = 1;
            }
            else{
                rev.val =rev.val * 2 + car;
                car = 0;
            }
            rev.next =prev;
            prev = rev;
            rev = next;
            if(next != null){
                next = next.next;
            }
        }
        if(car != 0){
            ListNode one  = new ListNode(1);
            one.next = prev;
            return one;
        }
        return prev;
    }
        public static ListNode reverseList(ListNode head) {
            if(head == null ){
                return head;
            }
            ListNode prev = null;
            ListNode present = head;
            ListNode next = present.next;

            while(present != null){
                present.next = prev;
                prev = present;
                present = next;
                if(next != null){
                    next = next.next;
                }
            }
            return prev;
        }
}
