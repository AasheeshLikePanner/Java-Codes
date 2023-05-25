package LeetCode_Problems;

import java.util.*;
class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class TOPViewOfBinaryTre {
    static class pair{
        BinaryTreeNode node;
        int col;
        pair(BinaryTreeNode node , int col){
            this.node = node;
            this.col = col;
        }
    }
    public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
        Queue<pair> que = new LinkedList<>();
        Map<Integer , Integer> map = new TreeMap<>();
        que.offer(new pair(root , 0 ));
        while(!que.isEmpty()){
            pair temp = que.poll();
            if(map.get(temp.col) == null){
                map.put(temp.col , temp.node.val);
            }
            if(temp.node.left != null){
                que.offer(new pair(temp.node.left , - 1));
            }
            if(temp.node.right != null){
                que.offer(new pair(temp.node.right , + 1));
            }
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry: map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}
