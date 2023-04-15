package LeetCode_Problems;

public class UnsortedContinuousSubarray {
    public static void main(String[] args) {
        int[] arr = {2,6,4,8,10,9,15};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = {2,3,3,2,4};
        int[] arr4 = {2,1,1,1,1};
        System.out.println(findUnsortedSubarray(arr4));
    }
    public static int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i< nums.length ; i++){
            if(i == nums.length - 1 ){
                if(nums[i] > nums[i - 1]){

                    min = Math.min(nums[i - 1] , min);
                }
                // max = Math.max(nums[i + 1], max);
            }
            else if(i == 0 ){
                if(nums[i + 1] < nums[i]){

                    max = Math.max(nums[i + 1], max);
                }
                // min = Math.min(nums[i - 1] , min);
            }
            else{
                if(nums[i + 1]  < nums[i] || nums[i - 1] > nums[i]){
                    min = Math.min(nums[i] , min);
                    max = Math.max(nums[i], max);
                }
            }
        }
        if(min == Integer.MAX_VALUE && max == Integer.MIN_VALUE){
            return 0;
        }
        int i = 0;
        int j = 0;
        for(i = 0 ; i < nums.length && nums[i] <= min ; i++);
        for(j = nums.length - 1; j >=0 && nums[j] >= max ; j--);
        return j - i ;
    }
}
