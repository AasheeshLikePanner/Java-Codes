package LeetCode_Problems;

public class climbing_Staurs {
    public static void main(String[] args) {
//        System.out.println(climbStairs(2));
//        System.out.println(climbStairs(3));
        System.out.println(climbStairs(10));
    }
    public static int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        int n2 = 1, n1 = 2, all = 0;

        for(int i = 1; i < n; i++){
            all = n2 + n1;
            n2 = n1;
            n1 = all;
        }
        return all;
    }
//    public static int climbStairs(int n) {
//        helper( 0 , n);
//        return count;
//    }
//    static int count = 0;
//    public static void helper(int n , int num){
//        if(n == num){
//            count++;
//            return;
//        }
//        helper( n + 1, num );
//        if(n + 2 <= num){
//            helper(n + 2 , num);
//        }
//    }
}
