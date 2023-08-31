package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeSumOfSortedSubarraySUm {
    public static void main(String[] args) {

    }

    public int rangeSum(int[] nums, int n, int left, int right) {
        int res = 0;
        int[] sums = new int[n*(n+1)/2];
        int index = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += nums[j];
                sums[index++] = sum;
            }
        }

        int mod = 1000000007;
        Arrays.sort(sums);
        for(int i = left - 1; i < right ; i++){
            res += sums[i];
            res %= mod;
        }
        return res;
    }
}
