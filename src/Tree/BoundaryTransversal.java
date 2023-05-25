package Tree;

import java.util.*;
public class BoundaryTransversal {
    public static void main(String[] args) {

    }
    ArrayList <Integer> boundary(Node node)
    {
        ArrayList<Integer> list= new ArrayList<>();

        return list;
    }
    void addleafs(Node node , ArrayList<Integer> list){
        if(isleaf(node)){
            list.add(node.val);
            return;
        }
        if(node.left != null){
            addleafs(node.left , list);
        }
        if(node.right != null){
            addleafs(node.right , list);
        }
    }
    void right(Node node, ArrayList<Integer > list){
        Node temp = node.right;
        Stack<Integer> stack = new Stack<>();
        while(temp != null){
            if(!isleaf(node)){
                stack.push(node.val);
            }
            if(node.right != null){
                temp = node.right;
            }
            else{
                temp = node.left;
            }
        }
        while(stack.isEmpty()) list.add(stack.pop());
    }
    void left(Node node , ArrayList<Integer> list){
        Node temp = node.left;
        while(temp != null){
            if(!isleaf(node)){
                list.add(node.val);
            }
            if(node.left != null){
                temp = node.left;
            }
            else{
                temp = node.right;
            }
        }
    }
    boolean isleaf(Node node){
        if(node.right == null && node.left == null){
            return true;
        }
        return false;
    }
}
