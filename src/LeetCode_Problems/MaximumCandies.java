package LeetCode_Problems;

public class MaximumCandies {
    public static void main(String[] args) {
        int[] can = {4,7,5};
        int[] can1 = {5,8,6};
        int[] can2 = {2,4};
        System.out.println(maximumCandies(can2 , 11));
        System.out.println(maximumCandies(can1 , 3));
        System.out.println(maximumCandies(can,4));
    }
    public static int maximumCandies(int[] candies, long k) {
        int start = 0;
        int end = 0;
        int ans = 0;
        for(int can:candies){
            end = Math.max(end , can);
        }
        while(start <= end){
            int mid = start + (end - start) /2;
            boolean flag = check(candies, k , mid);
            if(flag){
                end = mid - 1;
            }
            else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean check(int[] candies, long k, int mid) {
        if(mid == 0){
            return false;
        }
        long sum = 0;
        for(int can: candies){
            int num = can/mid;
            sum +=num;
        }
        if(sum >= k)   return false;

        return true;
    }
}
