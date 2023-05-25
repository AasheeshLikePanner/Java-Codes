package Tree;

import java.util.*;
public class PathToGivennode {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> solve(Node A, int B) {
        inorder(A,B,new Stack<Integer>());
        return list;
    }
    ArrayList<Integer> list= new ArrayList<>();
    public void inorder(Node node , int target , Stack<Integer> stack){
        if(node == null){
            return;
        }
        stack.push(node.val);
        if(node.val == target){
            while(!stack.isEmpty()){
                list.add(stack.pop());
            }
            return;
        }
        if(node.left != null){
            inorder(node.left, target , stack);
            stack.pop();
        }
        if(node.right != null){
            inorder(node.right, target , stack);
            stack.pop();
        }

    }
}
