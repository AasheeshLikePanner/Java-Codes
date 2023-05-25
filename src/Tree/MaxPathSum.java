package Tree;

public class MaxPathSum {
    public static void main(String[] args) {
        Node node = Transversals.tree();
//        System.out.println(diameter(node));
//        Node node = new Node(-10);
//        node.left = new Node(9);
//        node.right = new Node(20);
//        node.right.right = new Node(7);
//        node.right.left = new Node(15);
        path(node);
        System.out.println(max);
    }
    static int max = 0;
    public static int path(Node node){
        if(node == null){
            return 0;
        }
        int left = path(node.left);
        int right = path(node.right);
//        int sum =  node.val + Math.max(left,right);
        int sum = node.val + left +right;
        max = Math.max(sum , max);
        return node.val + Math.max(left,right);
//        return sum;
    }
}
