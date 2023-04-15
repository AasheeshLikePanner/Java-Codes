package LeetCode_Problems;

public class LimitOfBallsInBag {
    public static void main(String[] args) {
        int[] arr1 = {1,3,7};
        int[] arr2 = {2,4,8,2};
        System.out.println(minimumSize(arr1, 3));
        System.out.println(minimumSize(arr2 , 4));
    }
    public static int minimumSize(int[] nums, int maxOperations) {
        int ans = 0;
        int start = 1;
        int end = Integer.MAX_VALUE;
        while(start < end){
            int mid = start + (end - start)/2;
            boolean flag = check(nums, maxOperations, mid);
            if(flag){
                end = mid;
            }
            else{
                start = mid + 1;
            }

        }
        return start;
    }
    private static boolean check(int[] nums, int max, int mid) {
        int sum = 0;
        for(int can:nums) sum += (can - 1)/mid ;
        return sum <= max;
    }
}
