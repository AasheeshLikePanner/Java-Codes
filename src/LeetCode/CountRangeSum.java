package LeetCode;

public class CountRangeSum {
    public static void main(String[] args) {

    }
    public int countRangeSum(int[] nums, int lower, int upper) {
        helper(nums, nums.length - 1, lower, upper, 0);
        return count;
    }
        int count = 0;
    private  void helper(int[] nums, int i, int lower, int upper, int sum) {
        if(i < 0){
            if(sum <= upper && sum >= lower){
                count++;
            }
            return;
        }
//        int one = helper(nums , i - 1, upper, lower, sum + nums[i]);
//        int two = helper(nums , i - 1, upper, lower, sum);
    }
}
