package Contest;

public class LOngestAlternating {
    public static void main(String[] args) {
        int[] arr=  {2,3,4,3,4};
        System.out.println(alternatingSubarray(arr));
        System.out.println(alternatingSubarray(new int[]{4,5,6}));
    }
    public static int alternatingSubarray(int[] nums) {
        int m = nums.length;
        if(m <= 1)  return 0;
        int max = 0;
        for(int i = 0; i < m ;i++){
            int prev = nums[i];
            boolean flag = true;
            for(int j= i + 1;j < m ; j++){
                if(flag && nums[j] - prev != 1){
                    break;
                }
                else if(!flag && nums[j] - prev != -1){
                    break;
                }
                flag = !flag;
                prev = nums[j];
                max = Math.max(max, j - i  + 1);
            }
        }
        return max;
    }
}
