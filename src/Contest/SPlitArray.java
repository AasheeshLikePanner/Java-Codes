package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPlitArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(2);

        list.add(3);
//            list.add(6);
//            list.add(11);
//            list.add(2);
//            list.add(12);
        System.out.println(canSplitArray(list , 7));
    }
    public static boolean canSplitArray(List<Integer> nums, int m) {
        int i = 0;
        int j = nums.size() - 1;
        int pre = 0;
        int suf = 0;
        for(int k = 0; k < nums.size(); k++ ){
            pre += nums.get(k);
            suf += nums.get(j - k);
        }
        int[][][] dp =new int[nums.size()][nums.size()][pre + 1];
        for (int[][] arr:dp
             ) {
            for(int[] d: arr){
                Arrays.fill(d, -1);
            }
        }
        return helper(nums, pre, suf,m , i ,j, dp);
    }

    private static boolean helper(List<Integer> nums, int pre, int suf, int m, int i, int j, int[][][] dp) {
        if( i == nums.size() || j < 0 || ((j - i + 1) == 2)){
            return true;
        }
        if(i == j){
            return true;
        }
        if(dp[i][j][pre]  != - 1){
            return dp[i][j][pre] == 1;
        }
        boolean one = false, two = false;
        if(pre - nums.get(i) >= m ){
            one = helper(nums, pre - nums.get(i), suf - nums.get(i), m, i + 1, j, dp);
        }
        if(suf - nums.get(j) >= m ){
            two = helper(nums, pre - nums.get(j), suf - nums.get(j), m, i, j - 1, dp);
        }
        dp[i][j][pre] = (one||two)?1:0;
        return one|| two;
    }


}
