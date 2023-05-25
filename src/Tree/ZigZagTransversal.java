package Tree;

import java.util.*;
public class ZigZagTransversal {
    public static void main(String[] args) {

    }
    public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> outer = new ArrayList<>();
        boolean flag = false;
        Queue<Node> que =new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> inner= new ArrayList<>();
            for(int i  =0 ;  i< que.size(); i++){
                Node temp = que.poll();
                if(temp.left != null){
                    que.offer(temp.left);
                }
                if(temp.right != null){
                    que.offer(temp.right);
                }
                if(flag){
                    inner.add(0,temp.val);
                }
                else{
                    inner.add(temp.val);
                }
            }
            flag = !flag;
            outer.add(inner);
        }
        return outer;
    }
}
