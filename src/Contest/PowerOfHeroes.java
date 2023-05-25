package Contest;

public class PowerOfHeroes {
    public static void main(String[] args) {
        int[] arr= {2,1,4};
        System.out.println(sumOfPower(arr));
    }

    public static int sumOfPower(int[] nums) {
        findsubsequences(nums , 0,0,Integer.MAX_VALUE);
        return sum;
    }
    static int sum = 0;
    static int mod = 1000000007;
    private static void findsubsequences(int[] nums, int index , int max , int min)
    {
        if (index == nums.length) {
            sum += ((max*max) * min) % mod;
            return;
        }
        findsubsequences(nums, index + 1, Math.max(nums[index] , max), Math.min(nums[index] , min));

        findsubsequences(nums , index + 1, max ,min);
    }
}
