package LeetCode;

import java.util.HashMap;

public class HouserRobery3 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
//        System.out.println(rob(root));
    }
//    public static int rob(TreeNode root) {
//        HashMap<Integer, Integer> set = new HashMap<>();
//        return helper(root, 1, set, 0);
//    }

//    private static int helper(TreeNode root, int i, HashMap<Integer, Integer> set, int sum) {
//        if(root == null){
//            return 0;
//        }
//        int ans = 0;
//        if(root.left != null){
//            ans += ro
//        }
//    }
}
