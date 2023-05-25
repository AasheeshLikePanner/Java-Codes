package Contest;

import java.util.Arrays;

public class SumWithKElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(maximizeSum(arr , 3));
    }
    public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        int max = nums[nums.length - 1];
        while( k != 0){
            result += max;
            max++;
            k--;
        }
        return result;
    }
}
