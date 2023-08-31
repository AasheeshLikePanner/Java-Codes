package Contest;

public class InsertGCDinLD {
    public static void main(String[] args) {
        ListNode head = new ListNode(18);
        head.next = new ListNode(6);
        head.next.next = new ListNode(10);
        head.next.next.next = new ListNode(3);
        insertGreatestCommonDivisors(head);
    }
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next ==  null){
            return head;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null){
            ListNode val = new ListNode(findGCD(prev.val, cur.val));
            prev.next = val;
            val.next = cur;
            prev = cur;
            cur = cur.next;
        }
        return head;
    }
    static int findGCD(int a, int b)
    {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}
