package Sliding_Window;

public class LargestSubarrayOfSumK {
    public static void main(String[] args) {
        int[] arr1 = {4, 1, 1, 1, 2, 3, 5};
        int[] arr2 = {10, 5, 2, 7, 1, 9};
        int[] arr3 = {1, 4, 3, 3, 5, 5};
        System.out.println(MaxLength(arr3  , 16));
    }
    public static int MaxLength(int[] arr, int target){
        int i = 0;
        int j =0 ;
        int sum = 0;
        int max= 0;
        while(j < arr.length){
            sum += arr[j];
            if(sum > target){
                while(sum > target){
                    sum -= arr[i];
                }
            }
            if(sum < target){
                j++;
            }
            else if(sum == target){
                max = Math.max(j - i + 1, max);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
