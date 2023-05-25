package Tree;

public class Main {
    public static void main(String[] args) {
        Node parent = new Node(1);
        parent.left = new Node(4);
        parent.right = new Node(2);
        System.out.println(parent.left.val);
    }
}
