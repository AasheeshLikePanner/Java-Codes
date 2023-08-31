package LeetCode;

import java.util.Arrays;

public class MinCostOfTickets {
    public static void main(String[] args) {
        System.out.println(mincostTickets(new int[]{1,4,6,7,8,20},new int[]{2,7,15}));
    }
    public static int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length];
        Arrays.fill(dp , - 1);
        return helper(days, costs , 0, dp);
    }

    private static int helper(int[] days, int[] costs, int i, int[] dp) {
        if(i == days.length){
            return 0;
        }
        if(dp[i] != -1 )    return dp[i];
        int j;
        int one = helper(days, costs , i + 1, dp) + costs[0];

        int day = days[i] + 7;
        for( j = i; j < days.length && day > days[j]; j++);
        int two = helper(days, costs , j, dp) + costs[1];

        day = days[i] + 30;
        for( j = i; j < days.length && day > days[j]; j++);
        int three = helper(days, costs , j, dp) + costs[2];

        return dp[i] =  Math.min(one,Math.min(three, two));
    }
}
