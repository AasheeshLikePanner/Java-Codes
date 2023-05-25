package Tree;

import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
 }
 }
public class LLInBinaryTree {
    public static void main(String[] args) {        //[1,4,2,6]
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(6);
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(6);
        root.right.left.right = new TreeNode(8);
        System.out.println(isSubPath(head ,root));
    }
    public static boolean isSubPath(ListNode head, TreeNode root) {
        List<Integer> list= new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        flag(list , root, 0);
        return check;
    }
    static boolean check = false;
    public static boolean flag(List<Integer> list, TreeNode root , int index){     // one = flag(list , root.left , index + 1);
        if(index == list.size()){
            check  = true;
            return true;
        }
        if(index == list.size() - 1 &&root.left == null ){
            check  = true;
            return true;
        }
        if(index == list.size() - 1 &&root.right == null ){
            check  = true;
            return true;
        }
        if(root == null){
            return  false;
        }
        boolean one = false;
        boolean two = false;
        if(root.left != null &&  (list.get(index) == root.val)){
            one = flag(list , root.left , index + 1);
        }
        else if(root.left != null){
            one = flag(list,  root.left , index );
        }
        if(root.right != null &&  (list.get(index) == root.val)){
            one = flag(list , root.right , index + 1);
        }
        else if(root.right != null){
            two = flag(list,  root.right , index );
        }
        return one || two;
    }
}
