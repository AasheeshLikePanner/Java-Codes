package LeetCode;

public class CountAverageSubtrees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        System.out.println(averageOfSubtree(root));
    }
    public static int averageOfSubtree(TreeNode root) {
        tree(root);
        return count;
    }

    private static int tree(TreeNode root) {
        int one  =0 ;
        int two = 0;
        if(root.left != null){
            one = tree(root.left);
        }
        if(root.right != null){
            two = tree(root.right);
        }
        if((root.val + two + one)/ treecount == root.val){
            count++;
        }
        treecount++;
        return root.val + two + one;
    }

    static int count = 0;
    static int treecount = 0;
}
