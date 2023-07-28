package LeetCode;

public class CountSubsetsSumK {
    public static void main(String[] args) {
        System.out.println(findWays(new int[]{1,4,4,5},5));
    }
    public static int findWays(int[] num, int tar) {
        return helper(num, tar, num.length - 1, 0);
    }

    private static int helper(int[] num, int tar, int i, int sum) {
        if(i < 0){
            if(sum == tar)  return 1;
            return 0;
        }
        if(sum == tar)  return 1;
        int one = helper(num , tar, i - 1 ,sum );
        int two  = 0;
        if(tar >= sum){
            two = helper(num , tar, i - 1, sum + num[i]);
        }
        return one + two;
    }
}
