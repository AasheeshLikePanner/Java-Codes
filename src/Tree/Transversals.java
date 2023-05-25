package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Transversals {
    public static Node tree(){
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.left.right.left = new Node(6);
        tree.right.left = new Node(7);
        tree.right.right = new Node(8);
        tree.right.right.left = new Node(9);
        tree.right.right.right = new Node(10);
        return tree;
    }
    public static void main(String[] args) {
        Node tree = tree();
        post_it(tree);
        System.out.print("END");
    }
    public static void post_it(Node node){
        Stack<Node> one = new Stack<>();
        Stack<Node> two = new Stack<>();
        one.push(node);
        while(!one.isEmpty()){
            Node temp = one.pop();
            two.push(temp);
            if(temp.left != null){
                one.push(temp.left);
            }
            if(temp.right != null){
                one.push(temp.right);
            }
        }
        while(!two.isEmpty()){
            System.out.print(two.pop().val + " -> ");
        }
    }
    public static void pre_it(Node node){
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            System.out.print(temp.val + " -> ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }
    public static void level(Node node){
        Queue<Node> que = new LinkedList<>();
        que.offer(node);
        while(!que.isEmpty()){
            Node temp = que.poll();
            System.out.print(temp.val + " -> ");
            if(temp.left != null){
                que.offer(temp.left);
            }
            if (temp.right != null) que.offer(temp.right);
        }
    }
    public static void post(Node node){
        if(node == null){
            return;
        }
        post(node.left);
        post(node.right);
        System.out.print(node.val+" -> ");
    }
    public static void pre(Node node){
        if(node ==  null){
            return;
        }
        System.out.print(node.val+" -> ");
        pre(node.left);
        pre(node.right);
    }
    public static void in(Node node){
        if(node == null){
            return;
        }
        in(node.left);
        System.out.print(node.val + " -> ");
        in(node.right);
    }
}
