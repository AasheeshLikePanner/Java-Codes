package LeetCode_Problems;

public class ide {
    public static void main(String[] args) {
        System.out.println(check(4));
    }
    static int check(int n){
        return helper(n);
    }
    static int helper(int can ){
        if(can == 1){
            return 1;
        }
        return 4*(can - 1) + helper(can - 1 );
    }
}
