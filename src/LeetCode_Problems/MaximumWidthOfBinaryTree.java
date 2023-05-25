package LeetCode_Problems;

import com.sun.source.tree.Tree;

import java.util.*;

public class MaximumWidthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root= create();
        System.out.println(widthOfBinaryTree(root));
    }
    static class pair{
//        boolean flag;
        TreeNode node;
        int val;
//        pair(int val , boolean flag){
//            this.val = val;
//            this.flag = flag;
//        }
        pair(TreeNode node, int val){
            this.node = node;
            this.val = val;
        }
    }
    public static int widthOfBinaryTree(TreeNode root) {
//        List<List<pair>> outer = new ArrayList<>();
        Queue<pair> st = new LinkedList<>();
        st.offer(new pair(root,0));
        int one = 0;
        int two = 0;
        int result = 0;
        while(!st.isEmpty()){
            int n = st.size();
//            List<pair> inner = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                pair p = st.poll();
                assert p != null;
                if(i == 0){
                    one = p.val;
                }
                if(n - 1 == i){
                    two = p.val;
                }
                TreeNode node = p.node;
//                inner.add(new pair(node , p.val));
                if(node.left != null){
                    st.offer(new pair(node.left ,p.val *2  +1 ));
                }
                if(node.right != null){
                    st.offer(new pair(node.right , p.val * 2 + 2));
                }
            }
            result = Math.max(two - one  + 1, result);
//            outer.add(inner);
        }
        return result;
    }
    public static TreeNode create(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.right.right.left = new TreeNode(7);
        return root;
    }
}
