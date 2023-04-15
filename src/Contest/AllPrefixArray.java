package Contest;

import java.util.Arrays;

public class AllPrefixArray {
    public static void main(String[] args) {
        int[] test1 = {2,3,7,5,10};
        int[] test2 = {1,1,2,4,8,16};
        System.out.println(Arrays.toString(prefix(test2)));
    }
    public static long[] prefix(int[] nums) {
        long sum = 0;
        long max = 0;
        long first = 0;
        long[] result = new long[nums.length];
        int i = 0;
        for(int can: nums){
            max = Math.max(max,can);
            first = max + can;
            result[i] = sum + first;
            sum += first;
            i++;
        }
        return result;
    }
}
