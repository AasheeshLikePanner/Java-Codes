package Contest;

public class maxPairUSm {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{51,71,17,24,42}));
    }
    public static int maxSum(int[] nums) {
        int max = 0;
        for(int i  = 0; i < nums.length; i++){
            int num = nums[0];
            int val = 0;
            while(num != 0){
                val = Math.max(num % 10 , val);
                num /= 10;
            }
            for(int j = i + 1 ; j < nums.length;j++){
                if(helper(val, nums[j])){
                    max = Math.max(max, nums[i] + nums[j]);
                }
            }
        }
        return max;
    }

    private static boolean helper(int val, int num) {
        int max = 0;
        while(num != 0){
            max = Math.max(num % 10 , max);
            num /= 10;
        }
        return max == val;
    }
}
