package Tree;
import java.util.*;
public class BinaryTreeRightSideVIew {
    public static void main(String[] args) {

    }
    public List<Integer> rightSideView(Node root) {
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        List<List<Integer>> outer = new ArrayList<>();
        while(!que.isEmpty()){
            int n = que.size();
            List<Integer> inner = new ArrayList<>();
            for(int i = 0; i < n ;i++ ){
                if(que.peek().left != null){
                    que.offer(que.peek().left);
                }
                if(que.peek().right != null){
                    que.offer(que.peek().right);
                }
                inner.add(que.poll().val);
            }
            outer.add(inner);
        }
        List<Integer> result = new ArrayList<>();
        for(List<Integer> l: outer){
            result.add(l.get(l.size() -1));
        }
        return result;
    }
}
