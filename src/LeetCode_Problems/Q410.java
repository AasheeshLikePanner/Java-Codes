package LeetCode_Problems;

public class Q410 {
    public static void main(String[] args) {
        int[] nums1 = {7,2,5,10,8};
        int[] nums2 = {1,2,3,4,5,6};
        System.out.println(splitArray(nums1 , 2));
        System.out.println(splitArray(nums2, 3));
    }

    public static int splitArray(int[] nums, int k) {
        int ans = 0;
        int start = 0;
        int end =0 ;
        for (int can:nums) {
            start = Math.max(start , can);
            end += can;
        }
        while(start < end){
            int mid = start + (end - start)/2;
            if(helper(nums , mid) < k){
                ans = mid;
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    private static int helper(int[] nums, int mid) {
        int days = 0;
        int temp = 0;
        for (int can:nums) {
            if(temp + can > mid){
                days++;
                temp = 0;
            }
            temp += can;
        }
        return days;
    }

}
