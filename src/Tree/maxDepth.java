package Tree;

public class maxDepth {

    public static void main(String[] args) {
        Node tree = Transversals.tree();
        System.out.println(max(tree));
    }
    public static int max(Node node){
        if(node == null){
            return 0;
        }
        int left = max(node.left);
        int right = max(node.right);
        return 1 +  Math.max(left , right);
    }
}
