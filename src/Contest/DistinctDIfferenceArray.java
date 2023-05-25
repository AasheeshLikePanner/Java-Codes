package Contest;

import java.util.Arrays;
import java.util.HashMap;

public class DistinctDIfferenceArray {
    public static void main(String[] args) {
        int[] res = {1,2,3,4,5};
        System.out.println(Arrays.toString(fan(res)));
    }
    public static int[] fan(int[] nums) {
        HashMap<Integer , Integer> one = new HashMap<>();
        HashMap<Integer , Integer> two = new HashMap<>();
        for (int num : nums) {
            if (two.containsKey(num)) {
                two.put(num, two.get(num) + 1);
            } else {
                two.put(num, 1);
            }
        }
        int[] res=  new int[nums.length];
        for(int i = 0;  i < nums.length ; i++ ){
                two.put(nums[i] ,two.get(nums[i] ) - 1);
            if(two.get(nums[i]) == 0){
                two.remove(nums[i]);
            }
            if(one.containsKey(nums[i])){
                one.put(nums[i],one.get(nums[i]) + 1 );
            }
            else{
                one.put(nums[i] ,1);
            }
            res[i] = one.size() - two.size();

        }
        return res;
    }
}
