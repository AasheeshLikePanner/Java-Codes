package Tree;

public class Pre_Order_Transversal {
    public static void main(String[] args) {
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
        pre(tree);
        System.out.print("END");
    }
    public static void pre(Node node){
        if(node ==  null){
            return;
        }
        System.out.print(node.val+" -> ");
        pre(node.left);
        pre(node.right);
    }
}
