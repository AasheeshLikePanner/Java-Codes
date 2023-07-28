package Contest;

import java.util.Arrays;

public class LongestNonDecreasingSubarrya {
    public static void main(String[] args) {
        System.out.println(maxNonDecreasingLength(new int[]{2,3,1}, new int[]{1,2,1}));
        System.out.println(maxNonDecreasingLength(new int[]{1,3,2,1}, new int[]{2,2,3,4}));
        System.out.println(maxNonDecreasingLength(new int[]{1,1}, new int[]{2,2}));
        System.out.println(maxNonDecreasingLength(new int[]{11,7,7,9}, new int[]{19,19,1,7}));
        System.out.println(maxNonDecreasingLength(new int[]{7,4,4}, new int[]{8,7,20}));
    }
    public static int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums2.length][nums1.length];
        for(int[] arr: dp){
            Arrays.fill(arr, - 1);

        }
        return hepler(nums1, nums2, Integer.MAX_VALUE, nums1.length - 1, nums1.length - 1,0, dp);
    }
    public static int hepler(int[] nums1, int[] nums2, int prev, int i , int l, int count, int[][] dp){
        if(prev < Math.min(nums1[i], nums2[i])) return 0;
        if(i == 0 )  return 1;
        int one =  0;
        int two = 0;
        if(dp[i][l] !=  -1) return dp[i][l];
        if(prev >= nums1[i]){
            one = hepler(nums1, nums2, nums1[i], i - 1, 0,count + 1, dp) + 1;
        }
        if(prev >= nums2[i]){
            two = hepler(nums1, nums2, nums2[i], i - 1, 1,count + 1, dp) + 1;
        }
        int three = hepler(nums1, nums2, Integer.MAX_VALUE, i - 1, nums1.length - 1,0, dp);
        return dp[i][l] = Math.max(one, Math.max(three ,two));
    }

}
