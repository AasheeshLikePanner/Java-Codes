package LeetCode_Problems;

import java.util.*;
public class ALLNodesDistanceK {
    public static void main(String[] args) {

    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode , TreeNode > parent = new HashMap<>();
        parent(root, target , parent);
        Map<TreeNode , Boolean> flag = new HashMap<>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(target);
        flag.put(target, true);
        int count = 0;
        while(!que.isEmpty()){
            int size = que.size();
            if(count == k){
                break;
            }
        }
        List<Integer> list= new ArrayList<>();
        return list;
//        return new List<Integer>;
    }
    public void parent(TreeNode root, TreeNode target,Map<TreeNode , TreeNode> parent){
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            TreeNode current = que.poll();
            if(current.left != null){
                parent.put(current.left , current);
                que.offer(current.left);
            }
            if(current.right != null){
                parent.put(current.right , current);
                que.offer(current.right);
            }
        }
    }
}
