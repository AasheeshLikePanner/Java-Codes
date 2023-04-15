package LeetCode_Problems;

import java.util.*;
import java.util.ArrayList;

public class Q102 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
//        outer.add(new ArrayList<>(root));

        helper(root);
        return outer;

    }
    List<List<Integer>> outer = new ArrayList<>();
    private void helper(TreeNode root){
        List<Integer> inner = new ArrayList<>();
        if(root.left != null){
            inner.add(root.left.val);
        }
        if(root.right != null){
            inner.add(root.right.val);
        }
        outer.add(inner);
    }
}
