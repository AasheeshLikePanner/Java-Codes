package Sliding_Window;

public class MaximmumSumOfSubArrays {
    public static void main(String[] args) {
        int[] array = {2,5,1,8,2,9,1};
        System.out.println("Maximum Sum of subArray is: " + maximum(array , 3));
        System.out.println("Minimum Sum of SubArray is: "+ minimum(array, 3));
    }

    private static int minimum(int[] arr ,int k){
        int start =0 ;
        int end  = 0;
        int min = Integer.MAX_VALUE ;
        int sum = 0;
        while(end < arr.length){
            sum+=arr[end];
            if(end - start + 1 > k){
                sum -= arr[start];
                min = Math.min(sum,min);
                start++;
            }
            if(end - start + 1 <= k){
                end++;
            }
        }
        return min;
    }
    private static int maximum(int[] arr ,int k){
        int start =0 ;
        int end  = 0;
        int max= 0 ;
        int sum = 0;
        while(end < arr.length){
            sum+=arr[end];
            if(end - start + 1 > k){
                sum -= arr[start];
                max = Math.max(sum,max);
                start++;
            }
            if(end - start + 1 <= k){
                end++;
            }
        }
        return max;
    }
}
