package Contest;

public class MaximumOr {
    public static void main(String[] args) {
        int[] ans = {12 , 9};
        int[] arr2 ={98,54,6,34,66,63,52,39,62,46,75,28,65,18,37,18,97,13,80,33,69,91,78,19,40,2};
//        int[] ans = {8,1,2};
        System.out.println(maximumOr(arr2 , 2));
    }

    public static long maximumOr(int[] nums, int k) {
        long sum = 0;
        long max = 0;
        for(int num:nums){
           sum += num;
        }
        for(int num:nums){
            long rem = sum - num;
            int t= k;
            while(t > 0){
                num *= 2;
                t--;
            }
            max= Math.max(num|rem, max);
        }
        return max;
    }
}
