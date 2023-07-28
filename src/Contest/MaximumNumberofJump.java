package Contest;

public class MaximumNumberofJump {
    public static void main(String[] args) {
//        System.out.println(maximumJumps(new int[]{1,3,6,4,1,2},2));
//        System.out.println(maximumJumps(new int[]{1,3,6,4,1,2}, 3));
//        System.out.println(maximumJumps(new int[]{1,3,6,4,1,2}, 0));
        System.out.println(maximumJumps(new int[]{1,0,2}, 1));
    }
    public static int maximumJumps(int[] nums, int target) {
        int count = 0;
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length - 1){
                flag = true;
                break;
            }
            boolean check = false;
            for (int j = i + 1; j< nums.length; j++){
                if(nums[j] - nums[i] <= target && (-target) <= nums[j] - nums[i]){
                    i = j - 1;
                    count++;
                    check = true;
                    break;
                }
            }
            if(!check)  return -1;
        }
        if(!flag)   return -1;
        return count;
    }
}
