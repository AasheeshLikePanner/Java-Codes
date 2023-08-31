package Contest;

import java.util.Arrays;
import java.util.List;

public class MaxProfitSalesman {
    public static void main(String[] args) {

    }
    public int maximizeTheProfit(int n, List<List<Integer>> offers) {
        offers.sort((a, b) -> a.get(1) - b.get(1));
        int[][] dp = new int[offers.size()][10000000 ];
        for(int[] d: dp){
            Arrays.fill(d, -1);
        }
        return helper(offers,  0 , -1, dp);
    }

    private int helper(List<List<Integer>> offers, int i, int end, int[][] dp) {
        if(i == offers.size()){
            return 0;
        }
        if(end != - 1 && dp[i][end] != -1){
            return dp[i][end];
        }
        int one  = helper(offers, i + 1, end, dp);
        int two = 0;
        if(end < offers.get(i).get(0)){
            two = helper(offers, i  +1, offers.get(i).get(1), dp) + offers.get(i).get(2);
        }
        if(end != -1){
            dp[i][end] = Math.max(one, two);
        }
        return Math.max(one, two);
    }
}
