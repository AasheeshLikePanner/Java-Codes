package LeetCode_Problems;

import java.util.HashMap;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] can1 = {0,1,2,2,4,4,1};
        System.out.println(mostFrequentEven(can1));
    }
    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int can:nums){
            if(hash.containsKey(can)){
                int of = hash.get(can);
                int in = of + 1;
                hash.put(can , in);
            }
            else{
                if(can%2 == 0){
                    hash.put(can , 1);
                }
            }
        }
        int max = 0;
        int key = 0;
        int result = Integer.MAX_VALUE;
        for (int can:nums) {
            if(can %2 ==0&& (hash.get(can) != null && hash.get(can) >= max)){
                max = hash.get(can);
                key = can;
            }
            if(can%2 == 0&& (hash.get(can) != null && hash.get(can) == max)){
                if(result > key){
                    max = hash.get(can);
                    result = key;
                }
            }
        }
        if(key == 0){
            return - 1;
        }
        return result;
    }
}
