package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class SubStringWithLargestVariance {
    public static void main(String[] args) {
//        System.out.println(largestVariance("aababbb"));
//        System.out.println(largestVariance("aabbeaa"));
//        System.out.println(largestVariance("abcde"));
        System.out.println(largestVariance("aabbbbaa"));
    }
    public static int largestVariance(String s) {
        int[][] dp = new int[s.length()][3];
        for(int[] d : dp){
            Arrays.fill(d,  - 1);
        }
        return helper(s, s.length() - 1, new HashMap<Character , Integer>(), dp , 2);
    }

    private static int helper(String s, int i, HashMap<Character , Integer> map, int[][] dp, int can) {
        if(i < 0){
            if(map.size() == 0) return 0;
            int max = 0;
            int min = Integer.MAX_VALUE;
            for(int val:map.values()){
                max = Math.max(max, val);
                min = Math.min(min, val);
            }
            return Math.abs(max - min);
        }
        if(dp[i][can] != -1) return dp[i][can];
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        int one = helper(s, i - 1, map, dp, 1);
        if(map.get(s.charAt(i)) == 1){
            map.remove(s.charAt(i));
        }
        else{
            map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
        }
        int two = helper(s, i - 1, map, dp, 0);
        return dp[i][can] = Math.max(one, two);
    }
}
