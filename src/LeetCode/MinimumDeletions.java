package LeetCode;

public class MinimumDeletions {
    public static void main(String[] args) {

    }
    public int minDeletion(int[] nums) {
        int up = 0;
        int del = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if((i - up) % 2 ==0 && nums[i] == nums[i + 1]){
                up++;
                del++;
            }
        }
        if(nums.length - up % 2 != 0)   return del + 1;
        return del;
    }
}
