package LeetCode_Problems;

public class MaximumSubarray1 {
    public static void main(String[] args) {
        int[]  nums = {-1};
        int  k = 1;
        System.out.println(findMaxAverage(nums , k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double max , sum;
        max = sum = 0 ;
        int i, j;
        i = j = 0;
        while(j < nums.length){
            sum += nums[j];
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                max = Math.max(  max, sum/k);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
