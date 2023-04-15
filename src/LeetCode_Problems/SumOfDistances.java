package LeetCode_Problems;

import java.util.Arrays;

public class SumOfDistances {
    public static void main(String[] args) {
        int[] can= {1,3,1,1,2};
        System.out.println(Arrays.toString(distance(can)));
    }
    public static long[] distance(int[] nums) {
            int[] arr = new int[nums.length];
            int i = 0;
            for(int can: nums){
                arr[i++] = can;
            }
            Arrays.sort(arr);
            long sum = 0;
            long[] result = new long[nums.length];
           for(int j =0 ; j < nums.length ; j++){
               if(!binary(arr , arr[j])){
                   result[j] = 0;
               }
               else{
                   for(int k = 0; k< nums.length ; k++){
                       if(j != k && nums[j] == nums[k]){
                            sum += Math.abs(j - k);
                       }
                   }
                   result[j] = sum;
                   sum = 0;
               }
           }
            return result;
        }
        public static boolean binary(int[] arr, int k){
            int start = 0;
            int end= arr.length;
            int ans = -1;
            while(start <= end ){
                int mid = start + (end - start)/2;
                if(arr[mid] == k){
                    return true;
                }
                if(arr[mid] > k){
                    ans = mid;
                    end = mid - 1;
                }
                else{
                    start = mid  +1;
                }
            }
            return false;
        }

}
