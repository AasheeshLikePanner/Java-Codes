package LeetCode;

public class unboundedKnapsack {
    public static void main(String[] args) {
        System.out.println(unboundedKnapsack(3,10,new int[]{5,11,13}, new int[]{2,4,6}));
    }
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        return helper(profit, weight, weight.length - 1, w);
    }

    private static int helper(int[] profit, int[] weight, int i, int w) {
        if(i < 0)   return 0;
        int one = helper(profit, weight, i - 1, w);
        int two = (int)1e9;
        if(weight[i] <= w){
            two = helper(profit, weight, i, w - weight[i]) + profit[i];
        }
        return Math.max(one, two);
    }
}
