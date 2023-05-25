package Tree;

public class Diameter {
    public static void main(String[] args) {
        Node node = Transversals.tree();
        System.out.println(diameter(node));
    }
    static int max = 0;
    public static int diameter(Node node){
        if(node == null){
            return 0;
        }
        int l = diameter(node.left);
        int r = diameter(node.right);
        max = Math.max(l + r , max);
        return 1 + Math.max(l , r);
    }
}
