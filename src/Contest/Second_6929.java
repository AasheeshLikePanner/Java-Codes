package Contest;

import java.util.HashMap;

public class Second_6929 {
    public static void main(String[] args) {
        System.out.println(maximumBeauty(new int[]{52,34},21));
    }
    public static int maximumBeauty(int[] nums, int k) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n , 0 ) + 1);
            map.put(n - k, map.getOrDefault(n - k, 0 ) + 1);
            map.put(n  + k, map.getOrDefault(n + k, 0 ) + 1);
        }
        for(int val:map.values()){
            res = Math.max(res, val);
        }
        return res;
    }
}
