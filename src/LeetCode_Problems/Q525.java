package LeetCode_Problems;

public class Q525 {
    public static void main(String[] args) {
        int[] can1 = {1,0,1,1,0,1,0,1};
        int[] can2 = {0,1};
        System.out.println(findMaxLength(can2));
    }
    public static int findMaxLength(int[] nums) {
        int start = 0;
        int end = nums.length;
        int length = 0;
        int result = 0;
        for(int i = 0 ; i<nums.length  - 1; i++ ) {
            start = i;
            while (start < end) {
                if (check(nums, start, end)) {
                    length = end - start;
                    result = Math.max(length ,result);
                    if (end + start == nums.length ) {
                        return result;
                    }
                    end--;
                } else {
                    end--;
                }
            }
        }
        return length;
    }

    private static boolean check(int[] can ,int start , int end) {
        int ans = 0;
        int man = 0;
        for (int i = start ;  i < end; i++) {
            man = can[i];
            if(man == 0){
                man =2;
            }
            ans ^= man;
        }
        return ans == 0;
    }
}
