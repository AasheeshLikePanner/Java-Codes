package Tree;

import java.util.ArrayList;
import java.util.*;
import java.util.Queue;

public class SameTree {
    public static void main(String[] args) {
        Node one = new Node(1);
        one.left = new Node(2);
//        one.right = new Node(3);
        Node two = new Node(1);
        two.right = new Node(2);
//        two.left = new Node(2);
        System.out.println(isSameTree(one, two));
    }
    public static boolean isSameTree(Node p, Node q) {
        if(p == null || q == null){
            return false;
        }
        Queue<Node> one = new LinkedList<>();
        Queue<Node> two = new LinkedList<>();
        one.offer(p);
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        while(!one.isEmpty()){
            Node can = one.poll();
            l1.add(can.val);
            if(can.left != null)    one.offer(can.left);

            if(can.left == null)    l1.add( -2147483648);

            if(can.right != null)   one.offer(can.right);


            if(can.right == null)   l1.add( -2147483648);
        }
        two.offer(q);
        while(!two.isEmpty()){
            Node can = two.poll();
            l2.add(can.val);
            if(can.left != null)    two.offer(can.left);

            if(can.left == null)    l2.add( -2147483648);

            if(can.right != null)   two.offer(can.right);


            if(can.right == null)   l2.add( -2147483648);
        }
        if(l1.size() != l2.size()){
            return false;
        }
        for(int i =0 ; i < l1.size() ; i++){
            if((l1.get(i) ==  -2147483648 && l2.get(i) !=  -2147483648) ||  ( l1.get(i)!=  -2147483648 && l2.get(i) ==  -2147483648)){
                return false;
            }
            if(!Objects.equals(l1.get(i), l2.get(i))){
                return false;
            }
        }
        return true;
    }


}
