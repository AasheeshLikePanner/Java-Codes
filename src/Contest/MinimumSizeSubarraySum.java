package Contest;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] test2 = {2,3,1,2,4,3};        //7
        int[] test3 = {1,4,4};
        System.out.println(minSubArrayLen(4, test3));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int i =0 ;
        int j = 0;
        int min  = Integer.MAX_VALUE;
        int sum = 0;
        while(j <  nums.length && i < nums.length){
            sum += nums[j];
            if (sum > target){
                while(sum > target){
                    sum -= nums[i];
                    i++;
                }
            }
            if(sum < target){
                j++;
            }
            else if(sum == target){
                min = Math.min(min , j - i + 1);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return min;
    }
}
