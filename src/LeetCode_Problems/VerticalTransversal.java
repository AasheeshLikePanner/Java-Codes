package LeetCode_Problems;
import java.util.*;
public class VerticalTransversal {
    public static void main(String[] args) {

    }
    class pair{
        TreeNode node;
        int row;
        int col;
        public pair(TreeNode node, int row,int col){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list= new ArrayList<>();
        TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> tree= new TreeMap<>();
        pair pair = new pair(root , 0 , 0);
        inorder(pair, tree);
        for(TreeMap<Integer , PriorityQueue<Integer>> t : tree.values()){
            List<Integer> inner = new ArrayList<>();
            for(PriorityQueue<Integer> p : t.values()){
                while(!p.isEmpty()){
                    inner.add(p.poll());
                }
            }
            list.add(inner);
        }
        return list;
    }

    private void inorder(pair pair, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> tree) {
        if(pair.node == null){
            return;
        }
        if(pair.node.left != null){
            inorder(new pair(pair.node.left , pair.row - 1 , pair.col + 1), tree);
        }
        int row = pair.row;
        int col = pair.col;
        if(!tree.containsKey(row)){
            tree.put(row , new TreeMap<>());
        }
        if(!tree.get(row).containsKey(col)){
            tree.get(row).put(col , new PriorityQueue<>());
        }
        tree.get(row).get(col).offer(pair.node.val);
        if(pair.node.right != null){
            inorder(new pair(pair.node.right , pair.row + 1 , pair.col + 1), tree);
        }
    }
}
