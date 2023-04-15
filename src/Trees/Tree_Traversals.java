package Trees;
import com.sun.source.tree.Tree;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class Tree_Traversals {

    public static void main(String[] args) {
        int[] in= {6,9,7,3,8,20,10};
        int[] pos = {6,7,9,8,10,20,3};
        TreeNode node = buildTree(in ,pos);
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode node= new TreeNode(postorder[postorder.length - 1]);
        int mid = 0;
        for(int i = 0 ; i< postorder.length ; i++){
            if(postorder[postorder.length - 1] == inorder[i]){
                mid = i;
                break;
            }
        }
        node.left = left(inorder , 0 , mid - 1);
        node.right = right(inorder , mid + 1, postorder.length - 1);
        return node;
    }
    private static TreeNode left (int[] in , int start , int end){
        if(start > end ){
            return null;
        }
        int mid = start + (end -  start)/2;
        TreeNode node= new TreeNode(mid);
        node.right = left(in, mid + 1, end);
        node.left = left(in , start , mid - 1);
        return node;
    }
    private static TreeNode right(int[] in , int start , int end){
        if(start > end ){
            return null;
        }
        int mid = start + (end -  start)/2;
        TreeNode node= new TreeNode(mid);
        node.right = right(in, mid + 1, end);
        node.left = right(in , 0 , mid - 1);
        return node;
    }

}
//          Not able to write the code
//    public static void main(String[] args) {
//
//    }
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        TreeNode head = new TreeNode(postorder[postorder.length -1]);
//        check[0] = postorder[postorder.length - 1];
//        int last = 1;
//        index = postorder.length - 2;
//        while(index >= 0){
////            if(isSafe(inorder , last , postorder[index])){
//                TreeNode node = new TreeNode(postorder[index]);
//                head.right = new TreeNode(postorder[index]);
//                last++;
//
//            }
//
////        }
//        return head;
//    }
//    int[] check = new int[2];
//    int last = 1;
//    int index = 1;
//    private void helper(int[] post , int[] pre , int last , int[] check){
//        TreeNode node = new TreeNode(index);
//        for(int i = 0 ; i < pre.length ; i++){
//            if(post[index] == pre[i]){
//                if(place(pre , i+1 , check , last)){
//                    node.right = new TreeNode(pre[i + 1]);
//                    check[last] =  pre[i + 1];
//                    last++;
//                }
//                if(place(pre , i - 1, check , last)){
//                    node.left = new TreeNode(pre[i-1]);
//                    check[last] =  pre[i + 1];
//                    last++;
//                }
//            }
//        }
//    }
//
//    private boolean place(int[] can, int index, int[] check , int last) {
//        for (int i = 0 ; i <= last; i++){
//            if(check[i] == can[index]){
//                return false;
//            }
//        }
//        return true;
//    }
//}
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
////        root.right.right = new TreeNode(7);
//        System.out.println(isCompleteTree(root));
//    }
//    public static boolean isCompleteTree(TreeNode root) {
//        Queue<TreeNode> stack = new LinkedList<>();
//        Queue<Integer> val = new LinkedList<>();
//        stack.offer(root);
//        while(!stack.isEmpty()){
//            for (int i = 0; i < stack.size() ; i++) {
//                TreeNode temp = stack.poll();
//                if(stack.isEmpty() && temp == null){
//                    return true;
//                }
//                else if(!stack.isEmpty() && temp == null){
//                    return false;
//                }
////                if(temp.right == null && temp.left == null){
////                    continue;
////                }
//                if(temp.right != null && temp.left ==  null){
//                    return false;
//                }
//                else{
//                    stack.offer(temp.left);
//                    stack.offer(temp.right);
////                    val.offer(temp.left.val);
////                    val.offer(temp.right.val);
//                }
//            }
//
//        }
//        return true;
//    }
//}
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        System.out.println(sumNumbers(root));
//    }
//    public static int sumNumbers(TreeNode root) {
//        helper(root , 0);
//        return sum;
//    }
//    static int sum =0 ;
//    private static void helper(TreeNode root , int num){
//        if(root == null){
//            return;
//        }
//        if(root.left == null && root.right == null){
//            num = num*10 + root.val;
//            sum+=num;
//           return;
//        }
//        num = num*10 + root.val;
//        helper(root.left , num);
//        helper(root.right , num);
//    }
//}

//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(3);
//        System.out.println(isSymmetric(root));
//
//    }
//    public static boolean isSymmetric(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        if (root.left == null) {
//            return false;
//        }
//        if (root.right == null) {
//            return false;
//        }
//        left(root.left);
//        right(root.right);
//        int l = left.size();
//        int r = right.size();
//        int i = 0;
//        int k = 0;
//        if (l != r) {
//            return false;
//        }
//        while (i < l && k < r) {
//            if (left.get(i)== null && right.get(k) == null) {
//                i++;
//                k++;
//                continue;
//            }
//            if (left.get(i)== null && right.get(k) != null) {
//                return false;
//            }
//            if (left.get(i) != null && right.get(k) == null) {
//                return false;
//            }
//            int one = left.get(i);
//            int two = right.get(k);
//            if (left.get(i) != right.get(k)) {
//                return false;
//            }
//            i++;
//            k++;
//        }
//        return true;
//    }
//
//    static List<Integer> left = new ArrayList<>();
//    static List<Integer> right = new ArrayList<>();
//
//    private static void left(TreeNode node) {
//        if (node == null) {
//            left.add(null);
//            return;
//        }
//        int can = node.val;
//        left.add(node.val);
//        left(node.left);
//        left(node.right);
//    }
//
//    private static void right(TreeNode node) {
//        if (node == null) {
//            right.add(null);
//            return;
//        }
//
//        int can = node.val;
//        right.add(node.val);
//        right(node.right);
//        right(node.left);
//    }
//}
//    private static void display(Node node) {
//        if (node == null) {
//            return;
//        }
//        System.out.print(node.value + " -> ");
//        display(node.left);
//        display(node.right);
//    }
//
//    private static void pre(Node node) {
//        if (node == null) {
//            return;
//        }
//        pre(node.left);
//        System.out.print(node.value + " -> ");
//        pre(node.right);
//    }
//
//    private static void post(Node node) {
//        if (node == null) {
//            return;
//        }
//        post(node.left);
//        post(node.right);
//        System.out.print(node.value + " -> ");
//    }
//
//    private static void level_order(Node root, int level) {
//        if (root == null) {
//            return;
//        }
//        System.out.print(root.value + " ");
//        level_order(root.left, level - 1);
//        level_order(root.right, level - 1);
//
//    }
//    public static List<List<Integer>> levelOrder(Node root) {
//        Queue<Node> que = new LinkedList<>();
//        List<List<Integer>> outer = new ArrayList<>();
//        if (root == null) {
//            return outer;
//        }
//        que.offer(root);
//        while (!que.isEmpty()) {
//            int n = que.size();
//            List<Integer> inner = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                if (que.peek().left != null) {
//                    que.offer(que.peek().left);
//                }
//                if (que.peek().right != null) {
//                    que.offer(que.peek().right);
//                }
//                inner.add(que.poll().value);
//            }
//            outer.add(inner);
//
//        }
//        return outer;}}


//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//        List<List<Integer>> man = levelOrder(root);
//        System.out.println(man);
////        display(root);
////        System.out.println("END");
////        pre(root);
////        System.out.println("END");
////        post(root);
////        System.out.println("END");
////        level_order(root , 2);
//    }
//}

